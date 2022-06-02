package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the loan amount needed?");
		int amount=scan.nextInt();
		
		if(amount<200000) {System.out.println("Your loan has been approved");}
		else {System.out.println("Your loan has been rejected");}
		scan.close();
	}

}
