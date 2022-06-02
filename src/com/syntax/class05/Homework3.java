package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many years have you been with your company?");
		int years = scan.nextInt();

		System.out.println("What is your anual salary?");
		int salary = scan.nextInt();

		if (years >= 5) {
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligable for the bonus");
		}
		scan.close();

	}

}
