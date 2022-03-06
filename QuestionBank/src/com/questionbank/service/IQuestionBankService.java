package com.questionbank.service;

import java.util.HashMap;
import java.util.TreeMap;

import com.questionbank.model.Question;

public interface IQuestionBankService {
	public void addQuestionWithAnswer(String question, String answer);
	public boolean deleteQuestionWithAnswerById(int id);
	public TreeMap<Integer, Question> getQuestionsWithAnswers(String type);
}
