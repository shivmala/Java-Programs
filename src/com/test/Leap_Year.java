package com.test;

public class Leap_Year 
{

	public static void main(String[] args) 
	{
		int year=1944;
		
		if(year%4==0 || year%400==0)
		{
			System.out.println("Year is a leap year");
		}
		else
		{
			System.out.println("Year is not a leap year");
		}
	}

}
