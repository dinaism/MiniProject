package org.bass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lokesh\\eclipse-workspace\\MavenFirstDay\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Lokesh\\eclipse-workspace\\MavenFirstDay\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		

		return driver;

	}

	public static void ClickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void url(String value) {
		driver.get(value);

	}

	public static void Close() {

		driver.close();

	}

	public static void Quit() {
		driver.quit();

	}

}
