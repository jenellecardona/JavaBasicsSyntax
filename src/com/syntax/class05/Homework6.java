package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter in your quiz score");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter in your mid term score");
		int midTerm=scan.nextInt();
		
		System.out.println("Please enter in your final score");
		int finals=scan.nextInt();
		
		int average=(quiz+midTerm+finals)/3;
		
		if(average>=90) {System.out.println("Grade=A");}
		else if(average>=70&&average<=90){System.out.println("Grade=B");}
		else if(average>=50&&average<=70){System.out.println("Grade=C");}
		else if(average<=50){System.out.println("Grade=F");}
		
		scan.close();
		
	}

}
