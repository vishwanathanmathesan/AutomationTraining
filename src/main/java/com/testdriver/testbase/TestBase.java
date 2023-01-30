package com.testdriver.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.testdrive.extentreports.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends ExtentReporter {

//	protected static WebDriver driver;

	@BeforeMethod
	public void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80L));

//		ExtentReporter.logPassedStepToReportWithScreenshot(driver, ExtentReporter.logger, "Browser Launched with chrome");
	}

}
