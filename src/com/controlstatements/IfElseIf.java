package com.controlstatements;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Maths Marks");

		int Mathmarks = scan.nextInt();
		System.out.println("Enter the Physics Marks");

		int Physicsmarks = scan.nextInt();
		System.out.println("Enter the Biology Marks");

		int Biologymarks = scan.nextInt();
		float totalmarks = Mathmarks + Physicsmarks + Biologymarks;
		
		System.out.println("totalmarks=" +totalmarks);
		float percentage=totalmarks/3;

	    System.out.println("float percentage=" + percentage);

		if(percentage>80) {
			System.out.println("A grade");
		} 
		else if(percentage>70) {
			System.out.println("B grade");
		}
		else if(percentage>60) {
			System.out.println("C grade");
		}
		else if(percentage>50)
		{
			System.out.println("D grade");	
		}
		else if(percentage>35)
		{
			System.out.println("E grade");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
