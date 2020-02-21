package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testAdd1() {
		functions testadd1 = new functions();
		int resultadd1 = testadd1.add(2, 4);
		assertEquals(6, resultadd1);
	}
	@Test
	public void testAdd2() {
		functions testadd2 = new functions();
		int resultadd2 = testadd2.add(-1,5);
		assertEquals(4, resultadd2);
	}
	
	@Test
	public void testDivide1() {
		functions testdivide1 = new functions();
		float resultdivide1 = testdivide1.divide(10, 2);
		assertEquals(5.0f,resultdivide1,0.0);
		
	}
	
	@Test
	public void testDivide2() {
		functions testdivide2 = new functions();
		float resultdivide2 = testdivide2.divide(5,2);
		assertEquals(2.5f,resultdivide2,0.0);
	}
	
	 @Test(expected = RuntimeException.class)
	    public void testDevideByZero() {
	        functions testdivide3 = new functions();
	        testdivide3.divide(10,0);
	    }

}
