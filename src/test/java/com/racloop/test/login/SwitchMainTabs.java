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

public class SwitchMainTabs {
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
	public void switchMainTabs() {
		driver.findElement(By.id("searchFormSignInLink")).click();
	    WebElement maintabs = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(maintabs);
		driver.findElement(By.name("email")).sendKeys("admin@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Map']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(element);
		driver.findElement(By.className("mainTabssearchNavigationView")).click();
		driver.findElement(By.className("mainTabsjourneyNavigationView")).click();
		driver.findElement(By.className("mainTabsHistory")).click();
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
		//driver.findElement(By.className("settingNavigationViewLogout")).click();
	   	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
	}

}
