package com.testdrive.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksImages {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80L));
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		

		System.out.println("All links: " + linkList.size());
		
		
		
		
		
		
		
		
		
		
		

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (int i = 0; i < linkList.size(); i++) {

			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript") )) {
				activeLinks.add(linkList.get(i));
			}
		}

		System.out.println("Only active links: " + activeLinks.size());

		
		/*
		 * 200 ok 
		 * 404 not found 
		 * 500 internal error 
		 * 400 bad request
		 * 
		 */
		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			

			connection.connect();
			String responseMessage = connection.getResponseMessage();
			int responseCode = connection.getResponseCode();
			connection.disconnect();

			System.out.println("URL " + j + ": " + activeLinks.get(j).getAttribute("href") + " ========" + responseCode
					+ "======> " + responseMessage);
			System.out.println(" ");

		}

	}

}
