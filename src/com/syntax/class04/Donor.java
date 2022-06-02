package com.syntax.class04;

public class Donor {
	public static void main(String[] args) {
		int age = 21;
		int weight = 145;

		if (age > 18) {
			System.out.println("You meet the age requirements.");
			if (weight > 110) {
				System.out.println("You are eligable to donate blood!");
			}else {System.out.println("You are not eligable to donate blood.");}

		}else {System.out.println("You do not meet the age requirement.");}

	}
}
