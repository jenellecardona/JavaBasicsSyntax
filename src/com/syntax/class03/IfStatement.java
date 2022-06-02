package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * declare variable rate
		 * if rate is more than 5 -->"I am not buying the house"
		 */
		double mortgageRate=4.5;
		
		if (mortgageRate>5){ 
			System.out.println("I am not buying a house");}
		if (mortgageRate<5){ 
			System.out.println("I am buying a house");}
		
		/*
		 * declare 2 variable and check if num1 is bigger than num2
		 */
		int num1=99;
		int num2=10;
		
		if(num1>num2) { System.out.println(num1+" is bigger than "+num2);}
		
		/*
		 * declare tempature
		 * if temp is higher than 75 ->I will go on a walk
		 * else=otherwise
		 */
		int temp=70;
		
		if(temp>75) {System.out.println("I will go on a walk");}
		else {System.out.println("I will stay indoors");}
		
		char gender='f';
		if (gender=='f') {System.out.println("You like shopping");}
		else {System.out.println("You like watching sports");}
		
		///String Values- do not use relational operators
		String browser="chrome";
		if(browser.equals("chrome")) {System.out.println("All test cases will be executed on chrome");}
		else {System.out.println("I am not executing any tests cases");}
	}

}
