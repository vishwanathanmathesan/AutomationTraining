package com.amamzon.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {
	/**
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @param driver
	 */
	public static void clickEvent(String locatorType, String locatorValue, WebDriver driver) {
		switch (locatorType) {
		case "id":
			driver.findElement(By.id(locatorValue)).click();
			break;
		case "name":
			driver.findElement(By.name(locatorValue)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "linkText":
			driver.findElement(By.linkText(locatorValue)).click();
			break;
		case "partialLinkText":
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		case "className":
			driver.findElement(By.className(locatorValue)).click();
			break;
		case "cssSelector":
			driver.findElement(By.cssSelector(locatorValue)).click();

		}
	}

	/**
	 * Customized method for sending keyvalue to the WebElement
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @param KeyValue
	 * @param driver
	 */
	public static void sendKey(String locatorType, String locatorValue, String KeyValue, WebDriver driver) {
		switch (locatorType) {
		case "id":
			driver.findElement(By.id(locatorValue)).sendKeys(KeyValue);
			break;
		case "name":
			driver.findElement(By.name(locatorValue)).sendKeys(KeyValue);
			break;
		case "xpath":
			driver.findElement(By.xpath(locatorValue)).sendKeys(KeyValue);
			break;
		case "linkText":
			driver.findElement(By.linkText(locatorValue)).sendKeys(KeyValue);
			break;
		case "partialLinkText":
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(KeyValue);
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorValue)).sendKeys(KeyValue);
			break;
		case "className":
			driver.findElement(By.className(locatorValue)).sendKeys(KeyValue);
			break;
		case "cssSelector":
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(KeyValue);
		}
	}

	/**
	 * method for locateElement in the webPage and it returns an WebElement
	 * 
	 * @param locatorType
	 * @param locatorValue
	 * @param driver
	 * @return webElement
	 */
	public static WebElement find(String locatorType, String locatorValue, WebDriver driver) {
		WebElement element = null;

		switch (locatorType) {
		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "linkText":
			element = driver.findElement(By.linkText(locatorValue));
			break;
		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "tagName":
			element = driver.findElement(By.tagName(locatorValue));
			break;
		case "className":
			element = driver.findElement(By.className(locatorValue));
			break;
		case "cssSelector":
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		return element;
	}

	public void clickEvent(WebElement element) {
		element.click();
	}

	public void sendKey(WebElement element, String keyValue) {
		element.sendKeys(keyValue);
	}
}
