package org.testing.framework.utils;

import org.openqa.selenium.WebDriver;
import org.testing.framework.driver.managment.Browser;
import org.testing.framework.driver.managment.DriverManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    private WebDriver driver = DriverManager.getDriver(Browser.CHROME);

    @Override
    public void onTestFailure(ITestResult result) {
        if (driver != null) {
            String testName = result.getMethod().getMethodName();
            ScreenshotUtil.takeScreenshot(driver, testName);
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
