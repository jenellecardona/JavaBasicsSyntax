package com.syntax.class03;

public class AdditionOrConcatenation {
	
	public static void main(String[] args) {
		
		int a, b;
		a=10;
		b=20;
		String c, d;
		c="Hello";
		d="Hi";
		
		System.out.println(a+b+c+d);
		System.out.println(a+c+b+d);
		System.out.println(c+d+a+b);//if it begins with string everything that follows will be string
		System.out.println(c+d+(a+b));//order or operation; if parentheses are included those will be added first.
		
	
		
		
		
		
		
		
	}

}
