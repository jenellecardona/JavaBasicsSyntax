package com.syntax.reviewclass10;

public class Recap {
	public static void main(String[] args) {
		
		String[] disney= {"Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry"};
		System.out.println("--First output---");
		System.out.println(disney[1]);
		
		System.out.println("--Second output---");
		for(int i=0; i<disney.length; i++) {
			if(disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println("My favoriate character is "+disney[i]);
			}else { System.out.println(disney[i]);}
		}
		System.out.println("--Third output---");
		for(String disneyList:disney) {
			if(disneyList.equalsIgnoreCase("Shrek")) {
				System.out.println(disney[0]+" is my favorite character!");
			}else {System.out.println(disneyList);}
		}
		
	}

}
