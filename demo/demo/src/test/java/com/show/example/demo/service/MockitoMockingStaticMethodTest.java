package com.show.example.demo.service;

import com.show.example.demo.DataService;
import com.show.example.demo.FxService;
import com.show.example.demo.util.CurrencyUtil;
import mockit.Deencapsulation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoMockingStaticMethodTest {

    @InjectMocks
    CalculatorService calculatorService = new CalculatorService();

    @Mock
    DataService dataServiceMock;

    @Mock
    FxService fxService;

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
    public void findCurrencyNameTest(){
        String response = Deencapsulation.invoke(CalculatorService.class, "getCurrencyName", "Euro");
        assertEquals(response, calculatorService.findCurrencyName("EUR"));
    }

    @Test
    public void findCurrencyNameTest1(){
        String response = Deencapsulation.invoke(CurrencyUtil.class, "getCurrencyName", "Euro");
        assertEquals(response, calculatorService.findCurrencyName1("EUR"));
    }

}
