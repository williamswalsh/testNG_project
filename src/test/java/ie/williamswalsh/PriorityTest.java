package ie.williamswalsh;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    void testOne() {
        System.out.println("testOne output - priority = 1");
    }

    @Test(priority = 2)
    void testTwo() {
        System.out.println("testTwo output - priority = 2");
    }

    @Test(priority = 3, enabled = false)
    void testThree() {
        System.out.println("testThree output - priority = 3");
    }

    @Test(priority = 4)
    void testFour() {
        System.out.println("testFour output - priority = 4");
    }
}
