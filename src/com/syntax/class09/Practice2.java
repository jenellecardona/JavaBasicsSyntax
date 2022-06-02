package com.syntax.class09;

public class Practice2 {
public static void main(String[] args) {
	String[] words= {"Java", "Saturday", "Day", "Coding", "Is"};
	System.out.println(words[1]+" is "+words[0]+" "+words[3]+" "+words[2]);
	
	System.out.println("---Second way---");
	
	String[] words2=new String[5];
	words2[0]="Java";
	words2[1]="Saturday";
	words2[2]="Day";
	words2[3]="Coding";
	words2[4]="Is";
	
	System.out.println(words2[1]+" is "+words2[0]+" "+words2[3]+" "+words2[2]);
			


}	
}
