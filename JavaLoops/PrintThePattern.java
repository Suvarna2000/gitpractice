package com.wbl.javaloops;

//Write a program that prints a pattern like below.
//* 
//** 
//*** 
//**** 
//***** 
//****** 

public class PrintThePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<6; i++)
		{
			for(int j=0; j<i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


/* output:

*
**
***
****
*****
******

*/