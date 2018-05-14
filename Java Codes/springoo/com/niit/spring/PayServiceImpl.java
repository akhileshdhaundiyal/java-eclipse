package com.niit.spring;

import javax.annotation.Resource;

public class PayServiceImpl {

	@Resource(name = "cashPaymentBean")
	private IPayment payment;
	public void performPayment()
	{
		payment.executePayment();
	}
	public void getPayment()
	{
		return payment;
	}
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
	}
	
}
