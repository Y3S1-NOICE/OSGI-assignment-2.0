package com.questionbank.service;

import java.util.List;
import java.util.TreeMap;

public interface IQuestionBankService {
	public void addQuestionWithAnswer(String question, String answer);
	public boolean deleteQuestionWithAnswerById(int id);
	public TreeMap<Integer, Question> getQuestionsWithAnswers();
	public List<Question> getRandomQuestionsWithAnswers(int noOfQuestions);
}
