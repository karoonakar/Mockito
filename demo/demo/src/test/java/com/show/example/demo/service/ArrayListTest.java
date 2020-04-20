package com.show.example.demo.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class ArrayListTest {

    List listMock = mock(List.class);

    @Test
    public void testList(){
        when(listMock.size()).thenReturn(5);
        assertEquals(5, listMock.size());

    }

    @Test
    public void testListReturnDifferentValue(){
        when(listMock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, listMock.size());
        assertEquals(10, listMock.size());

    }

    @Test
    public void testListReturnOnParameter(){
        when(listMock.get(0)).thenReturn("ok");
        assertEquals("ok", listMock.get(0));
        assertEquals(null, listMock.get(1));

    }

    @Test
    public void testListReturnOnGenericParameter(){
        when(listMock.get(anyInt())).thenReturn("ok");
        assertEquals("ok", listMock.get(0));
        assertEquals("ok", listMock.get(1));
    }

    @Test
    public void mockTest(){
        ArrayList arrayListMock = mock(ArrayList.class);
        System.out.println(arrayListMock.size());
        System.out.println(arrayListMock.get(0));
        arrayListMock.add("test");
        arrayListMock.add("test1");
        System.out.println(arrayListMock.size());
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());
        arrayListMock.add("test");
        arrayListMock.add("test1");
        System.out.println(arrayListMock.size());
    }


    @Test
    public void spyTest(){
        ArrayList arrayListSpy = spy(ArrayList.class);
        System.out.println(arrayListSpy.size());
        //System.out.println(arrayListSpy.get(0));
        arrayListSpy.add("test");
        arrayListSpy.add("test1");
        System.out.println(arrayListSpy.size());
        when(arrayListSpy.size()).thenReturn(5);
        System.out.println(arrayListSpy.size());
        arrayListSpy.add("test");
        arrayListSpy.add("test1");
        System.out.println(arrayListSpy.size());
    }


}
