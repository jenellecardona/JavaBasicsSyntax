package com.syntax.class05;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if(num>=1 && num<=10) {System.out.println("Small");}
		else if(num>=11 && num<=100){System.out.println("Medium");}
		else if(num>=101&&num<=1000){System.out.println("Large");}
		
		scan.close();
	}

}
