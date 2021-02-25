package com.kctech.assesment;

class Foo 
{
public Foo() 
{ 
doSomething(); 
} 
public void doSomething() 
{ 
System.out.println("do something acceptable");
} 
} 
public class Bar extends Foo 
{
public void doSomething() 
{ 
System.out.println("yolo"); 
Zoom zoom = new Zoom(this); //This statement is wrong
} 
}
