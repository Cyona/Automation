package com.testNG;

import org.testng.annotations.*;

public class Annotations2 {

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
	@Test(priority=1)
	public void openUrl() {
		System.out.println("Open URL");
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
