package ie.williamswalsh;

import org.testng.annotations.*;

public class TC1 {

    @BeforeSuite
    void beforeTestSuiteStarts() {
        System.out.println("Executed once - Before the test suite starts");
    }

    @AfterSuite
    void afterTestSuiteExecutes() {
        System.out.println("Executed once - After the test suite completes");
    }


    @BeforeTest
    void beforeTestNgTestStarts() {
        System.out.println("Executed once - Before the testNG test starts");
    }

    @AfterTest
    void afterTestNgTestExecuted() {
        System.out.println("Executed once - After the testNG test completes - this is defined by the testng.xml test element.");
    }

    @BeforeClass
    void beforeClassStarts() {
        System.out.println("Executed once - Before class starts");
    }

    @AfterClass
    void afterClassFinishes() {
        System.out.println("Executed once - After class finishes");
    }

    @BeforeMethod
    void beforeEveryTestMethod() {
        System.out.println("Before every test method output");
    }

    @AfterMethod
    void afterEveryTestMethod() {
        System.out.println("After every test method output");
    }

    @Test
    void test1() {
        System.out.println("Test 1 output");
    }

    @Test
    void test2() {
        System.out.println("Test 2 output");
    }
}
