package com.controlstatements;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the age of voting");
		int age=scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("eligable for voting ");
		}
		else
		{
			System.out.println("not eligable for voting");
		}

	}

}
