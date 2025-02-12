package com.test;

public class Armstrong_Number 
{

	public static void main(String[] args) 
	{
		int num=407;
		int sum=0;
	    int temp=num;
		
		while(num>0)
		{
			sum+=Math.pow(num%10, 3);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+ " is a armstrong number");
		}
		else
		{
			System.out.println(temp+ " is not a armstrong number");
		}
	}

}
