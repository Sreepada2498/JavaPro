package com.controlstatementexercises;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter an integer
	        System.out.print("Enter an integer: ");

	        // Read the input integer from the user
	        int number = scanner.nextInt();

	        // Close the Scanner to prevent resource leak
	        scanner.close();

	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println("Positive");
	        } else if (number < 0) {
	            System.out.println("Negative");
	        } else {
	            System.out.println("Zero");
	        }
	    }
	
		

	}

