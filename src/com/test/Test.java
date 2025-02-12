package com.test;


public class Test 
{
   public static void main(String[] args) 
   {
	   Demo d = (a, b) ->
	   {
		   int result=a+b;
		   System.out.println("result: " +result);
		   return result;
	   };
	   d.add(45,90);
			  
			   
	   
   }
}


@FunctionalInterface
interface Demo
{
	int add(int a, int b);
}
