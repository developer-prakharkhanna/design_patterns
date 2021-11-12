package com.prakhar.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		
		System.out.println("USD paid : " + dollars);
		
	}

}
