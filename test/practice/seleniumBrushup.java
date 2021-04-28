package practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class seleniumBrushup {
	RemoteWebDriver driver;
	//WebDriver driver1;

	@BeforeSuite

	public void methodA() {
		System.out.println("Before suite");
	}

	@BeforeTest

	public void setupBrowser() {

		System.out.println("Before test");
		System.setProperty("webdriver.chrome.driver", "D:\\UIUXChange\\EwQIMS10.5.0\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver1 = new ChromeDriver();
	}

	@BeforeClass
	public void methodX() {

		System.out.println("Before class");
		/*
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 */
	}

	@BeforeMethod

	public void methodB() {
		System.out.println("before method");

	}

	@Test
	public void verifyGoogle() throws Throwable {
		
		/*
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * 
		 * String expectedTitle = "Google"; String actualTitle = driver.getTitle();
		 * Assert.assertEquals(actualTitle, expectedTitle);
		 * 
		 * // driver.findElement(xpath="//input[@title='Search']");
		 * 
		 * WebElement ele1 = driver.findElementByXPath("//input[@title='Search']");
		 * 
		 * ele1.sendKeys("test"); ele1.sendKeys(Keys.ENTER);
		 * 
		 * List<WebElement> list = driver.findElementsByTagName("a");
		 * 
		 * int numberOfLinks = list.size();
		 * System.out.println("Then number of links in the webpage is:" +
		 * numberOfLinks); this.snapshot();
		 * 
		 */
		
		 
		 
		  
		  
		  
		  ArrayList<String> list1= new ArrayList<String>();
		 
		list1.add("java");
		list1.add("selenium");
		list1.add("csharp");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		
		
		

		System.out.println("@test run1");
		driver.close();

	}
	
	public void snapshot() throws Throwable {
		//TakesScreenshot srcShot=((TakesScreenshot)driver);
		  
		 File  srcFile=driver.getScreenshotAs(OutputType.FILE);
		 File destFile=new File("E:\\ss\\testimage.png");
		 
		 FileUtils.copyFile(srcFile, destFile);
	}

	/*
	 * @Test public void verifyTitleFB() { driver1.get("https://www.facebook.com/");
	 * driver1.manage().window().maximize(); driver1.close();
	 * 
	 * 
	 * 
	 * String expectedTitle="Facebook"; String actualTitle=driver1.getTitle();
	 * Assert.assertEquals(actualTitle, expectedTitle);
	 * 
	 * System.out.println("@test run2");
	 * 
	 * }
	 */

	@AfterMethod
	public void methodC() {
		// driver.close();
		System.out.println("After method");
	}

	@AfterClass

	public void methodD() {
		System.out.println("After class");
	}

	@AfterTest

	public void close() {
		System.out.println("After Test");

	}

	@AfterSuite
	public void methodE() {
		System.out.println("After Suite");
	}

}
