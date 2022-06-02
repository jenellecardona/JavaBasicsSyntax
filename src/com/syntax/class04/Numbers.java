package com.syntax.class04;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number below");
		int num1=scan.nextInt();
		
		System.out.println("Please enter a different number than the one you entered above");
		int num2=scan.nextInt();
		
		if (num1>num2) {System.out.println(num1+" is greater than "+num2);}
		else if(num1<num2) {System.out.println(num2+" is greater than "+num1);}
		}
		
	}


