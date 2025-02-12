package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class After_Removing_Duplicate_Numbers 
{

	public static void main(String[] args) 
	{
		int ar[]= {4,1,5,3,1,8,6,4,2,1,6,2};
		
	Set<Integer> set = new LinkedHashSet<>();	
	
	    for(int i=0; i<=ar.length-1; i++)
	    {
	    	set.add(ar[i]);
	    }
	    System.out.println("After_Removing_Duplicate_Numbers : ");
	    System.out.println(set);
	}

}
