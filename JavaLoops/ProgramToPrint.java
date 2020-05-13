package com.wbl.javaloops;


/* Write a program print "fizz" if a number is divisible by 3,
 * "buzz" if a number is divisible by 5, and "fizz buzz" if number is divisible by both, else print the number. */

public class ProgramToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,5,15,41};
		
		int num;
		int remainder1;
		int remainder2;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			num = arr[i];
			remainder1 = num % 3;
			remainder2 = num % 5;
		
			if(remainder1==0 && remainder2==0)
			{
				System.out.println("fizz buzz");
			}
			else if(remainder1 == 0)
			{
				System.out.println("fizz");
			}
			else if(remainder2 == 0)
			{
				System.out.println("buzz");
			}
			else
			{
				System.out.println("The number :" + num +" is not divisible by 3 or 5");
			}
		}//for loop
	}

}


/* output:
fizz
buzz
fizz buzz
The number :41 is not divisible by 3 or 5
*/
