package com.syntax.class07;

public class NestedLoop {
public static void main(String[] args) {
	for(int i=1; i<=3; i++) { //outer loop
		System.out.println("Hello");
		for(int y=1; y<=2; y++) { //inner loop
			System.out.println("Bye");
		}
	}
	
	for(int a=0; a<=9; a++) {
		for(int b=0; b<=9; a++);
		for(int c=0; c<=9; c++);
	}
	
}

}
