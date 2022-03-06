package com.examgenerator.service;

import java.util.List;
import java.util.TreeMap;

import com.questionbank.service.Question;

public interface IExamGeneratorService {
	public void createNewExam(String title, List<Question> questionsList);
	public void createNewExam(String title, int noOfQuestions);
	public TreeMap<Integer, String> getExamsTitles();
	public Exam getExamById(int id);

}
