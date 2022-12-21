package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPageObjects;

public class RegisterFormTest {
	
	public static void main(String[]args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.way2automation.com/demo.html");
	
	RegistrationPageObjects.Registrationclick(driver).click();
	RegistrationPageObjects.Name(driver).sendKeys("Prince");
	RegistrationPageObjects.Phone(driver).sendKeys("12345678");
	RegistrationPageObjects.Email(driver).sendKeys("Imman@gmail.com");

	RegistrationPageObjects.Country(driver).sendKeys("india");
	RegistrationPageObjects.City(driver).sendKeys("chennai");
	RegistrationPageObjects.Username(driver).sendKeys("imman27");
	RegistrationPageObjects.Password(driver).sendKeys("12456789");
	RegistrationPageObjects.submit(driver).click();
	}
}
