package com.test;

public class Duplicate_Words 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji chinchale Balaji";
		String words[]=str.split(" ");
		
		
		for(int i=0; i<=words.length-1; i++)
		{
			int count=1;
			
			for(int j=i+1; j<=words.length-1; j++)
			{
				if(words[i].equals(words[j]))
				{
					words[j]="0";
					count++;
				}
			}
			if(count>1 && words[i]!="0")
			{
				System.out.print(words[i]);
			}
		}

	}

}
