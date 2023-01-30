package com.testdriver.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.testdrive.extentreports.ExtentReporter;
import com.testdrive.helpers.LoginHelper;
import com.testdriver.testbase.TestBase;

public class LoginTest extends TestBase {

	LoginHelper loginHelper = new LoginHelper();

	@BeforeTest
	public void startReports() {
		startReport("LoginTest");
//		ExtentReporter.logger = ExtentReporter.extent.startTest("SuccessLogin1Report");
	}

	@Test
	public void successLogin() {
		ExtentReporter.logger = ExtentReporter.extent.startTest("SuccessLogin1Report");
		loginHelper.validUserLogin3(driver);
		assertTrue(false, "Test Failed...");
	}

	@Test
	public void successLogin2() {
		ExtentReporter.logger = ExtentReporter.extent.startTest("SuccessLogin2Report");

		loginHelper.validUserLogin3(driver);
		System.out.println("TestPassed");
	}

	@Test
	public void successLogin3() {
		ExtentReporter.logPassedStepToReportWithScreenshot(driver, ExtentReporter.logger, "Test_3 appended");

		System.out.println("TestPassed");
	}

}
