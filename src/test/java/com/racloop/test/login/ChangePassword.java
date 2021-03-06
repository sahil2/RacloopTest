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

public class ChangePassword {
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
		helper.pause(500);
		Assert.assertNotNull(element);
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void emptyChangePassword() {		
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();	
		helper.pause(1000);
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Change Password')]")).click();	
		WebElement changepass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		helper.pause(500);
		Assert.assertNotNull(changepass);
		driver.findElement(By.name("currentPassword")).sendKeys("");
		driver.findElement(By.name("newPassword")).sendKeys("");
		driver.findElement(By.className("changePasswordClickButton")).click();
		WebElement popUpBox = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Invalid Data']")));
		Assert.assertNotNull(popUpBox);
		driver.findElement(By.className("mainTabsSettings")).click();
		WebElement aelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Map']")));
		helper.pause(1000);
		Assert.assertNotNull(aelement);
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
    	WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(logout);
    	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
	}

	@Test
	public void changePassword() {
		driver.findElement(By.id("searchFormSignInLink")).click();
		helper.pause(500);
		driver.findElement(By.name("email")).sendKeys("user@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.id("loginFormLoginButton")).click();	
		helper.pause(500);
		driver.findElement(By.className("mainTabsSettings")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Change Password')]")).click();
		WebElement changepass = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		helper.pause(500);
		Assert.assertNotNull(changepass);
		driver.findElement(By.name("currentPassword")).sendKeys("qwert");
		driver.findElement(By.name("newPassword")).sendKeys("P@ssw0rd");
		driver.findElement(By.className("changePasswordClickButton")).click();
		driver.findElement(By.className("mainTabsSettings")).click();
		WebElement aelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Map']")));
		helper.pause(500);
		Assert.assertNotNull(aelement);
		driver.findElement(By.xpath("//span[contains(text(), 'Logout')]")).click();
    	WebElement logout = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Settings']")));
		Assert.assertNotNull(logout);
    	WebElement signin = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[.='Sign In']")));
		Assert.assertNotNull(signin);
		
	}	

}
