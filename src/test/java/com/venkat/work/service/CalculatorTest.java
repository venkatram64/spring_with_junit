package com.venkat.work.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    /*
    applied AI course -> www.appliedaicourse.com
    @BeforeAll,
    @AfterAll
    @BeforeEach
    @AfterEach
     */

    @Autowired
    private Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll method must be marked static keyword...");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll method must be marked static keyword...");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Init...");
    }

    @AfterEach
    public void teardown(){
        System.out.println("Cleanup...");
    }

    @Test
    @DisplayName("Add Two Numbers")
    public void addTest(){
        int actual = calculator.add(1,2);
        assertEquals(3, actual, "The add method add two numbers.");
    }

    @Test
    @DisplayName("Divide Two Numbers")
    public void divideTest(){
      assertThrows(ArithmeticException.class, () -> calculator.divide(2,0));
    }

    @Test
    @Disabled
    public void subtractTest(){
        fail("this test should be disabled.");
    }

}
