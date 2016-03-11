package com.humanbooster.formation.testProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	
	/**
	 * 
	 * @param string, string containing integers to be summed
	 * @return
	 */
	public static int add (String entree) {
		// return 0 if the string is empty
		if (entree.isEmpty())
			return 0;

		String[] tab; 
	
		if (entree.charAt(0) == '/' && entree.charAt(1) == '/') {
			Pattern pattern = Pattern.compile("//\\[(.+)\\]\\s(.+)");
			Matcher matcher = pattern.matcher(entree);
			if (matcher.find()) 
				tab=	matcher.group(2).split( Pattern.quote(matcher.group(1)));
			else {
				char delimiter = entree.charAt(2);
				entree = entree.substring(4);
				tab = entree.split(String.valueOf(delimiter));
			}
		} else
			tab = entree.split("[,|\n]");

		int sum = 0;
		int tempo = 0;
		for (String s : tab) {
			tempo = Integer.parseInt(s);
			if (tempo <= 1000)
				sum += tempo;
		}
		return sum;

	}
		
		
		
	}

}
