package com.syntax.class05;

import java.util.Scanner;

public class DmvTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		if(age>=18) {System.out.println("You can receive a drivers license");
		}else {System.out.println("You can get a learners permit");}
		scan.close();
		
	}

}
