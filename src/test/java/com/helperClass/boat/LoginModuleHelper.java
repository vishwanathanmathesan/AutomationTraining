package com.helperClass.boat;

import org.openqa.selenium.WebDriver;

import com.pageAction.by;
import com.pageAction.pageAction;
import com.pageObject.LoginModule;
import com.pageObject.loginObject;

public class LoginModuleHelper  {
     public static  void invalid_MailId(WebDriver driver) {
		  pageAction.clicker(by.cssSelector,loginObject.loginIcon, driver);
		  pageAction.clicker(by.xpath, loginObject.Login, driver);
		  pageAction.sendKeys(by.xpath,loginObject.email,LoginModule.invalidMailId, driver );
		  pageAction.sendKeys(by.xpath, loginObject.password, LoginModule.invalidPassword, driver);
		  pageAction.clicker(by.xpath, loginObject.submit, driver);	  
}
public static  void withoutMailId(WebDriver driver) {
	 pageAction.clicker(by.cssSelector,loginObject.loginIcon, driver);
	  pageAction.clicker(by.xpath, loginObject.Login, driver);
	  pageAction.clicker(by.xpath, loginObject.submit, driver);	

}
public static void validMailId(WebDriver driver) {
	pageAction.clicker(by.cssSelector,loginObject.loginIcon, driver);
	  pageAction.clicker(by.xpath, loginObject.Login, driver);
       pageAction.sendKeys(by.xpath, loginObject.email, LoginModule.validMailId, driver);
       pageAction.sendKeys(by.xpath, loginObject.password, LoginModule.validPassword, driver);
       pageAction.clicker(by.xpath, loginObject.submit, driver);	


}


}