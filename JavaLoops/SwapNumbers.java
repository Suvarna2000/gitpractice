package com.wbl.javaloops;

/* Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program. 
 * --> One Function should swap the numbers without any third new variable. 
 * --> Second function should swap the numbers using a third variable. */

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 1;
		
		System.out.println("swapping two numbers : " +num1 +" and " +num2);
		
		swapTwoNum(num1,num2);
		swapWithVar(num1, num2);
	}	
		
	public static void swapTwoNum(int a,int b)
	{
			System.out.println("Without using third variable");
			
			a= a-b;
			b = a+b;
			a = b-a;
			
			System.out.println("Swapped numbers : "+a +"," +b);
			
	}
	
	public static void swapWithVar(int a, int b)
	{
		System.out.println("Swapping the numbers using third variable");
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Swapped numbers : " +a +","+b);	
	}
	

}

/*output :
	swapping two numbers : 5 and 1
	Without using third variable
	Swapped numbers : 1,5
	Swapping the numbers using third variable
	Swapped numbers : 1,5 */

