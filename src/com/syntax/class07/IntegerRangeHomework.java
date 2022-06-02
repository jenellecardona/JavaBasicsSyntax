package com.syntax.class07;

import java.util.Scanner;

public class IntegerRangeHomework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int start, end;

		System.out.println("Please enter a start point below");
		start = scan.nextInt();

		System.out.println("Please enter a end point below");
		end = scan.nextInt();

		int evenSum = 0;
		int oddSum = 0;
		int a = start;
		int b = end;

		for (a = start; a <= end; a++) {
			if (a % 2 == 0) {
				evenSum += a;
			}
			
		for (b = start; b <= end; a++) {
			if (a % 2 != 0) {
				oddSum += b;
			}
		}
		System.out.println("The sum of the even numbers is " + evenSum);
		System.out.println("The sum of the even numbers is " + oddSum);
	}
}}
