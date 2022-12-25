package BrowserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static WebDriver LaunchBrowser(String Browser,String WebsiteName)
	{
		
		if(Browser.equalsIgnoreCase("chrome"))
		   {
			System.out.println("Launching Chrome browser");
			driver = new ChromeDriver();
			
		   } 
		else if(Browser.equalsIgnoreCase("Edge"))
		   {
			System.out.println("Launching Edge browser");
			driver = new EdgeDriver();
		
	       } 
		else if(Browser.equalsIgnoreCase("Firefox"))
	       {
	    	System.out.println("Launching firefox browser");
			driver = new FirefoxDriver();
			
	       } 
		else
		   {
	    	System.out.println("Enter valid bowser name: chrome or edge or firefox");
	       }
	    
		    driver.manage().window().maximize();
		    driver.get(WebsiteName);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    String Pagetitle = driver.getTitle();
		    System.out.println("The Page Title is : "+Pagetitle);
		    return driver;
		    
		    
    }
	public static void EndBrowser() 
    {
	driver.close();
    }
}
