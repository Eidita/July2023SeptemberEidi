package com.facebook.locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {
	WebDriver driver;
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" ");

}
	@Test
	public void doubleXpathTest() {
		driver.findElement(By.xpath("//input[@id='email'] [@name='email']")).sendKeys("jkj");
		//by default condition
	}
	@Test
	public void orCondition() {
		driver.findElement(By.xpath("//input[@name='pass'or @id='pass1']")).sendKeys("jkj");
		//either ne must should be good
		// @id='pass1'] is wrong but still working
	}
	@Test
	public void andCondition() {
		driver.findElement(By.xpath("//button[@name='login'and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		// both has to be right
	}}
