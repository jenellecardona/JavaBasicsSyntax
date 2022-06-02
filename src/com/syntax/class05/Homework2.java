package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String city=scan.next();
		
		System.out.println("Please enter the temperature");
		int temp=scan.nextInt();
		
		int cel=(temp-32)*5/9;
		
		System.out.println("The temperature in "+city+" is "+cel);
		scan.close();
		
			
	}

}
