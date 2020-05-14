package com.wbl.arrays;

//Write a program to find the largest number in a given array. 

public class LargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = {23,67,83,102,543,234,345,452,523,41};
		int largest=arr[0];
		
		for(int i=1; i<arr.length-1; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		
		System.out.println("The largest number of the given Array is : "+largest);
	}

}

/*
The largest number of the given Array is : 543
*/