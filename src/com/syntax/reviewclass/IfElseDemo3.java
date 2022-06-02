package com.syntax.reviewclass;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your account balance");
		double accountBalance = scan.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend = scan.nextDouble();

		if (accountBalance >= amountToLend) {
			System.out.println("Yes I can help you");
		} else {
			System.out.println("Sorry I do not have enough money to help you");
		}
		scan.close();

	}

}
