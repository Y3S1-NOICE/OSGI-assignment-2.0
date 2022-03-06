package com.questionbank.helper;

import java.util.ArrayList;
import java.util.List;

public class Helper {

	public static List<Integer> getRandomNumbers(int size) {
		List<Integer> numberList = new ArrayList<>();
		int randomNumber;
		    
		for (int i = 0; size > i; i++) {
			randomNumber = (int) ((Math.random() * (size - 1)) + 1);
		    if(numberList.contains(randomNumber)) {
		    	i--;
		    	continue;
		    } else {
		    	numberList.add(randomNumber);
		    }
		}
		return numberList;
	}
	
	
}
