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

public class Preferences {
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
	public void preferencesContact() {
		driver.findElement(By.id("searchFormSignInLink")).click();
	    WebElement preferences = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(preferences);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		driver.findElement(By.xpath("//*[.='Map']"));
    	WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Map']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(element);
		driver.findElement(By.className("mainTabsSettings")).click();
		WebElement click = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(click);
		driver.findElement(By.className("settingNavigationViewPreferences")).click();
		WebElement insert = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Preferences']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(insert);
		driver.findElement(By.name("contactOne")).clear();
		driver.findElement(By.name("contactOne")).sendKeys("9521235648");
		driver.findElement(By.name("contactTwo")).clear();
		driver.findElement(By.name("contactTwo")).sendKeys("9521235658");
		WebElement check = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Preferences']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(check);
		driver.findElement(By.id("preferencesFormSaveButton")).click();
		WebElement save = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Preferences']")));
		Assert.assertNotNull(save);
	}

}
