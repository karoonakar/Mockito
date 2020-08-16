package com.test.example.demo.service;


import com.test.example.demo.dto.PaymentRequest;

public interface PaymentService {

	String pay(PaymentRequest request);

	boolean paidBy(String paymentMethod);

}
