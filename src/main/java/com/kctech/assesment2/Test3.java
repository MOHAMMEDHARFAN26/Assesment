/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kctech.assesment2;

import java.util.*; 

class Test3 { 
	public static void main(String[] args) 
	{ 
		List<Integer> list = new ArrayList<Integer>(); 

		list.add(5); 
		list.add(3); 
		list.add(4); 
		list.add(55); 
		list.add(2);  
		System.out.println(sum(list)); 
	} 

	public static int sum(List<Integer> list) 
	{ 
		return list.stream().filter(i -> i > 5).mapToInt(i -> i).sum(); 
	} 
} 

