package com.testapplication.testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helperClass.boat.AddcartHelper;
import com.helperClass.boat.FilterHelper;
import com.helperClass.boat.LoginModuleHelper;
import com.helperClass.boat.SelectproductHelper;

public class MainTest extends LaunchBrowser {
	  
 //    static SelectproductHelper obj2 = new SelectproductHelper();
  //   static FilterHelper obj3 =new FilterHelper();
  //   static AddcartHelper obj4 =new AddcartHelper();
     
     
//	public static void main(String[] args) throws Exception {	
		//setup();
       // obj1.invalid_MailId(driver);
    //    obj2.selectProduct(driver);
      //  obj3.filter(driver);
        //obj4.addCart(driver);
	//}
	@BeforeMethod
public void browserLaunch() {	
	setup();
}	
@AfterMethod
public void browserClose() {
	Close();
}
@Test	
public void loginInValid() {
	//LoginModuleHelper inValiduser = new LoginModuleHelper();
//	inValiduser.invalid_MailId(driver);
	LoginModuleHelper.invalid_MailId(driver);	
	System.out.println("invalid user");
}	
@Test
public void loginWithoutUser() {	
	LoginModuleHelper.withoutMailId(driver);
		System.out.println("without User");
}
@Test
public void loginValid() {	
	LoginModuleHelper.validMailId(driver);
   System.out.println("validuser");


}}