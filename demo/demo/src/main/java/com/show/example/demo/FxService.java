package com.show.example.demo;

import com.show.example.demo.service.model.FxRate;

import java.util.List;

public interface FxService {

    List<FxRate> getAllFxRateFromDb();
}
