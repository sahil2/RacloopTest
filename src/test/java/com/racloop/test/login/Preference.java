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

public class Preference {
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
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(element);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void InvalidEmergencycontacts() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		helper.pause(500);
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Preferences')]")).click();
		helper.pause(1000);
		driver.findElement(By.name("contactOne")).clear();
		driver.findElement(By.name("contactOne")).sendKeys("95213");
		driver.findElement(By.name("contactTwo")).clear();
		driver.findElement(By.name("contactTwo")).sendKeys("95213");
		driver.findElement(By.id("preferencesFormSaveButton")).click();
		driver.findElement(By.className("mainTabsSettings")).click();
		helper.pause(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
    	WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(logout);
	}
	
	
	@Test
	public void ValidEmergencycontacts() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		helper.pause(500);
		driver.findElement(By.className("mainTabsSettings")).click();
		helper.pause(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Preferences')]")).click();
		helper.pause(1000);
		driver.findElement(By.name("contactOne")).clear();
		driver.findElement(By.name("contactOne")).sendKeys("9542362584");
		driver.findElement(By.name("contactTwo")).clear();
		driver.findElement(By.name("contactTwo")).sendKeys("9521356425");
		driver.findElement(By.id("preferencesFormSaveButton")).click();
		driver.findElement(By.className("mainTabsSettings")).click();
		helper.pause(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
    	WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(logout);
	}
	
	

}
