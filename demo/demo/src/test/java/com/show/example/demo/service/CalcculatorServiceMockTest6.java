package com.show.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.spy;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.show.example.demo.service.CalculatorService")
class CalcculatorServiceMockTest6 {

    @Test
    public void findFxRate1Test() throws Exception {
        CalculatorService calculatorServiceSpy =  spy(new CalculatorService());
       // when(calculatorServiceSpy, "getDefaultCurrencyName").thenReturn("Euro");

        //String actualResult = calculatorService.findCurrencyName("Euro");
        //assertEquals("Euro",actualResult);

    }
}
