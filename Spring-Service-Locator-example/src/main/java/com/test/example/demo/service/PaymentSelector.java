package com.test.example.demo.service;

import java.util.Arrays;
import java.util.List;

public class PaymentSelector {


    private final List<PaymentService> paymentServiceList ;


    public PaymentSelector(PaymentService... paymentServices) {
        this.paymentServiceList = Arrays.asList(paymentServices);
    }

    public PaymentService getPaymentService(String paymentMethod) {

        return paymentServiceList
                .stream()
                .filter(selector -> selector.paidBy(paymentMethod))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Payment method not supported: " + paymentMethod));
    }
    
}
