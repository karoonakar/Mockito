package com.test.example.demo.controller;


import com.test.example.demo.dto.PaymentRequest;
import com.test.example.demo.service.PaymentRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController2 {

    @Autowired
    PaymentRegistry registry;


    @PostMapping("/paymentOnline")
    public String paymentOnline(@RequestBody PaymentRequest request) {
        return registry.getServiceBean(request.getPaymentMethod().toLowerCase()).pay(request);
    }

}