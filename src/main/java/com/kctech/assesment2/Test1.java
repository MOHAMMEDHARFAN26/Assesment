/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kctech.assesment2;

 import java.util.Scanner; //Program uses Scanner class 
 public class Test1 
 { 
      public static void main(String[] args) 
      { 
         int n,num,sum=0, i; 
         //create scanner object to obtain input from keyboard 
         Scanner input =new Scanner(System.in); 
         n =input.nextInt(); //read total numbers 
         for(i=1;i<=n; i++) 
             { 
                  num=input.nextInt(); //input number 
                  sum += num; 
             } 
          double average=(double)sum/n; 
          System.out.println("Average of " + n + " Numbers = " + average); 
          
      } 
 }