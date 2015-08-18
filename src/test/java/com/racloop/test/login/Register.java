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
	public static String deleteUrl = "http://localhost:8080/app/sampleData/deleteDataForUser?mobile=7307392447&secret=s3cr3t";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.get(deleteUrl);
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
	public void emptyFields() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement emptyfields = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptyfields);
		WebElement register = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(register);
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("registerFormRegisterButton")).click();
			
	}
	@Test
	public void emptyEmail() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement emptyemail = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptyemail);
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("name")).sendKeys("sahil");
		driver.findElement(By.name("mobile")).sendKeys("9875642359");
		driver.findElement(By.id("registerFormRegisterButton")).click();
	
}
	@Test
	public void emptyPassword() {
		
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement emptypass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptypass);
		driver.findElement(By.name("email")).sendKeys("sahil@ezzie.in");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("name")).sendKeys("sahil");
		driver.findElement(By.name("mobile")).sendKeys("9875642359");
		driver.findElement(By.id("registerFormRegisterButton")).click();
}
	@Test
	public void emptyName() {
		driver.findElement(By.id("searchFormRegisterLink")).click();	
		WebElement emptyname = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptyname);
		driver.findElement(By.name("email")).sendKeys("sahil@ezzie.in");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("mobile")).sendKeys("9875642359");
		driver.findElement(By.id("registerFormRegisterButton")).click();
}
	@Test
	public void emptyMobile() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement emptymob = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(emptymob);
		driver.findElement(By.name("email")).sendKeys("sahil@ezzie.in");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("name")).sendKeys("sahil");
		driver.findElement(By.name("mobile")).sendKeys("");
		driver.findElement(By.id("registerFormRegisterButton")).click();
}
	@Test
	public void Registersuccess() {
		driver.findElement(By.id("searchFormRegisterLink")).click();
		WebElement registersuccess = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Register']")));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(registersuccess);
		driver.findElement(By.name("email")).sendKeys("sahil@ezzie.in");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("name")).sendKeys("sahil");
		driver.findElement(By.name("mobile")).sendKeys("8427836228");
		driver.findElement(By.id("registerFormRegisterButton")).click();
		WebElement verify = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Verify Mobile']")));
		Assert.assertNotNull(verify);

	}

}
