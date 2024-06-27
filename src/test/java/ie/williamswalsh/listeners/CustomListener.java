package ie.williamswalsh.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener    {

    public void onStart(ITestContext context) {
        System.out.println("onStart - Start test execution");
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish - Finish test execution");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart - result.name():" + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped - result.name():" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess - result.name():" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure - result.name():" + result.getName());
    }
}
