package com.coursecontent.service;

import java.util.TreeMap;

import com.coursecontent.model.Content;

public interface ICourseContentService {
	public void addContent(String title, String content);
	public boolean deleteContentById(int id);
	public TreeMap<Integer, Content> getAllCourseContents();
}
