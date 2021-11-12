package com.prakhar.patterns.adapter;

public class PaymentAdapter {
	
	public void pay(int rupees) {
		
		int dollars = rupees * 71;
		
		PaymentProcessor processor = new PaymentProcessorImpl();
		processor.pay(dollars);
		
	}

}
