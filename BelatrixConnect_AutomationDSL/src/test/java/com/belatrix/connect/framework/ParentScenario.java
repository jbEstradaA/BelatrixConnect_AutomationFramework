package com.belatrix.connect.framework;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParentScenario {
	private WebDriver driver;
	//Create Object from the pages 
	protected LoginPage loginPage;
	protected TabLinearLayout tabLinearLayout;
	protected SideBarNavigation sideBarNavigation;
	protected AlertMessageTwoOptions alertMessageTwoOptions;
	protected MainProfilePage mainProfilePage;

	public void startAndroid() {
		String url = null;
		url = "http://127.0.0.1:4723/wd/hub";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "CB5A28Q2LU");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.belatrixsf.connect");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

		try {
			driver = new AndroidDriver<WebElement>(new URL(url), cap);
		} catch (Exception e) {
			System.out.println("Exepcion al momento de generar el Driver" + e);
		}
		//Instants the Objects Page
		loginPage = new LoginPage(driver);
		tabLinearLayout = new TabLinearLayout(driver);
		sideBarNavigation = new SideBarNavigation(driver);
		alertMessageTwoOptions = new AlertMessageTwoOptions(driver);
		mainProfilePage = new MainProfilePage(driver);
	}

	protected void navigateTo(String url) {
		driver.navigate().to(url);
	}

	protected void closeDriver() {
		driver.quit();
	}
}