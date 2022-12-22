package com.amazon.test;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	public static int userOption = 0;
	Scanner scanner=new Scanner(System.in);
	public LaunchBrowsers(){
		System.out.println("Which Browser Do you want");
		System.out.println("1.To Chrome");
		System.out.println("2.To Edge");
		System.out.println("3.To Firefox");
		int uo=scanner.nextInt();
		userOption=uo;
	}
	public  WebDriver launch(WebDriver driver) {
		switch(userOption) {
		case 1:
			System.out.println("Launching Chrome_Browser");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.amazon.in/");
			System.out.println("amazon webpage opened Using chromeBrowser");
			
		case 2:
			System.out.println("Launching Microsoft_Edge_Browser");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.amazon.in/");
			
		}
		return driver;
	}
	public  WebDriver
	launchChromeBrowser(WebDriver driver) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using chromeBrowser");
		return driver;
	}
	public static WebDriver launchFireBoxBrowser(WebDriver driver) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using FireBoxBrowser");
		return driver;
	}
	public static WebDriver launchEdgeBrowser(WebDriver driver) {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		System.out.println("amazon webpage opened Using microsoftEdgeBrowser");
		return driver;
	}
}
