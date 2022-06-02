package com.syntax.class07;

public class DoWhile {
	public static void main(String[] args) {
		int num1=1;
		do {
			System.out.println(num1+" ");
			num1++;
		}while(num1<=3);
		
		//print even numbers from 70 to 30
		int a=70;
		do {
			System.out.print(a+" ");
			a-=2;
		}while(a>=30);
		
	}

}