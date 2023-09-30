package com.facebook.pageObjectModel_LogInPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//instance variable
	WebDriver driver;   

/*
 * @param driver
 * user define constructor for POM
 */




public LoginPage(WebDriver driver) {//constructor
	//(WebDriver driver) by this we peramitarized
	//highlight driver and right click and select source-generate constructor using fields-click-ok
	super();
	this.driver = driver;//instance initiate variable
	//these 2 lines regular constructor
	PageFactory.initElements(driver, this);//when you use these lines called pom contructor.design for pom
	//PageFactory=
	//initElements=
	//pageObjectModel means
	//line number 21 and 25 is default constructor
	
}
public WebElement userName(String enterYourUserName) {
	//what is WebElement-Selenium dataType
	//userName=method name
	//it's return type method
	//driver.findElement(By.cssSelector("[id='email']")).sendKeys("faruq");basic code
	//pm style coding
	WebElement uName=driver.findElement(By.id("email"));
	uName.clear();
	uName.sendKeys(enterYourUserName);
	System.out.println("what is" + uName.getTagName());
	return uName;


}
public WebElement password(String enterYourPassword) {
	WebElement pass=driver.findElement(By.name("pass"));
	pass.clear();
	pass.sendKeys(enterYourPassword);
	return pass;
	
}

public void clickLoginButton() {
	WebElement loginButton=driver.findElement(By.name("login"));
	loginButton.click();//login variable
	
}
public WebElement forgetPassword() {
	WebElement forgetPass=driver.findElement(By.linkText("Forgot password?"));
	forgetPass.click();
	return forgetPass;
}
public WebElement createNewAccount() {
	WebElement newAccount=driver.findElement(By.linkText("Create new account"));
	newAccount.click();
	return newAccount;
}
 

}
