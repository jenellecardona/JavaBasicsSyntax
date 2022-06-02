package com.syntax.class04;

public class MoreNested {
	public static void main(String[] args) {
		boolean didRepl = true;
		int assignments;
		assignments = 14;
		if (didRepl) {
			System.out.println("How many assignments have you do?");
			if (assignments > 15) {
				System.out.println("You did a great job!");
			} else if (assignments > 10) {
				System.out.println("You did a good job!");
			} else {
				System.out.println("Please complete all repl assignments.");
			}

		}
	}
}
