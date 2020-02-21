package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testAdd() {
		functions test = new functions();
		int result = test.add(2, 4);
		assertEquals(6, result);
	}
	
	@Test
	public void testDivide() {
		functions test2 = new functions();
		float result2 = test2.divide(10, 2);
		assertEquals(5.0f,result2,0.0);
		
	}
	
	 @Test(expected = RuntimeException.class)
	    public void testDevideByZero() {
	        functions test3 = new functions();
	        test3.divide(10,0);
	    }

}
