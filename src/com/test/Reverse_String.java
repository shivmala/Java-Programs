package com.test;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji Chinchale";
		char ch[] = str.toCharArray();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			// rev+=str.charAt(i);
			
			rev+=ch[i];
		}
		System.out.println(rev);
	}

}
