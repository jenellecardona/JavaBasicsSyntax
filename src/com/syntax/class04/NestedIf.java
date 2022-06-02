package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;

		if (vaccine) {
			System.out.println("Let me check how many does you have");
			if (dose == 1) {
				System.out.println("You need 1 more shot");
			} else {
				System.out.println("You are fully vaccinated");
			}
		}
		System.out.println("--------------------------");

		String month = "May";
		int date = 19;

		if (month.equals("May")) {
			System.out.println("Let me check today's date");
			if (date == 8) {
				System.out.println("Today is mother's day!");
			}

		} else if (month.equals("June")) {
			System.out.println("Let me check today's date");
			if (date == 19) {
				System.out.println("Today is father's day");
			}
		}

	}
}
