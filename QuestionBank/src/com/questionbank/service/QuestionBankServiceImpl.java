package com.questionbank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.questionbank.helper.Helper;
import com.questionbank.store.Store;

public class QuestionBankServiceImpl implements IQuestionBankService {

	@Override
	public void addQuestionWithAnswer(String question, String answer) {
		Store.saveQuestion(new Question(question, answer));
	}

	@Override
	public boolean deleteQuestionWithAnswerById(int id) {
		return Store.removeQuestionById(id);
	}

	@Override
	public TreeMap<Integer, Question> getQuestionsWithAnswers() {
		return Store.getStore();
	}

	@Override
	public List<Question> getRandomQuestionsWithAnswers(int noOfQuestions) {
		int noOfExsitingQuestions = Store.getStore().size();
		List<Integer> questionIds;
		List<Question> questionList = new ArrayList<>();

		if (noOfExsitingQuestions >= noOfQuestions) {
			questionIds = Helper.getRandomNumbers(noOfQuestions);
		} else {
			questionIds = Helper.getRandomNumbers(noOfExsitingQuestions);
		}
		
		for (int id : questionIds) {
			questionList.add(Store.getStore().get(id));
		}
		
		return questionList;
	
	}
	
	
}
