package com.racloop.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterError {
	
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
		driver.get("http://localhost:8082");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form/div[1]/div[2]/div[1]/div[4]/div/div/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form[2]/div[1]/div[2]/div[1]/div[2]/span[3]")).click();
	}

}
