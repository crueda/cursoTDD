package eje;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.mockito.Mockito.*;

public class StringCalculatorTest {

	private IStringSplitter mockedSplitter = mock(IStringSplitter.class);			
	private StringCalculator sut = new StringCalculator(mockedSplitter);
	
	@Test
	public void shouldReturn0WhenNumbersAreEmpty () {
		// Given
		String numbers = "";
		int expected = 0;
		//When
		int result = sut.add(numbers);
		
		//Then
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

	@Test
	public void shouldReturnAddWhenNumbersAreMultipleValuesAndNewLineSeparators () {
		// Given
		String numbers = "1\n2,3";
		int expectedValue = 6;
						
		//When
		int result = sut.add(numbers);
		
		//Then
		assertThat(result, is(expectedValue));
	}

	@Test
	public void shouldReturnAddWhenNumbersAreMultipleValuesWithTokenAsDelimitator () {
		// Given
		String numbers = "//;\n1;2";
		int expectedValue = 3;
						
		//When
		int result = sut.add(numbers);
		
		//Then
		assertThat(result, is(expectedValue));
	}

}
