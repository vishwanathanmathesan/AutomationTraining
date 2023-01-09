package jUnit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	static 	WebDriver driver;
	@BeforeClass
 public static void launch() {
 driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
 }
	@Test
   public void homePage() {
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	//	 Actions act = new Actions(driver);
	  //   WebElement hotel =driver.findElement(By.xpath("//a[normalize-space(@class)='active makeFlex hrtlCenter column']"));  
	  //     act.doubleClick(hotel).perform();

   }




}
















