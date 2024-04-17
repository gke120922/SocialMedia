package org.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMethod {

	public static WebDriver driver;

	public static void openBrowser() {

		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void sendValue(WebElement we, String value) {

		we.sendKeys(value);
	}

	public static void closebrowser() {

		driver.close();
	}

}