package com.syntax.reviewclass;

import java.util.Scanner;

public class ScannerWhileLoopDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num1=0;
		
		while(num1!=10) {
			System.out.println("Enter a number");
			num1=scan.nextInt();
			System.out.println(num1+2);
		}
		scan.close();
		
	}

}
