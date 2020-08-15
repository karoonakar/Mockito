package com.test.example.demo.service;


import com.test.example.demo.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("googlePay")
public class GooglePay implements PaymentService {

	@Override
	public String pay(PaymentRequest request) {
		return request.getAmount() + "$ Payment done using: " + request.getPaymentMethod();
	}
}