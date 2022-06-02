package com.syntax.class05;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your birthday month");
		String month = scan.next();

		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in season Spring");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			System.out.println("You were born in season Summer");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println("You were born in season Fall");
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			System.out.println("You were born in season Winter");
		}
		scan.close();
	}

}
