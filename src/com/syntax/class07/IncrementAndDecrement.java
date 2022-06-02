package com.syntax.class07;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		
		int x=10;
		x=x+1;
		x+=1;
		
		System.out.println(x);//12
		
		x++;//increments value of a variable by 1
		System.out.println(x);//13
		x--;//decrements value of a variable by 1
		System.out.println(x);//12
		
		//increment and decrement operators only work variable
		/*10++; CE: Invalid argument to operation
		 * 
		 */
		System.out.println("PART 2");
		//Print even numbers from 20 to 100
		int e=20;
		while(e<=100);{
			if(e%2==0){System.out.println(e);}
			e++;
		}
	}

}
