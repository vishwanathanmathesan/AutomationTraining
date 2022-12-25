package HelperPackage;

import BrowserLaunch.BrowserSetup;
import PageActions.LogginInAction;
import SendDataFile.InputData;

public class Helper extends InputData {
	
	public static void StartBrowser()
	{	
		BrowserSetup.LaunchBrowser(Browser, WebsiteName);
	}
	
	public static void BeginLogInTest() 
	{
		LogginInAction.Loginactions();
	}

	public static void CloseBrowser()
	{
		BrowserSetup.EndBrowser();
	}
}
