package com.test;

public class Prime_Numbers 
{

	public static void main(String[] args) 
	{
         int num=89;
         int temp=0;
         
        for(int j=2; j<=num-1; j++)
        {
        	 if(num%j==0)
        	 {
        		 temp++;
             }
        }
        if(temp==0)
        {
        	System.out.println(num+ " is a prime number");

        }
        else
        {
        	System.out.println(num+ " is not a prime number");
        }
    }
}
