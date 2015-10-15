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

public class Myrides {
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
	public void myRides() {
		driver.findElement(By.id("searchFormSignInLink")).click();
	    WebElement emptypass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    Assert.assertNotNull(emptypass);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		WebElement rides = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='My Rides']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(rides);
		driver.findElement(By.className("mainTabsjourneyNavigationView")).click();
		WebElement map = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='My Rides']")));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(map);
		driver.findElement(By.className("viewMapButton")).click();
		driver.findElement(By.className("mainTabsjourneyNavigationView")).click();
		WebElement route = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Map']")));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(route);
		driver.findElement(By.className("searchAgainButton")).click();
		helper.pause(500);
		driver.findElement(By.className("detailsButton")).click();
		driver.findElement(By.id("searchNavigationViewBack")).click();
		helper.pause(500);
		driver.findElement(By.className("confirmButton")).click();
		driver.findElement(By.className("travelBuddiesButton")).click();
		driver.findElement(By.className("cancelButton")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'No')]")).click();
		driver.findElement(By.id("journeyNavigationViewBack")).click();
		driver.findElement(By.className("mainTabsjourneyNavigationView")).click();
		WebElement home = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='My Rides']")));
		Assert.assertNotNull(home);
		
		
		
		
	}

}
