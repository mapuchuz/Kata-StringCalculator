package com.humanbooster.formation.testProject;

public class StringCalculator {
	
	/**
	 * 
	 * @param string, string containing integers to be summed
	 * @return
	 */
	public static int add (String string) {
		// return 0 if the string is empty
		if(string.isEmpty()){
			return 0;
		}else if (!string.contains(",")){
			// return the single integer of the string
			return Integer.valueOf(string);
		}else {
			// return the sum of the 2 intergers in the string
			String [] valuesInString = string.split(",");
			return Integer.valueOf(valuesInString[0])+ Integer.valueOf(valuesInString[1]);
		}
			
	}

}
