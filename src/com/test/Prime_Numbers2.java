package com.test;

public class Prime_Numbers2 
{

	public static void main(String[] args) 
	{
         int ar[]= {3,5,1,8,5,78,44,11,31,89,98};
         int temp=0;
         
    for(int i=0; i<=ar.length-1; i++)
    {
    	for(int j=2; j<=ar[i]-1; j++)
        {
       	   if(ar[i]%j==0)
       	   {
       		  temp++;
           }
        }
       if(temp==0)
       {
       	  System.out.println(ar[i]);
       }
       else
       {
       	 temp=0;
       }
        
    }
        
  }

}
