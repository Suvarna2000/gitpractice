package com.wbl.arrays;

import java.util.Arrays;

//Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.

public class SwapAndSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arrorig = {1,2,5,6,4};
		int x = arrorig.length;
				
		Integer [] arr = Arrays.copyOf(arrorig,x);
		Integer [] sortarr = new Integer [x];
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			sortarr[i] = arr[i];
		}
		
		System.out.print("The elements not in the order are : ");
		for(int i=0; i<arrorig.length; i++)
		{
			if (arrorig[i]!=sortarr[i])
			{
				System.out.print(arrorig[i]+" ");
			}
		}
		System.out.println();
		System.out.print("The correct order of the array is :");
		for(int z: sortarr) {
		System.out.print(" " +z);
		}
		
	}

}

/*Output :
The elements not in the order are : 5 6 4 
The correct order of the array is : 1 2 4 5 6
 */
