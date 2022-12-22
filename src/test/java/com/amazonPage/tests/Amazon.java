package com.amazonPage.tests;

import com.amazon.test.*;

import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;
	public static void main(String []args) {
		LaunchBrowsers launchBrowser=new LaunchBrowsers();
		WebDriver driverObject =launchBrowser.launch(driver);
		
	}
}
