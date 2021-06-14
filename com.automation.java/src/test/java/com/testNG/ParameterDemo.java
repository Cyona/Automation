package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo {
	public WebDriver driver;
	@BeforeTest
	@Parameters({"browser","url"})
	public void launchBrowser(String browser,String app) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		driver.get(app);
	}

	
	@Test(priority=2)
	public void login() {
		System.out.println("login with credentials");
	}
	@Test(priority=3)
	public void search() {
		System.out.println("search the product");
	}
	@Test(priority=4)
	public void addTocart() {
		System.out.println("Add to cart");
	}
	@Test(priority=5,enabled=false) //disabled
	public void address() {
		System.out.println("add an address");
	}
	@AfterTest
	public void logout() {
		System.err.println("close the Browser");
	}
}
