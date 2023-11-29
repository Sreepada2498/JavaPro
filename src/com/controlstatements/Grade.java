package com.controlstatements;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first exam score: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter the second exam score: ");
        int score2 = scanner.nextInt();

        scanner.close();

        if (score1 >= 50) {
            if (score2 >= 50) {
                System.out.println("Congratulations! You have passed both exams.");
            } else {
                System.out.println("Sorry, you have failed the second exam.");
            }
        } else {
            System.out.println("Sorry, you have failed the first exam.");
        }
	}

}
