package com.workout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class WindowHandling {
    public static void main(String[] args) {
		
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	//getWindowHandle() return string single browser window
  //  String windowId =	driver.getWindowHandle();//this will be return window Id 
    	//System.out.println(windowId);
    	
    	
  	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
    Set<String>windowIds =driver.getWindowHandles();
    	//return the multiple window id and set String to Stored 
    	//first methode iterator methode
 /*   Iterator<String>id=windowIds.iterator();
    	String parentId=id.next();
    	String childId=id.next();
    	System.out.println("parentWindowId"+parentId+"childWindowId"+childId);*/
    	
    	
    	
    //getWindowHandles()  list of string multiple browser window
    /*	  List<String>WindowList=new ArrayList(windowIds);
          String parentWindowId= WindowList.get(0);
          String childWindowId= WindowList.get(1);
    	 //Switching window 
    	driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
     driver.switchTo().window(childWindowId);
   System.out.println(driver.getTitle());*/
    //for Each methode
   
    for(String win:windowIds) {
         String title =driver.switchTo().window(win).getTitle();
         System.out.println(title);
       if(title.equalsIgnoreCase("OrangeHRM")) {
    	   driver.close();//close single browser window driver
     }
     
    }
     
     
     
     
     
     
     
     
     
     
     
    	
	}
    }
