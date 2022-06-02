package com.syntax.reviewclass10;

public class Task {
	public static void main(String[] args) {
		
		System.out.println("---TASK# 1---");
		
		char[] characters= {'!', '@', '#', '$', '%'};
		
		for(int i=characters.length-1; i>=0; i--) {
			System.out.println(characters[i]);
		}
		
		System.out.println("---TASK# 2---");
		
		int[] numbers= {5, 6, 7};
		
		int largest=numbers[0];
		
		for(int i=0; i<numbers.length; i++ ) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		System.out.println(largest+" is the largest number");
	}

}

