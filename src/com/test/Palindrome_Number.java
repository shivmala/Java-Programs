package com.test;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		int num=3223;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			sum=(sum*10)+num%10;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+ " is a palindrome number");
		}
		else
		{
			System.out.println(temp+ " is not a palindrome number");
		}
	}

}
