package com.test.example.demo.controller;


import com.test.example.demo.dto.PaymentRequest;
import com.test.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentRegistry registry;

    @Autowired
    private PaymentService paytm;

    @Autowired
    private PaymentService googlePay;

    @Autowired
    private PaymentService visaPay;


    @PostMapping("/payOnline")
    public String payOnline(@RequestBody PaymentRequest request)  {

        if (request.getPaymentMethod().equals("paytm")) {
            return paytm.pay(request);
        }
        if (request.getPaymentMethod().equals("googlePay")) {
            return googlePay.pay(request);
        }
        if (request.getPaymentMethod().equals("visaPay")) {
            return visaPay.pay(request);
        } else {
            return "Invalid Payment Method...";
        }
    }


    @PostMapping("/paymentOnline")
    public String paymentOnline(@RequestBody PaymentRequest request) {
        return registry.getServiceBean(request.getPaymentMethod()).pay(request);
    }

}
