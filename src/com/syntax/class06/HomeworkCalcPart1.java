package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalcPart1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, result;
		char operator;

		System.out.println("Please enter a number below");
		num1 = scan.nextInt();
		System.out.println("Please enter a number below");
		num2 = scan.nextInt();
		System.out.println("Please select the operator you'd like to use (+,-,*,/);");
		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
		default:
			result = 0;
		}
		System.out.println(result);
		scan.close();

	}

}
