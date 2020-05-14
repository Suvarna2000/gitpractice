package com.wbl.arrays;

//Write a program to perform a linear search on any given array.
//Linear search is the basic search where you look for the element to be searched in a sequential way. 

//Step 1: Traverse the array. 
//Step 2: Match the key element with array element. 
//Step 3: If key element is found, return the index position of the array element.
		
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//step1 : Traverse the array
		System.out.println("The array element from array are : ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i]+",");
		}
		
		//Step 2: Match the key element with array element. 
		System.out.println();
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==5)
			{
				System.out.println("The key element from array is :"+arr[i]);
			}
		}
		
		//Step 3: If key element is found, return the index position of the array element.
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==7)
			{
				System.out.println("The key element is at index position :"+i);
			}
		}
	}

}

/*
The array element from array are : 
1,2,3,4,5,6,7,8,9,10,
The key element from array is :5
The key element is at index position :6
*/
