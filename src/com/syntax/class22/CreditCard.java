package com.syntax.class22;

public class CreditCard {
/*
 * 2)Create a class CreditCard and define variable balance and interest. 
Create an instance method that will calculate interest based on the given balance. 
Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
Call the method by creating an object of each of the three classes.
 */

	int balance;
	double interest;

	CreditCard(int balance) {
		this.balance = balance;
	}

	protected void caclulateInterest() {
		if (balance > 500) {
			interest += balance * 0.25;
		} else {
			interest += 0;
		}
		System.out.println(interest);
	}
}

class Visa extends CreditCard {
	Visa(int balance) {
		super(balance);
	}

	@Override
	protected void caclulateInterest() {
		if (balance > 500) {
			interest += balance * 0.3;
		} else {
			interest += 0;
		}
		System.out.println(interest);
	}
}

class Ax extends CreditCard {
	Ax(int balance) {
		super(balance);
	}

	public void caclulateInterest() {
		if (balance > 500) {
			interest += balance * 0.4;
		} else {
			interest += 0;
		}
		System.out.println(interest);
	}
}