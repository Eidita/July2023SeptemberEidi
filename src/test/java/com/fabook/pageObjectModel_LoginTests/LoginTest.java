package com.fabook.pageObjectModel_LoginTests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pageObjectModel_LogInPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	LoginPage loginPage;//building has a relationship with Login page
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
}
	
	@Test(priority=1)
	public void validLoginTest() {
		
		loginPage=new LoginPage(driver);
		loginPage.userName("ff");
		loginPage.password("jhjjh");
		loginPage.clickLoginButton();
	
	}
	@Test(priority=2)
	public void invalidLoginTest() {
		
		loginPage=new LoginPage(driver);
		loginPage.userName("ll");
		loginPage.password("lllll");
		loginPage.clickLoginButton();
	
	}
	@AfterMethod
	public void closeApp() {
		if (driver !=null) {
			driver.quit();
		}
	}

}
