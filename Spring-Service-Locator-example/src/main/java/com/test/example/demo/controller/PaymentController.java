package com.test.example.demo.controller;


import com.test.example.demo.dto.PaymentRequest;
import com.test.example.demo.service.OnlinePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private OnlinePaymentService onlinePaymentService;


    @PostMapping("/pay")
    public String payOnline(@RequestBody PaymentRequest request)  {

        if (request.getPaymentMethod().toLowerCase().equals("paytm")) {
            return onlinePaymentService.payByPaytm(request);
        }
        if (request.getPaymentMethod().toLowerCase().equals("googlepay")) {
            return onlinePaymentService.payByGooblePay(request);
        }
        if (request.getPaymentMethod().toLowerCase().equals("visapay")) {
            return onlinePaymentService.payByVisaPay(request);
        } else {
            return "Invalid Payment Method...";
        }
    }

}