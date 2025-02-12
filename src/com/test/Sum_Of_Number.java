package com.test;

public class Sum_Of_Number 
{
	public static void main(String[] args) 
	{
		int num=32236;
		int sum=0;
	
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			
			if(sum>9 && num==0)
			{
				num=sum;
				sum=0;
			}
		}
		
		System.out.println("sum : " +sum);
		
	}

}
