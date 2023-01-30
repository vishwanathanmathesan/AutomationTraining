package com.testdrive.helpers;

import org.openqa.selenium.WebDriver;

import com.testdrive.pageactions.PageActions;
import com.testdrive.pageobjects.LoginPage1;
import com.testdrive.pageobjects.LoginPage2;
import com.testdrive.pageobjects.LoginPage3;

public class LoginHelper {

	PageActions pageActions = new PageActions();
//	LoginPage1 loginPage = new LoginPage1();
//	LoginPage2 loginPage = new LoginPage2();

//	public void validUserLogin1(WebDriver driver) {
//
//		pageActions.sendKeys(loginPage.userName(driver), "vishwaUserName");
//		pageActions.sendKeys(loginPage.passWord(driver), "vishwaPassword");
//	}

//	public void validUserLogin2(WebDriver driver) {
//
//		loginPage.userName(driver, "vishwaUserName");
//		loginPage.passWord(driver, "vishwaPassword");
//	}

	public void validUserLogin3(WebDriver driver) {
		LoginPage3 loginPage = new LoginPage3(driver);

		pageActions.sendKeys(loginPage.userName, "VishwaUserName");
		pageActions.sendKeys(loginPage.password, "vishwaPassword");
	}

}
