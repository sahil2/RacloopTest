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

public class VerifyMobile {
	
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
	public void emptyMobileAndVerificationCode() {
		driver.findElement(By.id("loginFormVerifyMobileLink")).click();
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.name("verificationCode")).sendKeys("");
		driver.findElement(By.id("verifySmsFormVerifyMobileButton")).click();
		
	}
	
	@Test
	public void wrongMobileAndVerificationCode() {
		driver.findElement(By.id("loginFormVerifyMobileLink")).click();
		driver.findElement(By.name("mobile")).sendKeys("4321");
		driver.findElement(By.name("verificationCode")).sendKeys("1234");
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(element);
		driver.findElement(By.id("verifySmsFormVerifyMobileButton")).click();
}
}