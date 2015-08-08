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

public class Register {
	
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
	public void emptyFields() {
		driver.findElement(By.xpath("//*[.='Back']"));
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Search Rides']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(element);
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("registerFormRegisterButton")).click();
			
	}
//	@Test
//	public void emptyEmail() {
//		driver.findElement(By.name("email")).sendKeys("sahil@ezzie.in");
//		driver.findElement(By.name("password")).sendKeys("password");
//		driver.findElement(By.name("name")).sendKeys("sahil");
//		driver.findElement(By.name("mobile")).sendKeys("9875642359");
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form[2]/div[1]/div[2]/div[1]/div[2]/span[3]")).click();
//	
//}
}
