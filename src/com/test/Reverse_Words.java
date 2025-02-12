package com.test;

public class Reverse_Words 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji Chinchale";
		String words[]=str.split(" ");
		String rev="";
		
		for(int i=words.length-1; i>=0; i--)
		{
			rev+=words[i]+" ";
		}
		System.out.println(rev);
	}
}
