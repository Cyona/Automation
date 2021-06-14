package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyRetry extends Annotations{

	  @Test(retryAnalyzer=RetryListnerDemo.class)
	  public void test() {
		  driver.get("https://amazon.in");
	    Assert.fail("test retry");
	    
	  }

}
