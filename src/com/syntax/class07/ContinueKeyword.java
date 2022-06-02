package com.syntax.class07;

import java.util.Scanner;

public class ContinueKeyword {
public static void main(String[] args) {
	/* 
	 * Keyword Continue- it skips current exe or iteration
	 * when java exe continue jumps back to the beginning of the loop
	 * so the rest of the code inside loop body will be ignored
	 */
	for(int i=1; i<=10;i++) {
		if(i%2==0) {
			continue;
		}System.out.print(i);
	}
	
	System.out.println(" ");
	//print number from 1 to 10 except numbers 5 & 7
	for(int i=1; i<=10; i++) {
		if(i==5||i==7) {
			continue;
		}System.out.print(i+" ");
	}
	
	System.out.println("     ");
	//TASK 1
	for(int i=1; i<=50; i++) {
		if(i%3==0) {
			continue;
		}System.out.print(i+" ");
	}

	System.out.println("     ");
	//TASK 2
	Scanner scan=new Scanner(System.in);
	String quest="Yes";
	do {
		System.out.println("Would you like to apply for a credit card?");
		quest=scan.next();
	}while(!quest.equalsIgnoreCase("Yes"));
	scan.close();


}
}
