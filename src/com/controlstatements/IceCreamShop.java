 package com.controlstatements;

import java.util.Scanner;

public class IceCreamShop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome to the IceCream Shop!");
        System.out.println("1.Chocolate");
        System.out.println("2.Butterscotch");
        System.out.println("3.Vanilla");
        System.out.println("4.Strawberry");

        System.out.print("Enter your choice:");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered a Chocolate. Enjoy your Chocolate IceCream!");
                break;
            case 2:
                System.out.println("You ordered a Butterscotch. Enjoy your Butterscotch IceCream!");
                break;
            case 3:
                System.out.println("You ordered a Vanilla. Enjoy your Vanilla IceCream!");
                break;
            case 4:
                System.out.println("You ordered a Strawberry. Enjoy your Strawberry IceCream!");
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

	}

}
