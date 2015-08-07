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
		driver.findElement(By.name("email")).sendKeys("admin@racloop.com");
		driver.findElement(By.name("password")).sendKeys("qwert");
		driver.findElement(By.cssSelector("html body#ext-element-3.x-desktop.x-linux.x-firefox.x-landscape div#ext-viewport.x-container.x-sized div#ext-element-4.x-body div#ext-element-2.x-inner.x-layout-card div#ext-mainNavigationView-1.x-container.x-navigationview.x-layout-card-item.x-sized div#ext-element-511.x-dock.x-dock-vertical.x-sized div#ext-element-512.x-dock-body div#ext-element-356.x-inner.x-navigationview-inner.x-layout-card form#ext-loginForm-1.x-container.x-form.x-paint-monitored.x-layout-card-item.x-sized div#ext-element-563.x-body.x-scroll-view div#ext-element-564.x-scroll-container.x-translatable-container.x-paint-monitored.x-size-monitored div#ext-element-535.x-inner.x-form-inner.x-scroll-scroller-vertical.x-translatable.x-size-monitored.x-paint-monitored.x-scroll-scroller div#ext-button-18.x-unsized.x-button.x-iconalign-left.x-button-action span#ext-element-555.x-button-label")).click();
		
	}

}
