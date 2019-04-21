package com.htap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.htap.qa.base.TestBase;
import com.htap.qa.pages.AppointmentsPage;
import com.htap.qa.pages.HomePage;
import com.htap.qa.pages.LoginPage;

public class AppointmentPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	AppointmentsPage apptPage;
	
	public AppointmentPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		apptPage = homepage.clickapptLink();		
	}
	@Test(priority=1)
	public void checkUpcomingsection()
	{
		Assert.assertTrue(apptPage.checkUpcomingSection());
	}
	@Test(priority=2)
	public void checkPastSection()
	{
		Assert.assertTrue(apptPage.checkPastSection());
	}
	@Test(priority=3)
	public void checkShowMore()
	{
		apptPage.showMoreitems();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
