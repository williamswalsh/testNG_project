package ie.williamswalsh;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is test setup.");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login.");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("This is teardown.");
    }
}
