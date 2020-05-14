package com.wbl.arrays;

//Write a program to find the common number in any given two arrays.

public class CommonNumInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr1 = {1,45,23,15,75,89,67};
		Integer [] arr2 = {45,76,89,12,23,94,1,39,40};
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}

}

/* output
1
45
23
89
*/