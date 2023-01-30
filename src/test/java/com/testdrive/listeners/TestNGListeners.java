package com.testdrive.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("From Listener*********Test Started***" + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("From Listener*********Test Success***" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("From Listener*********Test Failed***" + result.getName());

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("From Listener*********Test Skiped***" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("From Listener*********Test Completed***" + context.getName());

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
