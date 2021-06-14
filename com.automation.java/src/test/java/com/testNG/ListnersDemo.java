package com.testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersDemo implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Test on start "+result.getName()); //emailable-report
	}
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test on success "+result.getName());

	}
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test on failure "+result.getName());

	}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test on skip "+result.getName());

	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("Test on failure "+result.getStatus());

	}
	public void onStart(ITestResult context) {
		Reporter.log("Test on start "+context.getName());

	}
	public void onFinish(ITestResult context) {
		Reporter.log("Test on finish "+context.getName());

	}


}
