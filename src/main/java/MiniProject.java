

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\MiniProject2\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://adactinhotelapp.com/Register.php");
	
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("dinaism8");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Apache@88");
		
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("Apache@88");
		
		WebElement full_name = driver.findElement(By.id("full_name"));
		full_name.sendKeys("Dinesh Kumar");
		
		WebElement email_add = driver.findElement(By.id("email_add"));
		email_add.sendKeys("dina.ism@gmail.com");
		
		WebElement captchaform = driver.findElement(By.id("captcha-form"));
		captchaform.sendKeys("");
		
		WebElement tnc_box = driver.findElement(By.id("tnc_box"));
		tnc_box.click();
		
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();*/
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("dinaism8");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Apache@88");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		Select location = new Select(driver.findElement(By.id("location")));
		location.selectByVisibleText("London");
		
		Select hotel = new Select(driver.findElement(By.id("hotels")));
		hotel.selectByVisibleText("Hotel Creek");
		
		Select Type = new Select(driver.findElement(By.id("room_type")));
		Type.selectByIndex(1);
		
		Select Room = new Select(driver.findElement(By.id("room_nos")));
		Room.selectByVisibleText("1 - One");
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("18/12/2021");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("19/12/2021");
		
		Select room1 = new Select(driver.findElement(By.id("adult_room")));
		room1.selectByIndex(2);
		
		Select Child = new Select(driver.findElement(By.id("child_room")));
		Child.selectByIndex(1);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();		
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Dinesh");
		
		driver.findElement(By.id("last_name")).sendKeys("Kumar");
		
		driver.findElement(By.id("address")).sendKeys("Chennai");
	
		driver.findElement(By.id("cc_num")).sendKeys("552545789865123245");
		
		Select CC = new Select(driver.findElement(By.id("cc_type")));
		CC.selectByIndex(2);
		
		Select month = new Select(driver.findElement(By.id("cc_exp_month")));
		month.selectByIndex(5);
		
		Select Year = new Select(driver.findElement(By.id("cc_exp_year")));
		Year.selectByIndex(8);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("546");
		
		driver.findElement(By.id("book_now")).click();
		
		
	}

}
