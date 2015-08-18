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

public class BeforeLoginLinks {
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

//	@Test
//	public void loginlink() {
//		driver.findElement(By.id("searchFormSignInLink")).click();
//		WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
//		Assert.assertNotNull(login);
//		driver.findElement(By.id("mainNavigationViewBack")).click();
//		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='CabShare']")));
//		Assert.assertNotNull(home);
//	}
//	@Test
//	public void forgetPasswordlink() {
//		driver.findElement(By.id("searchFormSignInLink")).click();
//		WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(signin);
//		driver.findElement(By.id("loginFormForgetPasswordLink")).click();
//		WebElement forgetpass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Forgot Password']")));
//		Assert.assertNotNull(forgetpass);
//		driver.findElement(By.id("mainNavigationViewBack")).click();
//		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
//		Assert.assertNotNull(home);
//
//}
//	
//	@Test
//	public void verifyMobilelink() {
//		driver.findElement(By.id("searchFormSignInLink")).click();
//		WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(signin);
//		driver.findElement(By.id("loginFormVerifyMobileLink")).click();
//		WebElement forgetpass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Verify Mobile']")));
//		Assert.assertNotNull(forgetpass);
//		driver.findElement(By.id("mainNavigationViewBack")).click();
//		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
//		Assert.assertNotNull(home);
//
//}
//	
//	@Test
//	public void registerlink() {
//		driver.findElement(By.id("searchFormRegisterLink")).click();
//		WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
//		Assert.assertNotNull(login);
//		driver.findElement(By.id("mainNavigationViewBack")).click();
//		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='CabShare']")));
//		Assert.assertNotNull(home);
//
//}
	
	@Test
	public void termslink() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(login);
		driver.findElement(By.id("registerFormTermsLink")).click();
		WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Terms of Use']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(link);
		driver.findElement(By.id("mainNavigationViewBack")).click();
		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		Assert.assertNotNull(home);

}
//	@Test
//	public void privacylink() {
//		driver.findElement(By.id("searchFormRegisterLink")).click();
//		WebElement login = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(login);
//		driver.findElement(By.id("registerFormPrivacyLink")).click();
//		WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Data Privacy']")));
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Assert.assertNotNull(link);
//		driver.findElement(By.id("mainNavigationViewBack")).click();
//		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
//		Assert.assertNotNull(home);
//
//}
}