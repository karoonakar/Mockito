package com.test.example.demo.controller;


import com.test.example.demo.dto.PaymentRequest;
import com.test.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController1 {

    @Autowired
    private PaymentService paytm;

    @Autowired
    private PaymentService googlepay;

    @Autowired
    private PaymentService visapay;


    @PostMapping("/payOnline")
    public String payOnline(@RequestBody PaymentRequest request)  {

        if (request.getPaymentMethod().toLowerCase().equals("paytm")) {
            return paytm.pay(request);
        }
        if (request.getPaymentMethod().toLowerCase().equals("googlepay")) {
            return googlepay.pay(request);
        }
        if (request.getPaymentMethod().toLowerCase().equals("visapay")) {
            return visapay.pay(request);
        } else {
            return "Invalid Payment Method...";
        }
    }

}