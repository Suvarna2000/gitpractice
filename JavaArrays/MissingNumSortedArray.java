package com.wbl.arrays;

//Write a program to find the missing number in a series of sorted numbers stored in an array. 

public class MissingNumSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = {1,2,3,4,5,6,8,9,10}; // array of 1st 10 numbers.
		
		for(int i=0; i<arr.length-1; i++)
		{
			if((arr[i] +1) != (arr[i+1]))
			{
				System.out.println("The missing number is : "+(arr[i]+1));
			}
		}
		
	}
}

/* Output:
The missing number is : 7
*/
