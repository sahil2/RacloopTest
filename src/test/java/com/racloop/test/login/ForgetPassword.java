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


public class ForgetPassword {
	
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
	public void emptyEmail() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement emptyemail = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptyemail);
		driver.findElement(By.id("loginFormForgetPasswordLink")).click();
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.id("forgotPasswordFormRetrievePasswordButton")).click();
	}
	
	@Test
	public void wrongEmail() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement wrongemail = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(wrongemail);
		driver.findElement(By.id("loginFormForgetPasswordLink")).click();
		driver.findElement(By.name("email")).sendKeys("abcd");
		driver.findElement(By.id("forgotPasswordFormRetrievePasswordButton")).click();
		
	}
	
	@Test
	public void forgetPasswordsuccess() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		WebElement forgetpass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(forgetpass);
		driver.findElement(By.id("loginFormForgetPasswordLink")).click();
		driver.findElement(By.name("email")).sendKeys("admin@racloop.com");
		driver.findElement(By.id("forgotPasswordFormRetrievePasswordButton")).click();
		WebElement element = driver.findElement(By.xpath("//*[.='Sign In']"));
		Assert.assertNotNull(element);
	}

}