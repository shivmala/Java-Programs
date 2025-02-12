package com.test;

public class Prime_Numbers3 
{

	public static void main(String[] args) 
	{
         int temp=0;
         
    for(int i=0; i<=10; i++)
    {
    	for(int j=2; j<=i-1; j++)
        {
       	   if(i%j==0)
       	   {
       		  temp++;
           }
        }
       if(temp==0)
       {
       	  System.out.println(i);
       }
       else
       {
       	 temp=0;
       }
        
    }
        
  }

}
