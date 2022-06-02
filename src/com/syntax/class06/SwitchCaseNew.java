package com.syntax.class06;

public class SwitchCaseNew {
	public static void main(String[] args) {
		int day = 3;
		String name;

		if (day == 1) {
		name = "Monday";
		} else if (day == 2) {
		name = "Tuesday";
		} else if (day == 3) {
		name = "Wednesday";
		} else if (day == 4) {
		name = "Thursday";
		} else if (day == 5) {
		name = "Friday";
		} else if (day == 6) {
		name = "Saturday";
		} else if (day == 7) {
		name = "Sunday";
		} else {
		name = "Invalid";
		}

		System.out.println(name);

		System.out.println(" -------------------------------- ");
		
		switch(day) {
		case 1: 
			name="Monday";
		case 2: 
			name="Tuesday";
		case 3: 
			name="Wednesday";
		case 4: 
			name="Thursday";
		case 5: 
			name="Friday";
		case 6: 
			name="Saturday";
		case 7: 
			name="Sunday";
		default:// it can be anywhere in block of code {}
			name="Invalid";
			break;
		}
		
		System.out.println(name);
	}

}
