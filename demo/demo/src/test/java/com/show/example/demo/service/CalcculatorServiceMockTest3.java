package com.show.example.demo.service;

import com.show.example.demo.DataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class CalcculatorServiceMockTest3 {

    @InjectMocks
    CalculatorService calculatorService = new CalculatorService();

    @Mock
    DataService dataServiceMock;

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSumTest(){
        int actualResult = calculatorService.calculateSum(new int[] {2,3,4});
        assertEquals(9,actualResult);
    }

    @Test
    public void calculateSumTest_Empty(){
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
