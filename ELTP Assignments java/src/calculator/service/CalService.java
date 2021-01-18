package calculator.service;

import calculator.util.calculator;

public class CalService {
	
	
	
	calculator c=new calculator();
	
	public int performCalculation(opration op, int a, int b)
	{
		switch(op)
		{
			case add:
				return c.add(a, b);		
			case sub:
				return c.sub(a, b);
			
			case mul:
				return c.mul(a, b);
			
			case div:
				return c.div(a, b);
			
			default:
				return -1;		
				
			
		}
	}
}
