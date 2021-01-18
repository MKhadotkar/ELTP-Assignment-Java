package calculator.test;

import calculator.service.CalService;
import calculator.service.opration;

public class tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalService obj=new CalService();
		
		int res = obj.performCalculation(opration.add, 5, 10);
		System.out.println("Addition : "+res);
		
		res = obj.performCalculation(opration.sub, 15, 10);
		System.out.println("Subsraction : "+res);
			
		res = obj.performCalculation(opration.mul, 5, 10);
		System.out.println("Multiplication : "+res);
		
		res = obj.performCalculation(opration.div, 5, 0);
		System.out.println("Division : "+res);
		
	}

}
