package com.examgenerator.service;

import java.util.List;
import java.util.TreeMap;

import com.examgenerator.store.ExamStore;
import com.questionbank.service.IQuestionBankService;
import com.questionbank.service.Question;

public class ExamGeneratorServiceImpl implements IExamGeneratorService {

	IQuestionBankService questionBankService;
	
	public ExamGeneratorServiceImpl(IQuestionBankService questionBankService) {
		this.questionBankService = questionBankService;
	}

	@Override
	public TreeMap<Integer, String> getExamsTitles() {
		TreeMap<Integer, String> examTitlesListWithId = new TreeMap<>();
		
		for (int i = 1; ExamStore.getExamStore().size() >= i; i++) {
			String examTitle =  ExamStore.getExamStore().get(i).getTitle();
			examTitlesListWithId.put(i, examTitle);
		}
		return examTitlesListWithId;
	}

	@Override
	public Exam getExamById(int id) {
		return ExamStore.getExamById(id);
	}

	@Override
	public void createNewExam(String title, List<Question> questionsList) {
		ExamStore.saveExam(new Exam(title, questionsList));
	}

	@Override
	public void createNewExam(String title, int noOfQuestions) {
		List<Question> questionsList = questionBankService.getRandomQuestionsWithAnswers(noOfQuestions);
		ExamStore.saveExam(new Exam(title, questionsList));
		
	}

}
