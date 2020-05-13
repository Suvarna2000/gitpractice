package com.wbl.javaloops;

/* Write a program to check an armstrong number i.e. whether the if we power up the each individual number 
 * to the total number of digits in the number and add them it should be equal to the number itself. 
 * For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153. FYI: ^ means is to the power. */

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 153;
		int x;
		int y = 10;
		int sum = 0;
		int num = number;
		
		while(num!=0)
		{
			x = num% y;
			sum = sum + (x*x*x);
			num = num / 10;
		}
		
		System.out.println("The Sum of cube of 3 digits of a given number is : "+sum);
		
		if(number == sum)
			System.out.println(number+" is a Armstrong number");
		else
			System.out.println("Its not a armstrong number");
	}
}

/*output:
The Sum of cube of 3 digits of a given number is : 153
153 is a Armstrong number
*/
