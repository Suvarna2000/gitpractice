package com.wbl.javaloops;

/* Write a program to calculate factorial of a given number. 
 * You need to compute the factorial with one logic that uses recursion and another logic without recursion. */


public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 6;
		int factorial = 1;
		
		for(int i=1; i<=num; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of "+num +" = " +factorial);
	}

}

//output : Factorial of 6 = 720
