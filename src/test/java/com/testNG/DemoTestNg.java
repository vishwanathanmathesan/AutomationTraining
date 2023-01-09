package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestNg {

	@Test
	@Parameters("url")
	public static void BeforeMethode(@Optional String Url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
	}
	@Test
	public static void test2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}
	
}
