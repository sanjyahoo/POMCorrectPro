package com.htap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htap.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory: OR
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//a[text() ='Log in']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signuplink;
	
	@FindBy(xpath="//div[@class='discoveryLogo']")
	WebElement image;
	
	//Initializing Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogoImage()
	{
		return image.isDisplayed();
	}
	public HomePage login(String un, String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
		return new HomePage();
	}
	
}
