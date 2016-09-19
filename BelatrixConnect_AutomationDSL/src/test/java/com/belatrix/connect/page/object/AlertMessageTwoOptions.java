package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AlertMessageTwoOptions  extends ParentPage{
	
	public AlertMessageTwoOptions(WebDriver driver) {
		super(driver);
	}
	
	By CONTENT_MESSAGE = By
			.id("android:id/content");
	By MESSAGE = By.
			id("android:id/message");
	By YES_OPTION = By.
			id("android:id/button1");
	By NO_OPTION = By.
			id("android:id/button2");
	
	public void answerYes()
	{
		click(YES_OPTION);
	}

}
