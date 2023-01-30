package com.testdrive.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {

//	WebDriver driver;
//
//	public LoginPage2(WebDriver baseDriver) {
//
//		driver = baseDriver;
//	}

	By userName = By.name("username");
	By password = By.cssSelector("[name='password']");
	
	

	
	
	
	
	public void userName(WebDriver driver, String dataValue) {

		driver.findElement(userName).sendKeys(dataValue);

	}

	public void passWord(WebDriver driver, String dataValue) {

		driver.findElement(password).sendKeys(dataValue);

	}

}
