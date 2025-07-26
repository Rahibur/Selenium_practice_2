package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    @Test
    public void hardAssertionTest() {
        System.out.println("Start of hard assertion test");

        Assert.assertEquals("one", "one"); // Pass
        System.out.println("Assertion 1 passed");

        Assert.assertTrue(true); // Pass
        System.out.println("Assertion 2 passed");

        Assert.assertFalse(false); // Pass
        System.out.println("Assertion 3 passed");

        Assert.assertEquals("one", "two"); // Fail
        System.out.println("This line will not execute due to failure above");
    }

    @Test
    public void softAssertionTest() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Start of soft assertion test");

        softAssert.assertEquals("one", "one"); // Pass
        System.out.println("Assertion 1 passed");

        softAssert.assertTrue(true); // Pass
        System.out.println("Assertion 2 passed");

        softAssert.assertFalse(false); // Pass
        System.out.println("Assertion 3 passed");

        softAssert.assertEquals("one", "two"); // Fail
        System.out.println("Even if this assertion fails, execution will continue");

        softAssert.assertAll(); // This will aggregate and report all assertion failures
    }
}
