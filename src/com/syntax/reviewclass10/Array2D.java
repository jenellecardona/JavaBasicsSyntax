package com.syntax.reviewclass10;

public class Array2D {
	public static void main(String[] args) {

		String[][] cities = { { "New York", "Albany", "Buffalo" },
				{ "Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding" },
				{ "Miami", "Orlando", "Niceville", "Tampa" }, { "Mclean", "Richmond", "Leesburg", }, };
		System.out.println(cities[1][2]);
		System.out.println("I want to go to " + cities[2][0]);
		System.out.println("Total number of 1D arrays in cities = " + cities.length);

		System.out.println("Number of elements in 1st array = " + cities[0].length);
		System.out.println("Number of elements in 1st array = " + cities[1].length);
		
		System.out.println("For Loop");
		System.out.println();
		for (int row = 0; row < cities.length; row++) {
			for (int col = 0; col < cities[row].length; col++) {
				System.out.print(cities[row][col]+" ");
			}System.out.println();
		}
		System.out.println("Enhanced");
		System.out.println();
		for(String[] city:cities) {
			for(String c:city) {
				System.out.println(c+" ");
			}System.out.println();
			
		}

	}

}
