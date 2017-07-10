package eje;

import static org.junit.Assert.*;

import org.junit.Test;
 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringCalculatorTest {

	private StringCalculator sut = new StringCalculator();
	
	@Test
	public void shouldReturn0WhenNumbersAreEmptycheckAddEmpty () {
		// Given
		String numbers = "";
		int expected = 0;
		//When
		int result = sut.add(numbers);
		
		//Then
		//assertEquals(0, result);
		assertThat(result, is (expected));
	}
	
	@Test
	public void shouldReturnNumberWhenNumbersAreSingleValue () {
		// Given
		String numbers = "3";
		int expectedValue = 3;
		
		//When
		int result = sut.add(numbers);
		
		//Then
		//assertEquals(expectedValue, result);
		assertThat(result, is(expectedValue));
	}

	@Test
	public void shouldReturnAddWhenNumbersAreTwoValues () {
		// Given
		String numbers = "3,5";
		int expectedValue = 8;
		
		//When
		int result = sut.add(numbers);
		
		//Then
		//assertEquals(expectedValue, result);
		assertThat(result, is(expectedValue));
	}

	@Test
	public void shouldReturnAddWhenNumbersAreMultipleValues () {
		// Given
		String numbers = "3,5,2";
		int expectedValue = 10;
						
		//When
		int result = sut.add(numbers);
		
		//Then
		//assertEquals(expectedValue, result);
		assertThat(result, is(expectedValue));
	}


}
