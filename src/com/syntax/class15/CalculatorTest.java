package com.syntax.class15;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//we need to create object
		//                   this name of class
		Calculator calc=new Calculator();
		
		calc.add(100,200);
		calc.sub(1000,300);
		//calc.add(200);CE
		//calc.add(100.99,200.99); CE
		
		calc.add(1000,2000);
		calc.sub(10,3);
		
		calc.mult(20, 10);
		
		calc.div(20, 10);
	}

}
