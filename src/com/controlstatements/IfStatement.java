package com.controlstatements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number1 value");
		int number1 = scan.nextInt();
		
		System.out.println("enter the number2 value");
		int number2  = scan.nextInt();
		
		if (number1 > number2) {
			System.out.println("number1 is greater than number2");
		}
	}
}
