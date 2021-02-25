package com.kctech.assesment2;

import java.util.*; 
public class Test10 { 
	public static void main(String[] args) 
	{ 
		TreeMap<Integer, String> m = 
		new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0); 
		m.put(1, "Mohammed"); 
		m.put(4, "Harfan"); 
		m.put(5, "Basha"); 
		m.put(2, "Zayn"); 
		m.put(3, "Java"); 
		System.out.println("Elements of the TreeMap " + "after sorting are : " + m); 
	} 
} 

