package org.bass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automated {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lokesh\\eclipse-workspace\\MavenFirstDay\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement singIn = driver.findElement(By.xpath("//a[@class='login']"));
		singIn.click();

		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		email.sendKeys("dina.ism@gmail.com");

		WebElement click = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		click.click();

		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id("id_gender1"));
		gender.click();

		WebElement fName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		fName.sendKeys("Dinesh");

		WebElement lName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lName.sendKeys("Kumar");

		// WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		// emailid.sendKeys("dina.ism@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Apache@88");

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		dropdown.selectByIndex(30);

		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByIndex(3);

		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByIndex(32);

		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("dinesh");

		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("kumar");

		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("No. 6, 5th Street, washinton");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");

		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByIndex(6);

		WebElement Zip = driver.findElement(By.id("postcode"));
		Zip.sendKeys("12345");

		Select Country = new Select(driver.findElement(By.id("id_country")));
		Country.selectByIndex(1);

		WebElement Ph = driver.findElement(By.id("phone_mobile"));
		Ph.sendKeys("9884969799");

		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("chennai");

		WebElement regi = driver.findElement(By.xpath("//span[text()='Register']"));
		regi.click();

	}

}
