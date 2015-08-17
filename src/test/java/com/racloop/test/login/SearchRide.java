package com.racloop.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchRide {
	public static WebDriver driver;
	public static String baseUrl = "http://localhost:8082";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void emptyfromandto() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(login);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		WebElement main = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(main);
		driver.findElement(By.className("mainTabssearchNavigationView")).click();
		driver.findElement(By.id("searchFormFrom")).click();
		driver.findElement(By.id("searchFormFrom")).sendKeys("");
		driver.findElement(By.id("searchFormTabTo")).click();
		driver.findElement(By.id("searchFormTabTo")).sendKeys("");
		driver.findElement(By.className("searchCls")).click();
		WebElement ride = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(ride);
	}

//	@Test
//	public void test() {
//		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
//		driver.findElement(By.name("password")).sendKeys("qwert");
//		driver.findElement(By.id("loginFormLoginButton")).click();
//		WebElement search = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(search);
//		driver.findElement(By.name("from")).sendKeys("Delhi, India");
//		driver.findElement(By.name("to")).sendKeys("Chandigarh, India");
//		WebElement calElement=driver.findElement(By.name("date"));
//		calElement.click();
//		
//		WebElement ridesearch = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(ridesearch);
//		
	}
		
		
//		driver.findElement(By.name("date")).click();
//		driver.findElement(By.name("time")).click();;
//		driver.findElement(By.name("picker")).click();;
//		driver.findElement(By.className("searchCls")).click();
//		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Results']")));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(element);
//	}





