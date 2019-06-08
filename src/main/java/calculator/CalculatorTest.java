package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	@Test
	public void testAdd() {
		//Calculator calc = new Calculator();
		//Assert.
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSubtract() {
		//Calculator calc = new Calculator();
		assertEquals(3, calc.subtract(6,3));
	}

}
