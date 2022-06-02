package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {
		/*
		 * Tuesday & Wednesday ->Manual testing Thurs->Review Sat & Sun ->Java
		 */

		String day = "Monday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Ihave manual class");
		} else if (day.equals("Thursday")) {
			System.out.println("I have review class");
		} else if (day.equals("Staurday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}

	}

}
