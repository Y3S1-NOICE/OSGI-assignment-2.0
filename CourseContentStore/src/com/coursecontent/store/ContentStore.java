package com.coursecontent.store;

import java.util.TreeMap;

import com.coursecontent.model.Content;

public class ContentStore {

	private static TreeMap<Integer, Content> CONTENT_STORE = new TreeMap<>();

	public static TreeMap<Integer, Content> getContentStore() {
		return CONTENT_STORE;
	}
	
	public static void saveContent(Content content) {
		CONTENT_STORE.put(CONTENT_STORE.size() + 1 , content);
	}
	
	public static boolean removeContentById(int id) {
		if (CONTENT_STORE.containsKey(id)) {
			CONTENT_STORE.remove(id);
			for (int qid = id; CONTENT_STORE.containsKey(qid + 1); qid++) {
				CONTENT_STORE.put(qid,CONTENT_STORE.get(qid + 1));
			}
			CONTENT_STORE.remove(CONTENT_STORE.size());
			return true;
		}
		return false;
	}
	
}