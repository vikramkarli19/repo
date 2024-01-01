package lib;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {
    // This method will be executed before the test starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    // This method will be executed when a test method passes
    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Test Passed123: " + result.getName());
    }

    // This method will be executed when a test method fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed123: " + result.getName());
    }

    // Other methods for test skipped, test skipped after retry, and more can be implemented
}
