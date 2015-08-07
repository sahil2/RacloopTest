package com.racloop.test.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErrorVerifyMobile {
	
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
		driver.findElement(By.cssSelector("html body#ext-element-3.x-desktop.x-linux.x-firefox.x-landscape div#ext-viewport.x-container.x-sized div#ext-element-4.x-body div#ext-element-2.x-inner.x-layout-card div#ext-mainNavigationView-1.x-container.x-navigationview.x-layout-card-item.x-sized div#ext-element-511.x-dock.x-dock-vertical.x-sized div#ext-element-512.x-dock-body div#ext-element-356.x-inner.x-navigationview-inner.x-layout-card form#ext-loginForm-1.x-container.x-form.x-paint-monitored.x-layout-card-item.x-sized div#ext-element-563.x-body.x-scroll-view div#ext-element-564.x-scroll-container.x-translatable-container.x-paint-monitored.x-size-monitored div#ext-element-535.x-inner.x-form-inner.x-scroll-scroller-vertical.x-translatable.x-size-monitored.x-paint-monitored.x-scroll-scroller div#ext-container-28.x-container.x-unsized div#ext-element-558.x-inner div#ext-element-559.x-innerhtml div.links a.small-text-medium.colored-text")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[3]/div/div[2]/div/form[3]/div[1]/div[2]/div[1]/div[2]/span[3]")).click();
	}

}