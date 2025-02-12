package com.test;

import java.util.HashMap;
import java.util.Map;

public class Number_Of_Characters 
{
    public static void main(String[] args) 
    {
		String str = "Shivmala Balaji Chinchale";
		char ch[] = str.toCharArray();
		
	Map<Character, Integer> map = new HashMap<>();
	
	   
	    for(int i=0; i<=ch.length-1; i++)
	    {
	    	if(map.containsKey(ch[i]))
	    	{
	    	   map.put(ch[i], map.get(ch[i])+1);	
	    	}
	    	else
	    	{
	    	   map.put(ch[i], 1);	
	    	}
	    }
	    System.out.println(map);
			
	 }
}
