package com.syntax.class04;

public class NestingTask1 {
	public static void main(String[] args) {

		// Task 1
		boolean diploma = true;
		double gpa = 4.0;
		if (diploma) {
			System.out.println("Congrats!");
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship!");
			} else {
				System.out.println("You should have studied harder.");
			}
		} else {
			System.out.println("You should get a degree");
		}

		

	}

}