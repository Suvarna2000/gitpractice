package com.wbl.javaloops;

/* Write a program to check if a given number is prime or not.*/
//prime number is a number only divisible by itself ex.2,3,5,7,11,13,17 and 1
//and it can not be a product of two smaller numbers.

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 41;
		boolean flag = false;
		
		if ((num==1) || (num == 2))
		{
			System.out.println("Its a prime number");
			System.out.println("i am here.....1");
			return;
		}
		
		for(int i=2; i<num; i++)
			{
				if(num%i == 0)
				{
					flag = true;
					System.out.println("Its not a prime number");
					System.out.println("i am here.....2");
					break;
					
				}
				
			}	
		
		if(flag == false)
		{
			System.out.println("Its a prime number");
			System.out.println("I am here.....3");
		}
	}
}

/* output:
Its a prime number
I am here.....3        
*/

