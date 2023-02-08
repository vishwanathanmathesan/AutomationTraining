package org.handlinwebtables;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableWithPages {
	static WebDriverWait wait;
	static JavascriptExecutor executor ;
public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void LaunchingApplication() {
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		executor=(JavascriptExecutor)driver;
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[text()=' Login']")).click();
		driver.findElement(By.xpath("//a[text()=' Sales']")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();				
		}
		
	public static void TotalNumOfPages()
	{
		String Text = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 108 (11 Pages)']")).getText();
		int TotalNumOfPages = Integer.valueOf(Text.substring(Text.indexOf("(")+1,Text.indexOf("Pages")-1));
		System.out.println("Total Number Of Pages is : " + TotalNumOfPages);
	}
	
	public static void OpencartTable() throws InterruptedException
	{
		String Text = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 108 (11 Pages)']")).getText();
		int TotalNumOfPages = Integer.valueOf(Text.substring(Text.indexOf("(")+1,Text.indexOf("Pages")-1));
		
		for(int p=1 ; p<TotalNumOfPages ; p++)
		{
		WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		System.out.println("Active Page : " + active_page.getText());
		//executor.executeScript("arguments[0].click()",active_page);	
		
		List<WebElement> NumberOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr"));
		int rows = NumberOfRows.size();
		System.out.println("Number Of Rows : "+ rows);
		
		for(int r=1 ; r<=rows ; r++) {
	
			String order_id = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[2]")).getText();
			String CustomerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[4]")).getText();
			String status =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]//td[5]")).getText();
		//	System.out.println()
			if(status.equals("Pending"))
			{
				System.out.println(order_id+"  "+CustomerName+"   "+status);

			}
		}
	    String pageno = Integer.toString(p+1);
		WebElement nextpage = driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+pageno+"']"));
		wait.until(ExpectedConditions.elementToBeClickable(nextpage));
		executor.executeScript("arguments[0].click()",nextpage);
		Thread.sleep(3000);
		}
		
	}

	public static void main(String[] args) throws InterruptedException
	{
	LaunchingApplication();	
	//TotalNumOfPages();
	OpencartTable();
	driver.quit();
	}
	
}
