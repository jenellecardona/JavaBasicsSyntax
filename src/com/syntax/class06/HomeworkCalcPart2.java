package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalcPart2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2, result;
		result = 0;
		char operator;
		String error=null;

		System.out.println("Please enter a number below");
		num1 = scan.nextInt();
		System.out.println("Please enter a number below");
		num2 = scan.nextInt();
		System.out.println("Please select the operator you'd like to use (+,-,*,/);");
		operator = scan.next().charAt(0);

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		}else {
			error="invalid";
		}
		if(result!=0 || error==null) {System.out.println(result);}
		scan.close();
		}

	}

