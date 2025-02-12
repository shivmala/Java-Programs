package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Number_of_Words 
{
    public static void main(String[] args) 
    {
		String str = "Shivmala Balaji Chinchale Balaji Pandurang Chinchale";
		String words[]=str.split(" ");
		
	Map<String, Integer> map = new LinkedHashMap<>();
	
	   
	    for(String w:words)
	    {
	    	Integer s= map.get(w);
	    	
	    	if(s==null)
	    	{
	    		map.put(w, 1);
	    	}
	    	else
	    	{
	    		map.put(w, s+1);
	    	}
	    }
	    System.out.println(map);
	}
}
