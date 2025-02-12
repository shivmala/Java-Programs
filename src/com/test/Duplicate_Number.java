package com.test;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_Number 
{
     public static void main(String[] args)
     {
		int ar[]= {4,1,5,3,1,8,6,4,2,1,6,2};
		
	List<Integer> list = new ArrayList<>();	
	
		for(int i=0; i<=ar.length-1; i++)
		{
			for(int j=i+1; j<=ar.length-1; j++)
			{
				if(ar[i]==ar[j])
				{
					if(list.contains(ar[i]))
					{
						break;
					}
					else
					{
						list.add(ar[i]);
					}
					System.out.println(ar[i]);
				}
			}
		}
	 }
}
