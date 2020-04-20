package com.show.example.demo.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Deal {
    private String dealId;
    private String currency;
    private Double dealPrice;
}
