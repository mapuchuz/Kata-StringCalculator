	package com.humanbooster.formation.testProject;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

	   @Test
	 //Si la chaine ne contient rien
	    public void revoieZeroSiVideTest() {
		  assertEquals( 0, StringCalculator.additionner(""));
	    }
	   
	   @Test
	 //Si la chaine contient seulement un int
	    public void revoieNombreSiUnSeulNombre() {
		   assertEquals( 154, StringCalculator.additionner("154"));
		   assertEquals( 18, StringCalculator.additionner("18"));
	   }
	   @Test
	 //Si la chaine contient deux int séparer d'une virgule
	    public void revoieAdditionDeDeuxNombre() {
		   assertEquals( 5, StringCalculator.additionner("3,2"));
		   assertEquals( 6, StringCalculator.additionner("2,4"));
	   }
}
