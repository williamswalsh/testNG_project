package ie.williamswalsh;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void test1() {
        System.out.println("Test 1 output");
    }

    @Test(groups = {"sanity"})
    void test3() {
        System.out.println("Test 3 output");
    }

    @Test(groups = {"regression"})
    void test2() {
        System.out.println("Test 2 output");
    }

    @Test(groups = {"regression"})
    void test4() {
        System.out.println("Test 4 output");
    }

    @Test(groups = {"sanity", "regression"})
    void test5() {
        System.out.println("Test 5 output");
    }
}
