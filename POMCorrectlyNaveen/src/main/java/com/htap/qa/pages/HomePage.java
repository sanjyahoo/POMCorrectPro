package com.htap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.htap.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//h2[text()='Hi Ashutosh,']")
	@CacheLookup
	WebElement userLabel;
	
	@FindBy(xpath="//img[@alt='Discovery']")
	WebElement checkLogo;
	
	@FindBy(xpath="//div[text()='Tasks']")
	WebElement taskLink;
	
	@FindBy(xpath="//div[text()='Appointments']")
	WebElement apptLink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VeriyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkHomepageLogo()
	{
		return checkLogo.isDisplayed();
		
	}
	
	public String checkLabel()
	{
		return userLabel.getText();
	}
	
	public TaskPage clickTask()
	{
		taskLink.click();
		return new TaskPage();
	}
	public AppointmentsPage clickapptLink()
	{
		apptLink.click();
		return new AppointmentsPage();
	}

}
