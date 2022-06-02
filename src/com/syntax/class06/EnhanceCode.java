package com.syntax.class06;

import java.util.Scanner;

public class EnhanceCode {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter in your quiz score");
		int quiz = scan.nextInt();

		System.out.println("Please enter in your mid term score");
		int midTerm = scan.nextInt();

		System.out.println("Please enter in your final score");
		int finals = scan.nextInt();

		int average = (quiz + midTerm + finals) / 3;

		System.out.println("Your average score is " + average);
		char grade;

		if (average >= 90) {
			grade = 'A';
		} else if (average >= 70 && average <= 90) {
			grade = 'B';
		} else if (average >= 50 && average <= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("You are a " + grade + " student");

		if (grade == 'A' || grade == 'B') {
			System.out.println("You are doing great");
		} else {
			System.out.println("Please try to study more");
		}
		scan.close();

	}
}
