package com.helperClass.boat;

import org.openqa.selenium.WebDriver;

import com.pageAction.by;
import com.pageAction.pageAction;
import com.pageObject.SelectproductObject;

public class SelectproductHelper extends pageAction {
	   public static void selectProduct(WebDriver driver) {
		  clicker(by.xpath,SelectproductObject.startShopping,driver);
		   clicker(by.xpath,SelectproductObject.categories, driver);
		   clicker(by.xpath, SelectproductObject.wirelessAirpods, driver);	
	}
}
