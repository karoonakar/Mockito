package com.show.example.demo.service;

import com.show.example.demo.DataService;
import com.show.example.demo.FxService;
import com.show.example.demo.service.model.FxRate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CalcculatorServiceMockTest5 {

    @InjectMocks
    CalculatorService calculatorService = new CalculatorService();

    @Mock
    DataService dataServiceMock;

    @Mock
    FxService fxService;

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

    @Test
    public void findFxRateTest(){
        when(fxService.getAllFxRateFromDb()).thenReturn(buildFxList());
        FxRate actualResult = calculatorService.findFxRate("INR");
        assertEquals(74.0,actualResult.getRate());
        verify(fxService).getAllFxRateFromDb();
        verify(fxService, times(1)).getAllFxRateFromDb();
        verify(fxService, atLeast(1)).getAllFxRateFromDb();
        verify(fxService, atLeastOnce()).getAllFxRateFromDb();

    }





    private List<FxRate> buildFxList(){
        List<FxRate> fxRateList = new ArrayList();
        FxRate fxRate1 = new FxRate("Euro", 1.1);
        FxRate fxRate2 = new FxRate("INR", 74.0);

        fxRateList.add(fxRate1);
        fxRateList.add(fxRate2);

        return fxRateList;
    }

}
