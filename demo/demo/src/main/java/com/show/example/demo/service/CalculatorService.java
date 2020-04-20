package com.show.example.demo.service;

import com.show.example.demo.DataService;
import com.show.example.demo.FxService;
import com.show.example.demo.service.model.FxRate;

import java.util.List;

public class CalculatorService {

    private DataService dataService;
    private FxService fxService;


    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }



    public int calculateSum(int [] numbers){

        int sum = 0;
        for (int number:numbers){
            sum += number;
        }

        return sum;
    }

    public int calculateSumFromDb(){

        int[] numbers = dataService.getData();
        int sum = 0;
        for (int number:numbers){
            sum += number;
        }

        return sum;
    }

    private List<FxRate> getFxRateList() {
        return fxService.getAllFxRateFromDb();
    }

    public FxRate findFxRate(String currecy) {

        List<FxRate> fxRateList =  fxService.getAllFxRateFromDb();

            for(FxRate fxRate : fxRateList){
                if(currecy.equalsIgnoreCase(fxRate.getCurrency())){
                    return fxRate;
                }
            }
        fxRateList =  fxService.getAllFxRateFromDb();
            return null;
    }


    public String findCurrencyName(String currecy) {

        if("Euro".equalsIgnoreCase(currecy)){
            return getDefaultCurrencyName();
        } else

        return "Not Foumd";
    }

    private String getDefaultCurrencyName() {
            return "Euro";
    }

    private static String getCurrencyName(String currency) {
        if("USD".equalsIgnoreCase(currency)){
            return "US Dollar";
        }else if ("INR".equalsIgnoreCase(currency)){
            return "India Ruppe";
        }else{
            return "Euro";
        }
    }

}
