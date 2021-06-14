package com.testNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//dataproviders
public class MyTest001 extends Annotations {
	
	@Test(dataProvider="testdata")
	public void login(String email,String password) throws InterruptedException {
		driver.get("https://www.myntra.com/login/password");
		driver.findElement(By.id("mobileNumberPass")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
		Thread.sleep(1000);
	}
	
	@DataProvider
	public Object[][] testdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="cyonabaretto8@gmail.com";
		data[0][1]="CYONA025";
		data[1][0]="Steve@gmail.com";
		data[1][1]="Steve@123";
		data[2][0]="Cyona.Baretto@dell.com";
		data[2][1]="Password123";
		return data;
	}

}
