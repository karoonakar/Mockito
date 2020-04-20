package com.show.example.demo.service;

import com.show.example.demo.DataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalcculatorServiceMockTest2 {

    CalculatorService calculatorService = new CalculatorService();
    DataService dataServiceMock = mock(DataService.class);


     @BeforeEach // in Junit4 it is @Before
     public void init(){
         calculatorService.setDataService(dataServiceMock);
     }

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
        when(dataServiceMock.getData()).thenReturn(new int[]{1,2,3});
        int actualResult = calculatorService.calculateSumFromDb();

        assertEquals(6,actualResult);
    }

    @Test
    public void calculateSumFromDb_emptyTest(){
        when(dataServiceMock.getData()).thenReturn(new int[]{});
        int actualResult = calculatorService.calculateSumFromDb();

        assertEquals(0,actualResult);
    }

}
