package com.helperClass.boat;

import org.openqa.selenium.WebDriver;

import com.pageAction.by;
import com.pageAction.pageAction;
import com.pageObject.FilterObject;

public class FilterHelper extends pageAction {
public static void filter(WebDriver driver) {
	  clicker(by.cssSelector,FilterObject.filterIcon, driver);
	  clicker(by.xpath,FilterObject.price, driver);
	  clicker(by.xpath, FilterObject.fromPrice, driver);
	  sendKeys(by.xpath,FilterObject.fromPrice,FilterObject.minmumPrice, driver);
      clicker(by.id, FilterObject.toPrice, driver);	
	  sendKeys(by.id, FilterObject.toPrice,FilterObject.maximumPrice,driver);
	  clicker(by.xpath, FilterObject.viewResult, driver);
}
}
