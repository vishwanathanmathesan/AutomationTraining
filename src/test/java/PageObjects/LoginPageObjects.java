package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	
	public static WebElement username(WebDriver driver) 
	   {
		   return driver.findElement(By.xpath("(//input[@name='username'])[2]"));
	   }
	public static WebElement password(WebDriver driver) 
	   {
		   return driver.findElement(By.xpath("(//input[@name='password'])[2]"));
	   }
	public static WebElement submit(WebDriver driver) 
	   {
		   return driver.findElement(By.xpath("(//input[@class='button'])[2]"));
	   }
    
}
