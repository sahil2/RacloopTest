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

//http://localhost:8080/app/sampleData/refresh?number=3&secret=s3cr3t
//http://localhost:8080/app/sampleData/deleteAll?secret=s3cr3t

public class Login {
	
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
	public void emptyUserAndPassword() {
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.id("loginFormLoginButton")).click();
	}

	@Test
	public void emptyUserOnly() {
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();
	}

	@Test
	public void emptyPassword() {
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.id("loginFormLoginButton")).click();
	}

	@Test
	public void wrongUser() {
		driver.findElement(By.name("email")).sendKeys("sahil@racloop.com");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.id("loginFormLoginButton")).click();
	}

	@Test
	public void wrongPassword() {
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.id("loginFormLoginButton")).click();
	}

	@Test
	public void Loginsuccess() {
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
    	driver.findElement(By.className("settingNavigationViewLogout")).click();
    	driver.findElement(By.xpath("//*[.='Sign In']"));
	   	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
	   	
	}

}
