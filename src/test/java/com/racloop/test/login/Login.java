package com.racloop.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		driver.get("http://localhost:8082");
	}

	@After
	public void tearDown() throws Exception {
//		String logoutUrl = "http://localhost:8080/app/userMobile/logout";
//		driver.get(logoutUrl);
    }

	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form/div[1]/div[2]/div[1]/div[4]/div/div/div/a[1]")).click();
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form[2]/div[1]/div[2]/div[1]/div[2]/span[3]")).click();
		
	}

}
