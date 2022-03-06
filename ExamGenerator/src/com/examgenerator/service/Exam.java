package com.examgenerator.service;

import java.util.List;

import com.questionbank.service.Question;

public class Exam {
	private String title;
	private List<Question> questionsList;
	
	public Exam(String title, List<Question> questionsList) {
		this.title = title;
		this.questionsList = questionsList;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestionsList() {
		return questionsList;
	}
	public void setQuestionsList(List<Question> questionsList) {
		this.questionsList = questionsList;
	}
}
