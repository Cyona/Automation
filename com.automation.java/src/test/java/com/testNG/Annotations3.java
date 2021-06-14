package com.testNG;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	
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
	@Test()
	public void openUrl() {
		System.out.println("Open URL");
		Assert.fail();

	}
	@Test(dependsOnMethods="openUrl",alwaysRun=true)  //If set to true, this configuration method will be run even if one or more methods invoked previously failed or was skipped.
	public void login() {
		System.out.println("login with credentials");
	}
	@Test
	public void search() {
		throw new SkipException("skipping");
	//	System.out.println("search");
	}
	@Test
	public void addTocart() {
		System.out.println("Add to cart");
	}
	//if no priority is provided then that @test method will be executed first
	@Test
	public void address() {
		System.out.println("add an address");
	}
	@AfterTest
	public void logout() {
		System.err.println("close the Browser");
	}

}
