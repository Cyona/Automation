package com.testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;

	@BeforeClass
	public void setup() {
		reporter = new ExtentHtmlReporter("./Reports/learn_automation21.html");
		// reporter = new ExtentHtmlReporter(System.getProperty("user.dir") +
		// "/test-output/report.html");

		reporter.config().setDocumentTitle("Automation Report for Regression Suite"); // Title of the report
		reporter.config().setReportName("Functional Report"); // name of the report
		reporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Env", "Staging");
		extent.setSystemInfo("os", "WIn 10");
		extent.setSystemInfo("Tester Name", "Cyona");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("BuildVersion", "v123.22");

	}

	@BeforeMethod
	public void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();

	}

	@Test

	public void openURL() throws IOException {
		logger = extent.createTest("Amazon Title check");
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());

	}

	@Test
	public void loginTest() throws IOException {
		logger = extent.createTest("Google Title check");
		driver.get("http://www.google.com");
		System.out.println("title is " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mukesh"));
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = getScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		} else if (result.getStatus() == ITestResult.SKIP) {

			logger.log(Status.SKIP, "Result status: " + result.getStatus());
			logger.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Result status: " + result.getStatus());
			logger.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		extent.flush();
		driver.quit();

	}

	public static String getScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png";

		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}

		return path;
	}

}
