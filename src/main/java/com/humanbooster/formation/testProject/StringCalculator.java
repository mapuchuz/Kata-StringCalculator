package com.humanbooster.formation.testProject;

public class StringCalculator {
	
	public static int additionner( String entree ) {
		//Si la chaine ne contient rien
		if(entree.isEmpty())
			return 0;
		//Si la chaine contient seulement un int
		if(!entree.contains(",")){
			return  Integer.parseInt( entree);
		}
		else{
		//Si la chaine contient deux int séparer d'une virgule
			String[]splitArray=entree.split(",");
			return Integer.parseInt(splitArray[0])+Integer.parseInt(splitArray[1]);
		}
	}

}
