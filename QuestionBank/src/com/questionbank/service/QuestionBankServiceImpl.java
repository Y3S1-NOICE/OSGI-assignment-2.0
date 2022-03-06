package com.questionbank.service;

import java.util.TreeMap;
import com.questionbank.model.Question;
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
	public TreeMap<Integer, Question> getQuestionsWithAnswers(String type) {
		return Store.getStore();
	}

}
