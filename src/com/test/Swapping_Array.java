package com.test;

import java.util.Arrays;

public class Swapping_Array 
{

	public static void main(String[] args) 
	{
		int ar1[]= {2,5,1,3,6,8};
		int ar2[]= {4,9,1,4,7,4};
		
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			ar1[i]=ar1[i]-ar2[i];
			ar2[i]=ar1[i]+ar2[i];
			ar1[i]=(-ar1[i])+ar2[i];
		}

		System.out.println("ar1[]= " +Arrays.toString(ar1));
		System.out.println("ar2[]= " +Arrays.toString(ar2));
	}

}
