package com.syntax.class04;

public class IfElse {

	public static void main(String[] args){
		//declare 2 numbers and verify which one is largest
		
		int num1=20;
		int num2=20;
		
		if(num1>num2) {System.out.println(num1+" is larger than "+num2);}
		else if (num2>num1){System.out.println(num2+" is larger than "+num1);}
		else {System.out.println(num1+" is equal to "+num2);}
		
		//the moment java find true condition it exe that statement.
		/*all others are ignored once a true statement is found
		 * 
		 */
		
	
	
	}
}
