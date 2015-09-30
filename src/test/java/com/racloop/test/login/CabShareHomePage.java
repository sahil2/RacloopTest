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

public class CabShareHomePage {
	public static WebDriver driver;
	public static String baseUrl = "http://localhost:8082";
	HelperClass helper = new HelperClass();
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

	//@Test
	public void emptyfromandto() {
		driver.findElement(By.id("searchFormMainFrom")).click();
		driver.findElement(By.id("searchFormMainFrom")).sendKeys("");
		driver.findElement(By.id("searchFormMainTo")).click();
		driver.findElement(By.id("searchFormMainTo")).sendKeys("");
		driver.findElement(By.id("searchFormMainSearchButton")).click();
		WebElement click = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='CabShare']")));
		Assert.assertNotNull(click);
}
	@Test
	public void rideSearch() {
		driver.findElement(By.id("searchFormMainFrom")).click();
		driver.findElement(By.id("searchFormMainFrom")).sendKeys("Delhi, India");
		helper.pause(500);
		driver.findElement(By.id("searchFormMainTo")).click();
		driver.findElement(By.id("searchFormMainTo")).sendKeys("Chandigarh, India");
		helper.pause(500);
		driver.findElement(By.name("date")).sendKeys("09/30/2015");
		helper.pause(10000);
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
//}
}
}