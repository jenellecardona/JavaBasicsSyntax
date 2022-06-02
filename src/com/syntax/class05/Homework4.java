package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is the current time?(Please use 24hrs format)");
	int time=scan.nextInt();
	
	if(time>=1&&time<=11) {System.out.println("Its the Morning");}
	else if (time>=12&&time<=15) {System.out.println("Its the Afternoon");}
	else if (time>=16&&time<=20) {System.out.println("Its the Evening");}
	else if (time>=21&&time<=24) {System.out.println("Its Night");}
	scan.close();
}
}
