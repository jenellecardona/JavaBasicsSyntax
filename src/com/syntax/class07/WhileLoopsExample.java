package com.syntax.class07;

public class WhileLoopsExample {
public static void main(String[] args) {
	//print numbers 1 to 10
	int num=1;
	while(num<=10) {
		//num++(2,3,4,5,6,7,8,9,10,11)
		System.out.println(num);
		num++;
	}System.out.println("PART 2");
	//print number from 10-100
	
	int a=10;
	
	while(a<=100) {
		System.out.println(a);
		a++;
	}System.out.println("PART 3");
	//Print numbers from 10-1
	int b=10;
	while(b>=1) {
		System.out.println(b);
		b--;
	}System.out.println("PART 4");
	
	//print numbers from 100 to 50
	int c=100;
	while(c>=50) {
		System.out.println(c);
		c--;
	}System.out.println("PART 5");
	//numbers from -1 to -10
	
	int num2=-1;
	while(num2>=-10) {
		System.out.println(num2);
		num2--;
	}System.out.println("PART 6");
	
	//print numbers from 1 to 20 but only even numbers
	int d=2 ;
	while(d<=20) {
		if(d%2==0) {System.out.println(d);}
		d++;
	}System.out.println("PART 7");
	
	//Print even numbers from 20 to 100
	int e=20;
	while(e<=100){
		if(e%2==0){System.out.print(e+" ");}
		e++;
	}
	
	//Print only odd numbers from 100 to 1
	System.out.println("PART 8");
	int f=100;
	while(f>=1) {
		if(f%2==1) {System.out.print(f+" ");}
		f--;
	}

	//another way
	int g=101;
	while(g>=1) {
		System.out.println(g+" ");
		g-=2;
	}
	
	
		}
	
}


