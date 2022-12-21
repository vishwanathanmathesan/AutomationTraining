package com.amazon.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	public static WebDriver launchChromeBrowser(WebDriver driver1) {
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver1.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using chromeBrowser");
		return driver1;
	}
	public static WebDriver launchFireBoxBrowser(WebDriver driver1) {
		driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver1.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using FireBoxBrowser");
		return driver1;
	}
	public static WebDriver launchEdgeBrowser(WebDriver driver1) {
		driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver1.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using microsoftEdgeBrowser");
		return driver1;
	}
}
