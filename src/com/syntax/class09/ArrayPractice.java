package com.syntax.class09;

public class ArrayPractice {
	public static void main(String[] args) {
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		System.out.println("---Second Way---");
		
		char[] grade2= {'a', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grade2[1]);
		
		
		
	}

}
