package com.coursecontent.service;

import java.util.TreeMap;

import com.coursecontent.model.Content;
import com.coursecontent.store.ContentStore;

public class CourseContentServiceImpl implements ICourseContentService {

	@Override
	public void addContent(String title, String content) {
		ContentStore.saveContent(new Content(title, content));
	}

	@Override
	public boolean deleteContentById(int id) {
		return ContentStore.removeContentById(id);
	}

	@Override
	public TreeMap<Integer, Content> getAllCourseContents() {
		return ContentStore.getContentStore();
	}

}
