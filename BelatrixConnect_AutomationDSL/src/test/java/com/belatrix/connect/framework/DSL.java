package com.belatrix.connect.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param locator
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}

}
