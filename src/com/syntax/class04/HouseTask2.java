package com.syntax.class04;

public class HouseTask2 {
	public static void main(String[] args) {

		double morgRate = 4.2;
		int price = 275000;

		if (morgRate > 4.5) {
			System.out.println("The buyer does not want to purchase the home, the rate is too high");
			if (price > 50000) {
				System.out.println("I will take out a loan");
			} else if (price < 50000) {
				System.out.println("I'd like to pay in cash");
			}
		} else {
			System.out.println("The buyer would like to purchase the house!");
		}
		if (price > 50000) {
			System.out.println("I will take out a loan");
		} else if (price < 50000) {
			System.out.println("I'd like to pay in cash");
		}

	}

}
