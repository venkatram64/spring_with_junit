package com.venkat.work.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public double divide(int a, int b){
        return a/b;
    }
}
