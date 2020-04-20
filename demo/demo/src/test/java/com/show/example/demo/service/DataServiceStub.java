package com.show.example.demo.service;

import com.show.example.demo.DataService;

public class DataServiceStub implements DataService {

    @Override
    public int[] getData() {
        return new int[]{1,2,3};
    }
}