package com.syntax.class04;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		
		Scanner fetch=new Scanner(System.in);
		
		System.out.println("What's your first name?");
		String name=fetch.next();
		
		System.out.println("Whats's your age?");
		int age=fetch.nextInt();
		
		System.out.println("What's your senior quote?");
		String quote=fetch.next();
		quote+=fetch.nextLine();
		
		System.out.println("My name is "+name+" and I am "+age+" years old "+", my senior quote is "+quote);
		fetch.close();
		
		
		
		
		
		
		
		
		
		
	}

}
