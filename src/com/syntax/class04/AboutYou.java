package com.syntax.class04;

import java.util.Scanner;

public class AboutYou {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("First name?");
		String firstName=scan.next();
		
		System.out.println("Last Name?");
		String lastName=scan.next();
		
		System.out.println("Where do you live?");
		String state=scan.next();
		state+=scan.nextLine();
		
		System.out.println(firstName+" "+lastName+" lives in "+state);
		scan.close();
	}

}
