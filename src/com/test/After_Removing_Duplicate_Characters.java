package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class After_Removing_Duplicate_Characters 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji Chinchale";
		char ch[]=str.toCharArray();
		
	Set<Character> set = new LinkedHashSet<>();	
	
	    for(int i=0; i<=ch.length-1; i++)
	    {
	    	set.add(ch[i]);
	    }
	    System.out.println("After_Removing_Duplicate_Numbers : ");
	    
	    for(char s:set)
	    {
	    	System.out.print(s);
	    }
	    
	}

}
