package com.syntax.class05;

import java.util.Scanner;

public class WeekdayVsWeekend {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	int day=5;
	
	if(day==1||day==2||day==3||day==4||day==5) {System.out.println("It is a weekday");}
	else if(day==6 ||day==7){System.out.println("Its a weekend");}
	else {System.out.println("Invalid day");}
	scan.close();

	}
	}
