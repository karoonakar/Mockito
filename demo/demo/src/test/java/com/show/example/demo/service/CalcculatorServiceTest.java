package com.show.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcculatorServiceTest {

    @Test
    public void calculateSumTest(){
        CalculatorService calculatorService = new CalculatorService();
        int actualResult = calculatorService.calculateSum(new int[] {2,3,4});

        assertEquals(9,actualResult);
    }

    @Test
    public void calculateSumTest_Empty(){
        CalculatorService calculatorService = new CalculatorService();
        int actualResult = calculatorService.calculateSum(new int[] {});

        assertEquals(0,actualResult);
    }

    @Test
    public void calculateSumFromDbTest(){
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.setDataService(new DataServiceStub());
        int actualResult = calculatorService.calculateSumFromDb();

        assertEquals(6,actualResult);
    }

    @Test
    public void calculateSumFromDb_emptyTest(){
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.setDataService(new DataServiceEmptyStub());
        int actualResult = calculatorService.calculateSumFromDb();

        assertEquals(0,actualResult);
    }

}
