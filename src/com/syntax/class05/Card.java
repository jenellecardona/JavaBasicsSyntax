package com.syntax.class05;

import java.util.Scanner;

public class Card {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a credit card?");
		boolean card = scan.nextBoolean();

		if (card) {
			System.out.println("Do you have a balance?");
			String ans = scan.next();
			if (ans.equalsIgnoreCase("yes")) {
				System.out.println("What is the balance?");
			}
			int bal = scan.nextInt();
			if (bal >= 1000) {
				System.out.println("Please pay off your card");
			} else {
				System.out.println("Spend more!");
				scan.close();
			}
		}

	}

}
