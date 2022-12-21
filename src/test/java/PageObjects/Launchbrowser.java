package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser 
   {
	@SuppressWarnings("deprecation")
	public static void browserlaunch(){
     
	WebDriver driver = new ChromeDriver();
	driver.get("https://way2automation.com/way2auto_jquery/index.php#login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	}
	
	
   }   
	
        
    
