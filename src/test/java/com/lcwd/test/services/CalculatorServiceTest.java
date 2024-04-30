package com.lcwd.test.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {
    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("Started Test :"+ new Date());

    }
@Before
public void beforeEach(){
    System.out.println("Before each Test Case");
}

    @Test
    public void addTwoNumbersTest(){
        System.out.println("Test for addTwoNumbersTest");
       int result = CalculatorService.addTwoNumbers(10,30);
       int expected = 40;
        Assert.assertEquals(expected,result);
    }
    @Test
    public  void sumAnyNumbersTest(){
        System.out.println("Sum for anyTwoNumbersTest");
        int result = CalculatorService.sumAnyNumbers(3,5,6,8);
        int expected = 22;
        Assert.assertEquals(expected,result);
    }
    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test cases");
        System.out.println("End Test cases :"+ new Date());
    }
}
// important Annotations for JUNIT 4
// Before Class
// After Class
// Test
// Before