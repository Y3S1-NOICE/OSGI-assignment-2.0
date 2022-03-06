package com.examgenerator.store;

import java.util.TreeMap;

import com.examgenerator.service.Exam;

public class ExamStore {
	private static TreeMap<Integer, Exam> EXAM_STORE = new TreeMap<>();

	public static TreeMap<Integer, Exam> getExamStore() {
		return EXAM_STORE;
	}
	
	public static void saveExam(Exam exam) {
		EXAM_STORE.put(EXAM_STORE.size() + 1 , exam);
	}
	
	public static boolean removeExamById(int id) {
		if (EXAM_STORE.containsKey(id)) {
			EXAM_STORE.remove(id);
			for (int qid = id; EXAM_STORE.containsKey(qid + 1); qid++) {
				EXAM_STORE.put(qid,EXAM_STORE.get(qid + 1));
			}
			EXAM_STORE.remove(EXAM_STORE.size());
			return true;
		}
		return false;
	}
	
	public static Exam getExamById(int id) {
		return EXAM_STORE.get(id);
	}
}
