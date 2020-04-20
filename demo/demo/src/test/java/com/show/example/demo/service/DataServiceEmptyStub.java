package com.show.example.demo.service;

import com.show.example.demo.DataService;

public class DataServiceEmptyStub implements DataService {

    @Override
    public int[] getData() {
        return new int[]{};
    }
}