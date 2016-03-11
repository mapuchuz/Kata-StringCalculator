package com.humanbooster.formation.testProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		StringCalculator calc = new StringCalculator();
//		System.out.println(calc.add("12,14"));
//		System.out.println(calc.add("12,14frf"));

		String toto = "//[***][;;]\n1***2***3;;4";
		Pattern pattern = Pattern.compile("//(\\[(.+)\\])+\\s(.+)");
		Matcher matcher = pattern.matcher(toto);

		if (matcher.find()) {
			System.out.println( matcher.group(1));
			System.out.println( matcher.group(2));
			System.out.println( matcher.group(3));
			System.out.println("");
			String[] tab = matcher.group(2).split(Pattern.quote(matcher.group(1)));
			for (String t : tab)
				System.out.println(t);
		}

	}

}
