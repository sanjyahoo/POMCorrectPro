package com.htap.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htap.qa.base.TestBase;

public class AppointmentsPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Upcoming']")
	WebElement upcomingSection;
	
	@FindBy(xpath="//span[text()='Past']")
	WebElement pastSection;
	
	@FindBy(xpath="//span[text()='Show More']")
	WebElement showMore;
	
	public AppointmentsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public boolean checkUpcomingSection()
	{
		return upcomingSection.isDisplayed();
	}
	public boolean checkPastSection()
	{
		return pastSection.isDisplayed();
	}
	public void showMoreitems()
	{
		showMore.click();
	}
	

}
