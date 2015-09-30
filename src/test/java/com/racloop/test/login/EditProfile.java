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

public class EditProfile {
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
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='CabShare']")));
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
	public void emptyName() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		helper.pause(500);
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Profile')]")).click();
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("");
		driver.findElement(By.id("editProfileFormButton")).click();
		helper.pause(1000);
		WebElement edit = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(edit);
		driver.findElement(By.className("mainTabsSettings")).click();
		WebElement aelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(aelement);
		driver.findElement(By.className("settingNavigationViewLogout")).click();
		WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Profile']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(logout);
    	driver.findElement(By.xpath("//*[.='Sign In']"));
	   	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
		
	}
	

	@Test
	public void editName() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
		helper.pause(500);
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Profile')]")).click();
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("Sahil");
		
		driver.findElement(By.className("editProfileFormButton")).click();
		
		WebElement edit = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(edit);
				
		driver.findElement(By.className("mainTabsSettings")).click();
		WebElement aelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(aelement);
		driver.findElement(By.className("settingNavigationViewLogout")).click();
		WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Profile']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(logout);
    	driver.findElement(By.xpath("//*[.='Sign In']"));
	   	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
		
	}
		
		

}
