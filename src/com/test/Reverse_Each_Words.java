package com.test;


public class Reverse_Each_Words 
{
    public static void main(String[] args) 
	{
		String str = "Shivmala Balaji Chinchale";
		String words[]=str.split(" ");
		String rev="";
		
		
		for(String w:words)
		{
			String rev_words="";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				rev_words+=	w.charAt(i);
			}
			rev+=rev_words+" ";
		}
		System.out.println(rev);
	}
}
