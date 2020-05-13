package com.wbl.javaloops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Write a program that accepts input from the command line and then prints them. 

public class CommandLineInput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter the name: ");
		String str = br.readLine();
		
		try {
			System.out.println("Entered String is :" +str);
	
		}
		catch(Exception e) {
			System.out.println("Invalid string");
		}
		
	}

}
