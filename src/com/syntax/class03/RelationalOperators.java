package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// >, <, >=, <=, ==, !=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2);//false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true
		
		System.out.println(num1==num2);//no=true
		System.out.println(num1=num2); //value gets changed to 22
		
		System.out.println(num1==num2);//true

		//relation operators are used in conditional statements (example: if statement)
	}

}
