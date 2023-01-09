package com.workout;

 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          driver.get("https://demo.automationtesting.in/Alerts.html");
     WebElement clickAlert = driver.findElement(By.cssSelector(".btn.btn-danger"));
          clickAlert.click();
        Alert alert =driver.switchTo().alert();
           alert.accept();
      Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        WebElement clickCancel = driver.findElement(By.cssSelector(".btn.btn-primary"));
          clickCancel.click();
      Alert alert1=  driver.switchTo().alert();
           alert1.dismiss();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.cssSelector(".btn.btn-info")).click();
        Alert alert3 = driver.switchTo().alert();
      Thread.sleep(2000);
        
        
        
      String a1=  alert3.getText();
     String a2 = "ganesh";
      alert3.sendKeys(a2);
        Thread.sleep(2000);
        alert3.accept();
         System.out.println(a1); 
        
	}

}
