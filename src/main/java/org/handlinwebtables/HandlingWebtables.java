package org.handlinwebtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebtables {
public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void browsersetup() 
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://money.rediff.com/gainers?src=comp_top_nav");
	}
	
	// 1) Printing Header Values
	
	public static void Header() {
//	   
		  List<WebElement> Header = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		  for ( WebElement headerNames : Header)
				     { 
			           String Text = headerNames.getText();
			           System.out.println("The Header Name is : " + Text);
			         }
       }
	
	// 2) Finding Total number of rows
	
	public static void NumOfRows()
	   {
		  List<WebElement> AllRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		  int TotalRows = AllRows.size();
		  System.out.println("Total Number of Rows is : " + TotalRows);
	    }
	
	// 3) Finding Total number of columns
	
	public static void NumOfColumns()
		{
		   List<WebElement> AllColumns = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		   int TotalColumns = AllColumns.size();
		   System.out.println("Total Number of Columns is : " + TotalColumns);
		}
		
	// 4) Finding Total number of cells
		
	public static void NumOfCells()
		{
			List<WebElement> AllCells = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
			int TotalCells = AllCells.size();
			System.out.println("Total Number of Cells is : " + TotalCells);
		}
	
	// 5) Printing A Particular row
	
	public static void PrintingEntireRow()
		{
			List<WebElement> Entirerow = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[4]"));
			for(int i=0 ; i<Entirerow.size() ; i++) 
				  {
					 System.out.println(Entirerow.get(i).getText());
				  }	
		}
	
	// 5) Printing A Particular column
	
	public static void PrintingEntireColumn()
		{
			List<WebElement> CompanyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
			for(int i=0 ; i<CompanyNames.size() ; i++) 
				  {
				     System.out.println(CompanyNames.get(i).getText());
				  }	
		}

	// 6) Finding A Particular data from web table

	public static void statictable() 
	    {
		     WebElement First = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]"));
		     String FirstCompanyName = First.getText();
		     System.out.println("The Name of First Element is : "+ FirstCompanyName);
		     
		     WebElement EverlonSynthe = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[4]"));
		     String CurrentpriceEverlonSynthe = EverlonSynthe.getText();
		     System.out.println("The current Price for EverlonSyntheBS is ; "+ CurrentpriceEverlonSynthe);		
	    }
	
	public static void DynamicTable()
	    {
		     List<WebElement> Companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		     List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

		     for(int i=0 ; i< CurrentPrice.size(); i++ )
		       {
			     if(Companynames.get(i).getText().trim().equalsIgnoreCase("ABC India Ltd."))
			             {
				          System.out.println("The Current Price of ABC India Ltd is : " + CurrentPrice.get(i).getText() );
				          break;
			    } 
//			else 
//			     {
//				      System.out.println("Company Name Not Found");
//			     }
		        }
	    }
	
	
	
	
	
    public static void main(String[]args)	
    {
    	browsersetup();
    	//Header();
   //	NumOfRows(); 
   	//NumOfColumns();
   //	NumOfCells();
  	//PrintingEntireRow();
  // 	PrintingEntireColumn();
//  	statictable();
  	DynamicTable();
    	driver.quit();
    }
 
}
	
	
	
	
	
	
	
	
	
	
	
	

