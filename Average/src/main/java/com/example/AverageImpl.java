package com.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.Average")
public class AverageImpl implements Average {

    @Override
    public double calculateAverage(int m1, int m2, int m3, int m4) {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}