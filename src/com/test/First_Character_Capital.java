package com.test;

public class First_Character_Capital 
{

	public static void main(String[] args) 
	{
		String str = "shivmala balaji chinchale balaji pandurang chinchale";
		String words[]=str.split(" ");
		
		for(int i=0; i<=words.length-1; i++)
		{
			String str1 = words[i].substring(0,1).toUpperCase()+
					      words[i].substring(1, words[i].length());
			
			
			System.out.print(str1+" ");
		}
	}

}
