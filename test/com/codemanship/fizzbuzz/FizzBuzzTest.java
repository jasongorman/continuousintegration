package com.codemanship.fizzbuzz;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {
	
	@Test
	@Parameters({"3", "6"})
	public void divisibleByThreeIsFizz(int input) {
		assertEquals("Fizz", new FizzBuzz().fizzBuzz(input));
	}

	@Test
	@Parameters
	public void otherwiseUnchanged(int input, String expected) {
		assertEquals(expected, new FizzBuzz().fizzBuzz(input));
	}
	
	private Object[] parametersForOtherwiseUnchanged(){
		return new Object[][]{
			{1, "1"},
			{2, "2"}
		};
	}
}
