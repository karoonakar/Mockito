package com.test.example.demo.controller;


import com.test.example.demo.dto.PaymentRequest;
import com.test.example.demo.service.PaymentSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController3 {

    @Autowired
    private PaymentSelector paymentSelector;

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentRequest request) {
        return  paymentSelector.getPaymentService(request.getPaymentMethod()).pay(request);
    }

}