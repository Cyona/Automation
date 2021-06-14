package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annotations {
	
	public WebDriver driver;
	@BeforeClass  //for parallel execution use class
	//@BeforeSuite
	public void launchBrowser() {
		String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
	}

	@AfterClass 
	//@AfterSuite
	public void logout() {
		driver.quit();
	}
}
