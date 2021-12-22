package com.BaseClass;

public class BaseClass {
	
	package org.bass;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;

		public static void browserLanch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			}

			
		public static void MaxWindow() {

			driver.manage().window().maximize();

		}

		public static void LanchUrl(String Url) {

			driver.get(Url);
		}

		public static void passText(WebElement element, String txt) {
			element.sendKeys(txt);

		}

		public static void buclick(WebElement element) {

			element.click();

		}

		public static void pageTitle() {
			String title = driver.getTitle();
			System.out.println("Title= " + title);

		}

		public static void pageCurrentUrl() {

			String Url = driver.getCurrentUrl();
			System.out.println("Current Url= " + Url);

		}

		public static JavascriptExecutor js;

		public static void clickByUsingJavaScript(WebElement targetWebElement) {

			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", targetWebElement);

		}
	}


}
