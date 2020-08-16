package com.test.example.demo.service;


import com.test.example.demo.dto.PaymentRequest;

public interface OnlinePaymentService {

	String payByGooblePay(PaymentRequest request);

	String payByVisaPay(PaymentRequest request);

	String payByPaytm(PaymentRequest request);

}
