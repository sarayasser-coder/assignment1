package calculator;

public class functions {

	int add(int x, int y) {
		return x + y;
		
	}
	float divide(int x, int y) throws RuntimeException {
		
		if (y == 0)
		{
			throw new RuntimeException("can't divide by zero!");
		}
		else
		{
		return (float) x/y;
		}
	}
}
