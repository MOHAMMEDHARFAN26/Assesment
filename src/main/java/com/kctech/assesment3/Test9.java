package com.kctech.assesment3;

// Java program to convert a HashMap 
// to an ArrayList 

import java.util.*; 
import java.util.Map.*; 

public class Test9 { 
	public static void main(String[] args) 
	{ 
		// Create an empty hash map 
		HashMap<String, Integer> map 
			= new HashMap<>(); 

		// Add elements to the map 
		map.put("vishal", 10); 
		map.put("sachin", 30); 
		map.put("vaibhav", 20); 

		// Set of the entries from the 
		// HashMap 
		Set<Entry<String, Integer> > entrySet 
			= map.entrySet(); 

		// Creating an ArrayList of Entry objects 
		ArrayList<Entry<String, Integer> > listOfEntry 
			= new ArrayList<Entry<String, Integer> >(entrySet); 

		System.out.println(listOfEntry); 
	} 
} 
