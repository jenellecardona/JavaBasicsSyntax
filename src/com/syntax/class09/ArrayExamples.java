package com.syntax.class09;

public class ArrayExamples {
	public static void main(String[] args) {
		
		double[] price=new double[3];
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);//output will be 0.0 because nothing was stored in price[0]
		
		//I want to store prices in array
		
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		// numbers[3]=13; array index out of bound exception. This happens because you only requested 3 index not 4
		
		System.out.println("---Second Example---");
		String[] fruits= {"mango", "apple", "kiwi","pear"};
		
		System.out.println("My favorite fruit is "+fruits[2]);
		//fruits[4]="peach"; "out of bounds exception
		
		//I want to find a size of an array/how many elements
		int size=fruits.length;
		System.out.println(size);
		
	}

}
