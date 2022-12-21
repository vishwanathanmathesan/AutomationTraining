package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPageObjects;

public class LoginPageTest 
{
	@SuppressWarnings("deprecation")
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php#login");
		driver.findElement(By.className("fancybox")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		LoginPageObjects.username(driver).sendKeys("Prince1234");;
		LoginPageObjects.password(driver).sendKeys("123456");;
		LoginPageObjects.submit(driver).click();
	}
}
	
	
	
	
	
	/*public void BrowserLaunch() 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.way2automation.com/demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	/*LoginPageObjects.Registrationclick(driver);
	LoginPageObjects.Signinclick(driver);
	LoginPageObjects.username(driver);
	LoginPageObjects.password(driver);
	LoginPageObjects.submit(driver);*/
	
    

