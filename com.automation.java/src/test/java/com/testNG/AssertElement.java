package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertElement extends Annotations{
	
	@Test
	public void assertElem() throws InterruptedException {
		System.out.println("Starting");
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		Assert.assertTrue(ele.isDisplayed(), "Google search is not present");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Selenium jobs");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
		Thread.sleep(3000);

		System.out.println("Ending");

	}
	@Test
	public void softAssertele() throws InterruptedException {
		System.out.println("Starting");
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		Thread.sleep(1000);
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(ele.isSelected(), "Search button is not present");
		//driver.findElement(By.name("q")).sendKeys("linkedin");
		//Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
		Thread.sleep(3000);

		System.out.println("Ending");
		sf.assertAll();

	}

}
