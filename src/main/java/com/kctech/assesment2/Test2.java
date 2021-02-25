
package com.kctech.assesment2;

interface NewInterface { 

	// static method 
	static void hello() 
	{ 
		System.out.println("Hello, New Static Method Here"); 
	} 

	// Public and abstract method of Interface 
	void overrideMethod(String str); 
} 

public class Test2 implements NewInterface { 

	public static void main(String[] args) 
	{ 
		Test2 interfaceDemo = new Test2(); 

		NewInterface.hello(); 

	} 
	@Override
	public void overrideMethod(String str) 
	{ 
		System.out.println(str); 
	} 
} 

