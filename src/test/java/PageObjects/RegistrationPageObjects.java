package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	   
	   public static WebElement Registrationclick(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//a[text()='Registration']"));
	   } 
	   public static WebElement Name(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//input[@name='name']"));
	   } 
	   public static WebElement Phone(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//input[@name='phone']"));
	   }
	   public static WebElement Email(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//input[@name='email']"));
	   }
	   public static WebElement Country(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//select[@name='country']"));
	   }
	   public static WebElement City(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("//input[@name='city']"));
	   }
	   public static WebElement Username(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("(//input[@name='username'])[2]"));
	   }
	   public static WebElement Password(WebDriver driver) 
	   { 
		   return driver.findElement(By.xpath("(//input[@name='password'])[2]"));
	   }
	   public static WebElement submit(WebDriver driver)
	   {
		   return driver.findElement(By.xpath("(//input[@class='button'])[2]"));
	   }
}
