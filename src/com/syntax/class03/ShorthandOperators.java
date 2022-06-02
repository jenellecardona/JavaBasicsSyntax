package com.syntax.class03;

public class ShorthandOperators {
	
	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		
		num=num+50;
		System.out.println(num);//250
		num+=100;//num=num+100
		
		num-=10;//num=num-10
		System.out.println(num);//340
		
		num/=10;
		num*=2;
		
		System.out.println(num);//68
		
		num%=2;
		System.out.println(num);//0
		
		int a=10;
		int b=20;
		int c=30;
		
		a+=b;//30
		System.out.println(a);
		
		a+=b+c;//80
		System.out.println(a);
		
		a*=10;
		System.out.println(a);//800                   
		
		String w="Practice Exercise";    
				System.out.println(w);
		
				//Task1
				int var1=100;
				var1+=500;
								
				var1+=200;
				System.out.println(var1);
				
				//Task2
				int var2=90;
				var2-=60;
				System.out.println(var2);
				
				//Task3
				int cakePiece=11;
				cakePiece/=4;
				System.out.println(cakePiece);
				
				//Task4
				int cake=25;
				System.out.println(cake/7);
				cake%=7;
				System.out.println(cake);
		
		
	}

}
