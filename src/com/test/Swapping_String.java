package com.test;

public class Swapping_String 
{

	public static void main(String[] args) 
	{
		String str1 = "shivmala balaji chinchale balaji pandurang chinchale";
		String str2 = "Om Namah Shivay Java Programming";
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("str1 = " +str1);
		System.out.println("str2 = " +str2);
	}

}