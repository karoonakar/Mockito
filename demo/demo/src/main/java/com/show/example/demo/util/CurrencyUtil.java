package com.show.example.demo.util;

public class CurrencyUtil {

    public static String getCurrencyName(String currency) {
        if("USD".equalsIgnoreCase(currency)){
            return "US Dollar";
        }else if ("INR".equalsIgnoreCase(currency)){
            return "India Ruppe";
        }else{
            return "Euro";
        }
    }
}
