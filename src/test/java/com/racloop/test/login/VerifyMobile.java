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
	public static String verifycode = "http://localhost:8080/app/sampleData/verificationCode?mobile=7307392447&secret=s3cr3t";
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.get(verifycode);
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
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement empty = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(empty);
	    driver.findElement(By.id("loginFormVerifyMobileLink")).click();
	    WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(link);
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.name("verificationCode")).sendKeys("");
		driver.findElement(By.id("verifySmsFormVerifyMobileButton")).click();
				
	}
	
	@Test
	public void wrongMobileAndVerificationCode() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement empty = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(empty);
	    driver.findElement(By.id("loginFormVerifyMobileLink")).click();
	    WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(link);
		driver.findElement(By.name("mobile")).sendKeys("12345");
		driver.findElement(By.name("verificationCode")).sendKeys("12345");
		driver.findElement(By.id("verifySmsFormVerifyMobileButton")).click();
				
	}
	@Test
	public void blankFieldsResendSMS() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement empty = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(empty);
	    driver.findElement(By.id("loginFormVerifyMobileLink")).click();
	    WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(link);
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.name("verificationCode")).sendKeys("");
		driver.findElement(By.className("emailCls")).click();
		WebElement sms = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    Assert.assertNotNull(sms);
				
	}
	
	@Test
	public void verifyMobile() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement empty = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(empty);
	    driver.findElement(By.id("loginFormVerifyMobileLink")).click();
	    WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(link);
		driver.findElement(By.name("mobile")).sendKeys("8427836228");
		driver.findElement(By.name("verificationCode")).sendKeys("274106");
		driver.findElement(By.className("emailCls")).click();
		WebElement sms = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    Assert.assertNotNull(sms);
				
	}
}
