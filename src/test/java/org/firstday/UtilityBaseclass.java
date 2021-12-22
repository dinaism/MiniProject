package org.firstday;



	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class UtilityBaseclass {
		public static WebDriver driver;
		
		public static WebDriver lanchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			return driver;
		}
		public static void lanchUrl(String url) {
			driver.get(url);
		}
	   public static void browserMaximize() {
		driver.manage().window().maximize();
	}
		public static void userText(WebElement element,String text) {
			element.sendKeys(text);
		}
	   public static void btnClick(WebElement element) {
		element.click();
	   }
	   public static void copyText() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	  }
	   public static void selectTab() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
	   public static void pasteText() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	   }
	   public static void mouseOver(WebElement element){
		Actions a=new Actions(driver);
	   a.moveToElement(element).perform();
	  }
	   public static void CopyPaste(WebElement element,WebElement element1) {
		Actions a=new Actions(driver);
		a.dragAndDrop(element1, element1).perform();
		
	  }
	   public static void keyBoard(WebElement element,String text) {
		Actions a=new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(element, text).keyUp(Keys.SHIFT).perform();
	   }
	   public static void doubleClick() {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	   }
	   public static void rightClick() {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	 }
	   public static void switchToAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	   }
		public static void alartCofirm() {
			Alert al = driver.switchTo().alert();
			al.dismiss();
		}
		public static void alertPrompt(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
	}
	   public static void screenshotLogo(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(path);
		FileUtils.copyFile(tem, perm);
	}
	  public static void pageScroll(String javascript,WebElement element) {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript(javascript, element);
	  }
	   
	 public static void webpageFrame(String id) {
		driver.switchTo().frame(id);
	 }
		public static void frameWebelment(WebElement element){
		driver.switchTo().frame(element);
		}
		public static void frameIndex(int index) {
		driver.switchTo().frame(index);
		}
		public static void mainFrame() {
		driver.switchTo().defaultContent();
		}
	 public static void windowHandle(String Id) {
		driver.switchTo().window(Id);
	   }
		public static void windowHandles(String allWindow) {
		driver.switchTo().window(allWindow);
		}
	 public static void dropDown(WebElement element,String value) {
		 Select s= new Select(element);
		 s.selectByValue(value);
		 }
	 public static void dropDownText(WebElement element,String text) {
		 Select s= new Select(element);
		 s.selectByVisibleText(text);
		 }
	 public static void dropDownIndex(WebElement element,int index) {
		 Select s= new Select(element);
		 s.selectByIndex(index);
		 }
	 public static void dropDownDeSelect(WebElement element,int index) {
		 Select s= new Select(element);
		 s.deselectByIndex(index);
		 }
	 public static void dropDownDeSelectVal(WebElement element,String value) {
		 Select s= new Select(element);
		 s.deselectByValue(value);
	 }
	 public static void dropDownDeSelectText(WebElement element,String text) {
		 Select s= new Select(element);
		 s.deselectByVisibleText(text);
	 }
	 public static String excelSHeet(String path,String name,int rows,int cells) throws IOException {
	    File f=new File(path);
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sh = w.getSheet(name);
		Row row = sh.getRow(rows);
		Cell cell = row.getCell(cells);
				int c = cell.getCellType();
				String value;
				if (c==1) {
					 value = cell.getStringCellValue();
					
				}
					else if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat s=new SimpleDateFormat("dd.M.yyyy");
						 value = s.format(date);
						
					}
					else {
						double d = cell.getNumericCellValue();
						long l=(long)d;
						 value = String.valueOf(l);
						
					}
				return value;	
				
}
