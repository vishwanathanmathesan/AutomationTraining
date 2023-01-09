package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	WebDriver driver ;
	@Test
	public void hardAssert() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

	     //WebElement title =driver.findElement(By.)
	
	
	
	//	Assert.assertTrue(false, null)
		
	
}
	
	
	
	
}
