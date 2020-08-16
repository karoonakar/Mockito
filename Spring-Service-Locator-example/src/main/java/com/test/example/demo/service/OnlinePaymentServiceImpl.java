package com.test.example.demo.service;


import com.test.example.demo.dto.PaymentRequest;

public class OnlinePaymentServiceImpl implements OnlinePaymentService {

	@Override
	public String payByGooblePay(PaymentRequest request) {
		return request.getAmount() + "$ Payment done using: " + request.getPaymentMethod();
	}

	@Override
	public String payByVisaPay(PaymentRequest request) {
		return request.getAmount() + "$ Payment done using: " + request.getPaymentMethod();
	}

	@Override
	public String payByPaytm(PaymentRequest request) {
		return request.getAmount() + "$ Payment done using: " + request.getPaymentMethod();
	}
}
