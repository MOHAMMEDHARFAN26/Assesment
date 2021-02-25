package com.kctech.assesment3;

import java.util.*; 
public class Test8 {
    public static void main(String[] args) {
	{ 
		List<String> myList = new ArrayList<>();
                myList.add("A");
                myList.add("D");        
                myList.add("C");
                myList.add("B");
                myList.sort(Comparator.comparing(s -> s));
                myList.forEach(System.out::println);
	} 
} 
}
