package com.devlabs.selenium.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearntList {
	
	
//	private static boolean boolean contains;

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Ram");
		list.add("Sam");
		list.add("Dan");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		list.remove(1);
//		System.out.println(list);
		list.set(1, "Gani"); // It will replace the second name
		
		boolean contains = list.contains("ram");
		
		list.clear();
		list.isEmpty();
		
		 Collections.sort(list);// it will be in ascending order
		 Collections.reverse(list );
		
		
		
		
	}

}
