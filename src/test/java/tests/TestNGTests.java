package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTests {

    @Test
    public void testCase1() throws InterruptedException {
        System.out.println("Running Test 1 ..");
        Assert.assertTrue(true);
    }

    @Test
    public void testCase2() throws InterruptedException {
        System.out.println("Running Test 1 ..");
        Assert.assertTrue(true);
    }
}
