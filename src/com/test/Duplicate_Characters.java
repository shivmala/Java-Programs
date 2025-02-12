package com.test;

public class Duplicate_Characters 
{

	public static void main(String[] args) 
	{
		String str = "Shivmala Balaji chinchale";
		char ch[]=str.toCharArray();
		int count=0;
		
		
		for(int i=0; i<=str.length()-1; i++)
		{
		 count=1;
			
			for(int j=i+1; j<=str.length()-1; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='0';
					count++;
				}
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.print(ch[i]);
			}
		}

	}

}
