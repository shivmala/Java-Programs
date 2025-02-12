package com.test;

public class Fabonacci 
{
    public static void main(String[] args) 
	{
		int a=0;
		int b=1; 
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<=10; i++)
		{
			int count=a+b;
			System.out.println(count);
			
			a=b;
			b=count;
		}
	}

}
