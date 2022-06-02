package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {
public static void main(String[] args) {
	/*we are going to ask you if you got a job
	 * we will continueously ask you until you say yes
	 * once you say yes --> Congratulations!
	 */
	Scanner scan=new Scanner(System.in);
	String answer;
	
	do{
		System.out.println("Did you get a job?");
	answer=scan.next();
	}while(!answer.equals("yes"));
	System.out.println("Congratulations!");	 
	scan.close();
		
	
	
}
}
