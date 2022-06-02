package com.syntax.class09;

public class EnhancedLoop {
	public static void main(String[] args) {
		
		/*Enhanced for loop/Advanced loop/For each loop
		 * can be used only when we work with array OR collections
		 * 
		 */
		
		String[] colorList= {"Purple", "Blue", "Black", "White"};
		for(String color:colorList) {
			System.out.print(color+" ");
		}
		
		System.out.println("---Second Example---");
		
		System.out.println("What are your prices?");
		
		double[] priceList= {20.99, 40.99, 60.99, 80.99};
		
		for(double price:priceList) {
			System.out.println(price+"  ");
		}
		
	}

}
