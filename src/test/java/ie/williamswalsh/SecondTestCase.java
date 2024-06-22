package ie.williamswalsh;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is test setup.");
    }

    @Test(priority = 2)
    void addCustomer() {
        System.out.println("This is add customer test.");
//        Assert.assertEquals(1,2);   // Assertion failure
//        Assert.fail("This is a dummy failure to test TestNG functionality.");
    }

    @Test(priority = 3)
    void searchCustomer() {
        System.out.println("This is search customer test.");
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("This is teardown.");
    }
}
