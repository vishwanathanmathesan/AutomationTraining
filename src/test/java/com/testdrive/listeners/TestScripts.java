package com.testdrive.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.testdrive.listeners.TestNGListeners.class)

@Test(groups = "smoke")
public class TestScripts {

	@Test(groups = "smoke")
	public void test1() {

		System.out.println("Test 1");
	}

	@Test(groups = { "windows.smoke" })
	public void test2() {

		System.out.println("Test 2");
		Assert.assertTrue(false);
	}

	@Test(groups = { "windows.regression" })
	public void test3() {

		System.out.println("Test 3");

	}

}
