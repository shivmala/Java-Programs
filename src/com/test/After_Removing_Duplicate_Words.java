package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class After_Removing_Duplicate_Words 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji Chinchale Balaji Chinchale Pandurang";
		String words[]=str.split(" ");
		
	Set<String> set = new LinkedHashSet<>();	
	
	    for(int i=0; i<=words.length-1; i++)
	    {
	    	set.add(words[i]);
	    }
	    System.out.println("After_Removing_Duplicate_Numbers : ");
	    
	    for(String s:set)
	    {
	    	System.out.print(s+" ");
	    }
	    
	}

}
