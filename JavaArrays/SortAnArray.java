package com.wbl.arrays;

import java.util.Arrays;

//. Write a program to sort an array

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = {23, 48, 3, 29, 99, 78, 36};
		
		Arrays.sort(arr);
		
		for(int z: arr)
		{
			System.out.println(z);
		}
		
	}
}

/* output:
 3
23
29
36
48
78
99
*/