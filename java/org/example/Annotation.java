package org.example;

import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite - This runs once BEFORE ALL tests in the suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest - This runs before any test method in a <test> tag");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass - This runs once BEFORE the first test method in the current class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod - This runs BEFORE EACH test method");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1: Execute the first test");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2: Execute the second test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod - This runs AFTER EACH test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass - This runs once AFTER all test methods in the current class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest - This runs after all test methods in a <test> tag");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite - This runs once AFTER ALL tests in the suite");
    }
}
