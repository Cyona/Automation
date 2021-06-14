package com.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersDemo.class)
public class TC002 extends Annotations {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("+++++++Before Method++++++");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("+++++++After Method+++++++");
	}
	
	@Test
	public void openUrl() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Open Url");
	}
	@Test
	public void addCart() {
		System.out.println("add to cart");
		Assert.fail("fail..");
	}
	@Test
	public void addAddress() {
		System.out.println("add to cart");
		throw new SkipException("Skipping");
	}
	
	
	

}
