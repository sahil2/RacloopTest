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

public class WrongInputRegister {
	
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
		driver.get("http://localhost:8082");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		helper.pause(100);
		driver.findElement(By.name("email")).sendKeys("sahil.in");
		driver.findElement(By.name("password")).sendKeys("abcd");
		driver.findElement(By.name("name")).sendKeys("sahil");
		driver.findElement(By.name("mobile")).sendKeys("98752359");
		driver.findElement(By.id("registerFormRegisterButton")).click();
		WebElement messageBox = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Invalid Data']")));
		Assert.assertNotNull(messageBox);
	}
	

}
