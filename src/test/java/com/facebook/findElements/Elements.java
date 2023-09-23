package com.facebook.findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
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
	public void listOfElements() {
		List<WebElement> totalLi=driver.findElements(By.xpath("(//div[@id='pageFooter']/ul/li)"));
	int totalSize=totalLi.size();
		System.out.println(totalSize);
	for (WebElement Language : totalLi) {
		System.out.println(Language.getText());
	
	}
	for (int i = 0; i < 12; i++) {
		System.out.println(i);
	}
	
	}}


