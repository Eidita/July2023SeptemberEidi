package com.facebook.locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularCSS {
	WebDriver driver;
	@BeforeMethod
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
}
	@Test
	public void loginTest() {
		//css id
		//driver.findElement(By.cssSelector("#email")).sendKeys("faruq");
		driver.findElement(By.cssSelector("[id='email']")).sendKeys("faruq");
	
		//css name
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("adag");
	//driver.findElement(By.cssSelector(".pass")).sendKeys("adag");
	
		
		//start with
		driver.findElement(By.cssSelector("[id^='u_0_5_Mp']")).click();
		//driver.findElement(By.cssSelector("#^u_0_5")).click();
	driver.quit();
	}

}
