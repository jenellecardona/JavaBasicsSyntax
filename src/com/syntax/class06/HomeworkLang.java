package com.syntax.class06;

import java.util.Scanner;

public class HomeworkLang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String country, lang;
		
		System.out.println("What country are your from?");
		country = scan.nextLine();
						
		switch(country.toLowerCase()) {
		case "usa":
			lang = "english";
			break;
		case "spain":
			lang = "spanish";
			break;
		case "brasil":
			lang = "portuguese";
			break;
		case "japan":
			lang = "japanese";
			break;
		case "italy":
			lang = "italian";
			break;
		case "france":
			lang = "french";
			break;
		default: lang="unknown";
		}
		System.out.println("You speak " + lang);
		scan.close();

	}

}
