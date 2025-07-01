package com.example;

import org.springframework.stereotype.Service;

@Service
public class SimpleCalculatorService implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
