package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations4 {
	@BeforeTest
	public void launchBrowser() {
		System.err.println("Launch Browser");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("+++++++Before Method++++++");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("+++++++After Method+++++++");
	}
	@Test(priority=1,groups="sanity")
	public void openUrl() {
		System.out.println("Open URL");
	}
	@Test(priority=2,groups="sanity")
	public void login() {
		System.out.println("login with credentials");
	}
	@Test(priority=3,groups= {"sanity","integration"})
	public void search() {
		System.out.println("search the product");
	}
	@Test(priority=4,groups="integration")
	public void addTocart() {
		System.out.println("Add to cart");
	}
	@Test(priority=5,groups="integration") //disabled
	public void address() {
		System.out.println("add an address");
	}
	@AfterTest
	public void logout() {
		System.err.println("close the Browser");
	}

}
