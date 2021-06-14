package com.testNG;

import org.testng.annotations.*;

public class TC001 extends Annotations{
	
	
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
		driver.get("https://www.amazon.in/");
		System.out.println("Open Url");
	}


}
