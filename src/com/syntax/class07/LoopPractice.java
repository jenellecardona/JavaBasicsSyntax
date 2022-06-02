package com.syntax.class07;

import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<6; i++) {
		sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("----------");
		
		//write a program to find sum of all even and all odd numbers
		/*from 1-70
		 * 
		 */
		
		int sumEven=0;
		int sumOdd=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sumEven+=i;}
		else {sumOdd+=i; }}
		
		System.out.println("sum of all even numbers is "+ sumEven);
		System.out.println("sum of all even numbers is "+ sumOdd);	
		
		/*
		 * declare a secret number
		 * you want to ask user to guess your secret number
		 * your code should keep asking until user gets the secret number
		 */
		
		Scanner scan=new Scanner(System.in);
		int guess=0;		
		int num=5;
		
		do {
		System.out.println("Guess my secret number");
		guess=scan.nextInt();}
		while(guess!=5);
		scan.close();
		
		System.out.println("You got it my secret number is "+num);
			
		boolean summer=true;
		int temp=95;
		
		while(summer) {
			System.out.println("Its hot out");
			if(temp<70) {
				System.out.println("Its not hot anymore");
				break;
			}temp-=10;
		}
	
		
		
	}
	}

