package com.wbl.javaloops;

/*Write a program that prints a fibonaci series that is a sequence of numbers 
like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning 
you can print 10 numbers or 15 or 20 or any desired number. */

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int num1 = 1;
		int num2;
		
		System.out.println(num);
		System.out.println(num1);
		
		for(int i=0; i<=10; i++)
		{
			num2 = num + num1;
			System.out.println(num2);
			
			num = num1;
			num1 = num2;
		}
	}

}
