package PageObjects;

import org.openqa.selenium.WebDriver;

public class LoginData {
	
	public static void data(WebDriver driver) 
	{
	LoginPageObjects.username(driver).sendKeys("Prince1234");;
	LoginPageObjects.password(driver).sendKeys("123456");;
	LoginPageObjects.submit(driver).click();;
	}
}
