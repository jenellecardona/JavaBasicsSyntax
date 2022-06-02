package com.syntax.class06;

import java.util.Scanner;

public class HomeworkGrade2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String grade, explan;

		System.out.println("Please enter grade below");
		grade = scan.next();

		switch (grade) {
		case "A":
			explan = "Excellent";
			break;
		case "B":
			explan = "Good";
			break;
		case "C":
			explan = "Average";
			break;
		case "D":
			explan = "Bad";
			break;
		default:
			explan = "Not Acceptable";
		}
		scan.close();
		
		System.out.println("The grade you enter is " + grade + " which is " + explan);

	}

}
