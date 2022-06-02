package com.syntax.class06;

import java.util.Scanner;

public class HomeworkSale {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double price=0;
		double discount=0;
		String sale, item;

		System.out.println("Enter value for sale(yes or no)");
		sale = scan.next();

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What item would you like to purchase?");
			item=scan.next();
			System.out.println("Please enter the price below.");
			price = scan.nextDouble();
			if (price < 20) {
				discount = (0.1 * price);}
			else if (price >= 20 && price < 100) {
				discount = (0.2 * price);
			} else if (price >= 100 && price <= 500) {
				discount = (0.3 * price);
			} else {
				discount = (0.5 * price);
			}
			}else{System.out.println("I will not go shopping");}
		
		if(price>0)System.out.println("After discount "+discount+" the item went from "+price+" to "+(price-discount));
		
		scan.close();

}
}