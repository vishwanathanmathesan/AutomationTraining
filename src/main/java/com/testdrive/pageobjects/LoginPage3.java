package com.testdrive.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {

	WebDriver driver;

	public LoginPage3(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	public WebElement userName;

	@FindBy(how = How.CSS, using = "[name='password']")
	public WebElement password;

	@FindBys({ @FindBy(name = "password"), @FindBy(name = "[name='password']") })
	public WebElement testElement;

	public void userNameInput(String dataValue) {
		userName.sendKeys(dataValue);
	}

	public void passwordInput(String dataValue) {
		password.sendKeys(dataValue);
	}

}
