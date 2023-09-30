package com.facebook.pom_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
WebDriver driver;//driver-right click-source-generate constructor using fields

public LoginPageWithPageFactory(WebDriver driver) {//default constructor
	//page object model formula=each webElement should have its own method
	//pom should have its own constructor on each page
	
	
	
	super();//using my parent one
	this.driver = driver;
	
	PageFactory.initElements(driver, this);//this handle all the locators
	//line n.13 handle line a15
	//return driver.findElement(By.id(id));
}
//formula=@FindBy(how=How.attributes/locatorName,using=values attributes/xpath/css) data type and variable name

@FindBy (how=How.ID, using="email") WebElement userNameId;//userNameId=variable name
//FindBy=annotation inside(parameter)
//How.ID, using="email"

public WebElement userNameMethod(String enterYourUserName) {
	//driver.findElement(By.id("email"));same mean is line 29
	userNameId.sendKeys(enterYourUserName);
	return userNameId;
}


@FindBy (how=How.NAME, using="pass") WebElement passwordLocator;

public WebElement passwordMethod(String enterYourPassword) {
	passwordLocator.sendKeys(enterYourPassword); 
	return passwordLocator;
}

@FindBy(how=How.XPATH, using="//button[@name='login']")  private WebElement loginButton;
public void loginButton() {
	loginButton.click();
	
}
}