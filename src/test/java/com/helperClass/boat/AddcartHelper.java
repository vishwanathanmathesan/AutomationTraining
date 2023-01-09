package com.helperClass.boat;

import org.openqa.selenium.WebDriver;

import com.pageAction.by;
import com.pageAction.pageAction;
import com.pageObject.AddcartObject;

public class AddcartHelper extends pageAction {
 public static void addCart(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);	
	 clicker(by.xpath, AddcartObject.airPodsAnc, driver ); 
     // clicker(by.xpath, AddcartObject.color, driver);  	 
     //  clicker(by.xpath,AddcartObject.increaseQuantity , driver);       
        clicker(by.xpath, AddcartObject.addCartButton, driver);
       Thread.sleep(2000);
       clicker(by.xpath, AddcartObject.placeOrder, driver);
 }
}