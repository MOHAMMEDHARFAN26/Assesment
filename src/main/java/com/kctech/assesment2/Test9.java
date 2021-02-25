
package com.kctech.assesment2;

interface TestInterface 
{ 
	// abstract method 
	public void square(int a); 

	// default method 
	default void show() 
	{ 
	System.out.println("Default Method Executed"); 
	} 
} 

class Test9 implements TestInterface 
{ 
	// implementation of square abstract method 
        @Override
	public void square(int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		Test9 d = new Test9(); 
		d.square(4); 

		// default method executed 
		d.show(); 
	} 
} 

