package com.facebook.locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
	WebDriver driver;
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void idLocatorsTest() {
		driver.findElement(By.id("email")).sendKeys("naher");
		
	}
	@Test
	public void linkTextLocatorsTest() {
		driver.findElement(By.linkText("Games")).click();
		/*<a href="https://www.facebook.com/recover/initiate/?
		privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk0Mz
		U4ODk4LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_
		login">Forgot password?</a>
		*/
		//tag==a
		
	}
	@Test
	public void partialLinkTextLocatorsTest() {
		//if link text is too big
		//if link text has space between
		//if link text has number in between
		//then it is better partial link text
		//compound element
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
	}

}
