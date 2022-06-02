package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) {
		/*
		 * lets ask user where he is from based on the county we will define favorite
		 * food
		 */
		Scanner scan = new Scanner(System.in);

		String country, favoriteFood;

		System.out.println("Please tell me where you are from");
		country = scan.nextLine();

		switch (country.toUpperCase()) {
		case "Mexico":
			favoriteFood = "Tacos";
			break;
		case "Canada":
			favoriteFood = "Poutine";
			break;
		case "Turkey":
			favoriteFood = "Lahmacun";
			break;
		case "Pakistan":
			favoriteFood = "Pati Chai";
			break;
		case "Egypt":
			favoriteFood = "Koshary";
			break;
		case "USA":
			favoriteFood = "Burgers";
			break;
		default:
			favoriteFood = "Unknown";
		}
		System.out.println("Youa re from "+country+" and your favorite food is "+favoriteFood);
		scan.close();

	}
}
