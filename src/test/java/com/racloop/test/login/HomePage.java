package com.racloop.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
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
		driver.findElement(By.name("from")).sendKeys("Delhi, India");
		driver.findElement(By.name("to")).sendKeys("Chandigarh, India");
		driver.findElement(By.name("date")).sendKeys("07/26/2015");
		driver.findElement(By.name("time")).sendKeys("01:00 PM");
		driver.findElement(By.name("picker")).sendKeys("Taxi");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[16]/div[3]/div/div[2]/div/form/div[1]/div[2]/div[1]/div[3]/span[3]")).click();
	}

}
