package PageActions;

import Elements.PageElements;
import SendDataFile.InputData;

public class LogInPageActions extends InputData {
	
	public static void EnterUsername()
	{
		PageElements.Username().sendKeys("username");
	}
	public static void EnterPassword()
	{
		PageElements.Password().sendKeys("Password");
	}
	public static void LogInBtnclick()
	{
		PageElements.LogInbtn().click();
	}
 
}

