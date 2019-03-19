import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTester {

	@Test
	final void testAdd() {
		Calculator clc=new Calculator();
		
		assertEquals(29,clc.add(10, 19));
		assertEquals(19,clc.add(0, 19));
		assertEquals(2,clc.add(1, 1));
		assertEquals(20,clc.add(1, 19));
	}

	@Test
	final void testSubtract() {
		Calculator clc=new Calculator();
		
		assertEquals(-9,clc.subtract(10, 19));
		assertEquals(22,clc.subtract(10, -12));
		assertEquals(81,clc.subtract(100, 19));
		assertEquals(-9,clc.subtract(10, 19));
	}

	@Test
	final void testMultiply() {
		Calculator clc=new Calculator();
		
		assertEquals(19,clc.multiply(1, 19));
		assertEquals(190,clc.multiply(10, 19));
		assertEquals(0,clc.multiply(0, 19));
		assertEquals(0,clc.multiply(10, 0));
	}

	@Test
	final void testDivide() {
		Calculator clc=new Calculator();
		
		assertEquals(5,clc.divide(100, 19));
		assertEquals(0,clc.divide(10, 19));
		assertEquals(10,clc.divide(190, 19));
		assertEquals(2,clc.divide(10, 5));
	}

}
