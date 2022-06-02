package com.syntax.reviewclass;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		System.out.println("Please enter your name");
		String name=scan.next();
		name+=scan.nextLine();
		
		System.out.println("Enter a quote");
		String quote=scan.next();
		
		System.out.println(name+" is "+age);
	
		scan.close();
			
		
	}

}
