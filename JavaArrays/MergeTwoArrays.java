package com.wbl.arrays;

import java.util.ArrayList;

//Write a program to merge 2 arrays. 

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr1 = {1,2,3,4,5};
		Integer [] arr2 = {6,7,8,9,10};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<arr1.length; i++)
		{
			arr.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			arr.add(arr2[i]);
		}
		
		arr.stream().forEach(System.out::print);
	}

}

/*Output
12345678910
*/