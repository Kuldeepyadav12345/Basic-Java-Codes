package Strings;

import java.util.Locale;

public class String2 {

	public static void main(String[] args) {
		String firstString = "Taki";
		String secondString = "TAKI";
		System.out.println(firstString.equalsIgnoreCase(secondString)); //prints true
		Locale locale = Locale.forLanguageTag("tr-TR");
		System.out.println(locale);
		System.out.println(firstString.toLowerCase(locale).equals(
		secondString.toLowerCase(locale)));
	}

}
