package com.testdrive.dataproviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testdrive.utils.TestDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParabankLogin {

	WebDriver driver;

//	@BeforeMethod
	@Test
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80L));

	}

	@Test(dataProvider = "loginUsersData", dataProviderClass = TestDataProvider.class)
	public void validateLoginUsers(String loginUsername, String loginPassword) {

		driver.findElement(By.name("username")).sendKeys(loginUsername);
		driver.findElement(By.name("password")).sendKeys(loginPassword);
		driver.findElement(By.cssSelector("[value='Log In']")).click();

//		WebElement homePageTitle = driver.findElement(By.xpath("//h1[text()='Accounts Overview']"));
//		
//		if (homePageTitle.isDisplayed()) {
//			Assert.assertTrue(homePageTitle.isDisplayed());
//			System.out.println("Login success by--> "+ loginUsername);
//		} else {
//			System.out.println("!!!!Login Failed!!!");
//		}

//		driver.findElement(By.xpath("//a[text()='Log Out']")).click();

		System.out.println(loginUsername +" | " + loginPassword);

		driver.navigate().refresh();

	}

//	@AfterMethod
	public void endTest() {

		driver.quit();

	}

}
