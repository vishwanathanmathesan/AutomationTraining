package com.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageAction {

		//get the locator type , locator and driver
	 public static void clicker(String locatorType,String locator,WebDriver driver) {
	 // use of char index identitfy the locator Type
		 //locator is a values of webElements
		 char locatorTypeIndex= locatorType.charAt(0);
		  switch(locatorTypeIndex) {
		  case'i':
		      driver.findElement(By.id(locator)).click();
		break;
		  case'n':
			   driver.findElement(By.name(locator)).click();
			  break;
		  case 'x':  
			    driver.findElement(By.xpath(locator)).click();
			    break;  
		  case'l':  
			     driver.findElement(By.linkText(locator)).click();
		          break;  
		  case'p':	  
			     driver.findElement(By.partialLinkText(locator)).click();
			     break;
		  case't':  
			      driver.findElement(By.tagName(locator)).click();
			      break;
		  case'c':  
			    char locatorTypeIndex1=locatorType.charAt(1);
			  if(locatorTypeIndex1=='s') {
			  driver.findElement(By.cssSelector(locator)).click();
			  }else {
			  driver.findElement(By.className(locator)).click();
			  }
			  break;
		
		  }	
	   }	
	public static void sendKeys(String locatorType,String locator,String keyValues,WebDriver driver) {
	    //keyValues is a sendkeys values assign perform
		char locatorTypeIndex = locatorType.charAt(0);
	     switch(locatorTypeIndex) {
	     case'i':
		      driver.findElement(By.id(locator)).sendKeys(keyValues);
		break;
		  case'n':
			   driver.findElement(By.name(locator)).sendKeys(keyValues);
			  break;
		  case 'x':  
			    driver.findElement(By.xpath(locator)).sendKeys(keyValues);
			    break;  
		  case'l':  
			     driver.findElement(By.linkText(locator)).sendKeys(keyValues);
		          break;  
		  case'p':	  
			     driver.findElement(By.partialLinkText(locator)).sendKeys(keyValues);
			     break;
		  case't':  
			      driver.findElement(By.tagName(locator)).sendKeys(keyValues);
			      break;
		  case'c':  
			    char locatorTypeIndex1=locatorType.charAt(1);
			  if(locatorTypeIndex1=='s') {
			  driver.findElement(By.cssSelector(locator)).sendKeys(keyValues);
			  }else {
			  driver.findElement(By.className(locator)).sendKeys(keyValues);
			  }
			  break;
	     } 
	  }
	}

