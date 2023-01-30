package com.testdrive.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {

	WebElement element;

	public WebElement userName(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		return element;
	}

	public WebElement passWord(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[name='password']"));
		return element;
	}

}
