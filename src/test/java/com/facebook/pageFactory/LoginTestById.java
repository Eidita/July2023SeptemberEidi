package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.pageObjectModel_LogInPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestById {

	WebDriver driver;
	String userNameId="email";//create an instance variable
	String userPassId="pass";
	
	
	LoginPage loginPage;//building has a relationship with Login page
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
}
	//@Test
	public void validLoginTest() {
		findById(userNameId).sendKeys("eidi");
		findById(userPassId).sendKeys("ta");
		//findById("pass").click();
	}
	//@Test
	public void invalidLoginTest() {
		findById(userNameId).sendKeys("eidi");
		findById(userPassId).sendKeys("ta");
		//findById("pass").click();
	}
	//we were using driver for findElement so many times
	//we were using same locators so many times
	
	
	@Test
	public void boundaryLoginTest() {
		findById(userNameId).sendKeys("eidi");
		findById(userPassId).sendKeys("ta");
		//findById("pass").click();
	}
	
	public WebElement findById(String id) {
		return driver.findElement(By.id(id));//helper method
		//only use for one method calling
	
	}
}
