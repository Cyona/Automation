package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions extends Annotations {
	
	@Test(priority=1)
	public void verifyPageTitle() {
		System.out.println("Starting!!!!!!!!");
		driver.get("https://www.amazon.in");
		String amztitle=driver.getTitle();
		System.out.println(amztitle);
		Assert.assertEquals(amztitle, "Online hopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","title mismatch");
		System.out.println("Ending!!!!!!!!");
	}
	@Test(priority=2)
	public void softAssertionDemo() {
		
		System.out.println("Starting!!!!!!!!");
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(title, "Google.com","Title mismatch");
		System.out.println("Ending!!!!!!!!");
		sf.assertAll();

		
	}

}
