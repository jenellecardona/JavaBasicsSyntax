package com.syntax.class09;

public class ArrayIntro {
	public static void main(String[] args) {
		//array is fixed in size
		/* during runtime JAVA can not increase or decrease a size of an array
		 * 
		 */

		// create an array
		int[] b = new int[4];

		// store values
		b[0] = 90;
		b[1] = 85;
		b[2] = 70;
		b[3] = 100;

		// access values from my array
		System.out.println(b[2]);// 70
		
		System.out.println(b[1]+b[3]);//185
		
		System.out.println("---Second Example---");
		
		//we need to create an array of my classmates names
		//when we create an array we must specify the size(how many elements to store)
		String[] c=new String[5];
		
		c[0]="Krystyna";
		c[1]="Zameer";
		c[2]="Elexia";
		c[3]="Oleg";
		c[3]="Adem";
		
		System.out.println("My classmates name is"+c[3]);
				
	}
}
