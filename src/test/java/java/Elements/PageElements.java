package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserLaunch.BrowserSetup;

public class PageElements extends BrowserSetup
{
	public static WebElement Username()
	{
		return driver.findElement(By.name("username"));

	}
	
	public static WebElement Password()
	{
		return driver.findElement(By.name("password"));

	}
	
	public static WebElement LogInbtn()
	{
		return driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']"));
	}
	
	
}
	


