package com.syntax.class03;

public class TempatureCheck {

	public static void main(String[] args) {
		int temp = 70;
		if (temp < 32) {
			System.out.println("Water will freeze with tempature " + temp);
		} else {
			System.out.println("Water will NOT freeze with tempature " + temp);
		}

		/*
		 * without curly braces ut will only allow 1 statement per block
		 * 
		 */
		String time = "Morning";
		if (time.equals("Morning")) {
			System.out.println("Say Good Morning");
		} else {
			System.out.println("Say Good Day");
			System.out.println("Or say good evening");
		}
	}

}