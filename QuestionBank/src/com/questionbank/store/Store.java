package com.questionbank.store;

import java.util.TreeMap;

import com.questionbank.service.Question;

public class Store {

	private static TreeMap<Integer, Question> STORE = new TreeMap<>();

	public static TreeMap<Integer, Question> getStore() {
		return STORE;
	}
	
	public static void saveQuestion(Question question) {
		STORE.put(STORE.size() + 1 , question);
	}
	
	public static boolean removeQuestionById(int id) {
		if (STORE.containsKey(id)) {
			STORE.remove(id);
			for (int qid = id; STORE.containsKey(qid + 1); qid++) {
				STORE.put(qid,STORE.get(qid + 1));
			}
			STORE.remove(STORE.size());
			return true;
		}
		return false;
	}
	
}
