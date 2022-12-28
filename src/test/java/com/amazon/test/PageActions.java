package com.amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActions {
	public static void clickEvent(String locatorType,String locatorValue,WebDriver driver) {
		char locatorType0Index=locatorType.charAt(0);
		switch(locatorType0Index) {
		case 'i':
			driver.findElement(By.id(locatorValue)).click();
			break;
		case 'n':
			driver.findElement(By.name(locatorValue)).click();
			break;
		case 'x':
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case 'l':
			driver.findElement(By.linkText(locatorValue)).click();
			break;
		case 'p':
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
		case 't':
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		case 'c':
			char locatorType1index=locatorType.charAt(1);
			if(locatorType1index=='s') {
				driver.findElement(By.cssSelector(locatorValue)).click();
			}
			else {
				driver.findElement(By.className(locatorValue)).click();
			}
			break;
		}
	}
	public static void sendKey(String locatorType,String locatorValue,String KeyValue,WebDriver driver) {
		char locatorType0Index=locatorType.charAt(0);
		switch(locatorType0Index) {
		case 'i':
			driver.findElement(By.id(locatorValue)).sendKeys(KeyValue);;
			break;
		case 'n':
			driver.findElement(By.name(locatorValue)).sendKeys(KeyValue);
			break;
		case 'x':
			driver.findElement(By.xpath(locatorValue)).sendKeys(KeyValue);
			break;
		case 'l':
			driver.findElement(By.linkText(locatorValue)).sendKeys(KeyValue);
			break;
		case 'p':
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(KeyValue);
			break;
		case 't':
			driver.findElement(By.tagName(locatorValue)).sendKeys(KeyValue);
			break;
		case 'c':
			char locatorType1index=locatorType.charAt(1);
			if(locatorType1index=='s') {
				driver.findElement(By.cssSelector(locatorValue)).sendKeys(KeyValue);
			}
			else {
				driver.findElement(By.className(locatorValue)).sendKeys(KeyValue);
			}
			break;
		}
	}
}
