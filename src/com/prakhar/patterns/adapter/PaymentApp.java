package com.prakhar.patterns.adapter;

public class PaymentApp {
	
	public void pay(int rupees) {
		
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.pay(rupees);
		
	}
	
	public static void main (String...a) {
		
		PaymentApp payment = new PaymentApp();
		payment.pay(500);
		
	}

}
