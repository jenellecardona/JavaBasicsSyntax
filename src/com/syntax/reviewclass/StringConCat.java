package com.syntax.reviewclass;

public class StringConCat {
	public static void main(String[] args) {
		String first="Jenelle";
		String last="Cardona";
		String fullname=first+last;
		int num1=10;
		int num2=10;
		
		System.out.println(fullname);//JenelleCardona
		System.out.println(first+num1);
		System.out.println(first+num1+num2);
		System.out.println(first+(num1+num2));
	}
	
}
