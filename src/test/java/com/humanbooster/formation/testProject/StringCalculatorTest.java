package com.humanbooster.formation.testProject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    @Before
    public void avantTest() {
        System.out.println("On va tester la classe StringCalculator");
    }
    
    @After
    public void apresTest() {
        System.out.println("On va FINI les tests !");
    }
    
	@Test
	// Test if the method add return 0 with an empty string
	public void shouldReturnZeroWhenStringEmpty() {
		final int actual = StringCalculator.add("");
		Assert.assertEquals(0, actual);
	}

	@Test
	// Test if the method add return the number with a string containing only
	// one number
	public void shouldReturnTheSingleIntOfTheString() {
		final int actual = StringCalculator.add("1");
		Assert.assertEquals(1, actual);
	}

	@Test
	// Test if the method add return the sum of the int in the string
	public void shouldReturnTheSumOfIntInString() {
		final int actual = StringCalculator.add("1,2");
		Assert.assertEquals(3, actual);
	}

	@Test
	// Test if the method add return the sum of the int in the string
	public void acceptePleinDeParametres() {
		final int actual = StringCalculator.add("1,2,3");
		Assert.assertEquals(6, actual);
	}
	
	@Test(expected=NumberFormatException.class)
	public void argumentNonNombre() {
		StringCalculator.add("1,2glouglou");
	}
	
	
//	Allow the Add method to handle new lines
//	between numbers (instead of commas).
//	the following input is ok: “1\n2,3” (will equal 6)

	@Test()
	public void handlenewlines() {
		
		int expected= 6;
		int actual = StringCalculator.add("1\n2,3");
		Assert.assertEquals(expected, actual);
		
	}
	

//	that looks like this: “//
//	[delimiter]\n[numbers…]”
	@Test()
	public void withUserDelimiter() {
		
		int expected= 3;
		int actual = StringCalculator.add("//;\n1;2");
		Assert.assertEquals(expected, actual);
		
	}	
	
//	bigger than 1000 should be ignored
	@Test()
	public void biggerThan1000Ignored() {
		
		int expected= 2;
		int actual = StringCalculator.add("2,1001");
		Assert.assertEquals(expected, actual);
		
	}
	
//	[***]\n1***2***3” should return 6
	@Test()
	public void delimiterMultiChar() {

		int expected= 6;
		int actual = StringCalculator.add("//[***]\n1***2***3");
		Assert.assertEquals(expected, actual);

	}
	
	@Test(expected=NegativeNumberNotAllowed.class)
	public void negativesAreForbidden() {
		StringCalculator.add("5,-3");
	}

}
