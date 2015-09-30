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

public class SettingsLinks {
	
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

	@Test
	public void Linkstest() {
		driver.findElement(By.id("searchFormSignInLink")).click();
	    WebElement link = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(link);
		driver.findElement(By.name("email")).sendKeys("admin@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
    	driver.findElement(By.xpath("//*[.='Map']"));
    	helper.pause(500);
    	driver.findElement(By.className("mainTabsSettings")).click();
    	helper.pause(500);
    	driver.findElement(By.xpath("//span[contains(text(), 'Profile')]")).click();
    	//driver.findElement(By.className("settingNavigationViewEditProfile")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(500);
		driver.findElement(By.xpath("//span[contains(text(), 'Preferences')]")).click();
    	//driver.findElement(By.className("settingNavigationViewPreferences")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(500);
		driver.findElement(By.xpath("//span[contains(text(), 'Recurring Rides')]")).click();
    	//driver.findElement(By.className("settingNavigationViewRecurringView")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(1000);
		driver.findElement(By.xpath("//span[contains(text(), 'Change Password')]")).click();
    	//driver.findElement(By.className("settingNavigationViewChangePasswordForm")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(500);
		driver.findElement(By.xpath("//span[contains(text(), 'Data Privacy')]")).click();
    	//driver.findElement(By.className("settingNavigationViewPrivacyPanel")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(500);
		driver.findElement(By.xpath("//span[contains(text(), 'Terms and Conditions')]")).click();
    	//driver.findElement(By.className("settingNavigationViewTermsPanel")).click();
    	driver.findElement(By.id("settingNavigationViewBack")).click();
    	helper.pause(500);
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
    	//driver.findElement(By.className("settingNavigationViewLogout")).click();
    	driver.findElement(By.xpath("//*[.='Sign In']"));
	   	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
	}

}
