package org.bass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner extends BaseClass {

	public static WebDriver driver;
	
	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Lokesh\\eclipse-workspace\\MavenFirstDay\\driver\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();

		driver = getbrowser("Chrome");
		
//		driver.get("http://automationpractice.com/index.php");

		url("http://automationpractice.com/index.php");
		// driver.manage().window().maximize();

		WebElement singIn = driver.findElement(By.xpath("//a[@class='login']"));
		ClickOnElement(singIn);

		WebElement email = driver.findElement(By.id("email"));
		inputValueElement(email, "dina.ism@gmai.com");

		WebElement passwd = driver.findElement(By.id("passwd"));
		inputValueElement(passwd, "Apache@88");

		WebElement singinbtn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		ClickOnElement(singinbtn);

	}
}
