package com.htap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.htap.qa.base.TestBase;
import com.htap.qa.pages.AppointmentsPage;
import com.htap.qa.pages.HomePage;
import com.htap.qa.pages.LoginPage;
import com.htap.qa.pages.TaskPage;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	TaskPage taskPage;
	AppointmentsPage apptPage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomepageTitle()
	{
		String title = homepage.VeriyHomePageTitle();
		Assert.assertEquals(title, "Home - DrConnect by HealthTap");
	}
	
	@Test(priority=2)
	public void verifylogo()
	{
		boolean flag = homepage.checkHomepageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void checkUserlabel()
	{
		String title = homepage.checkLabel();
		Assert.assertEquals(title, "Hi Ashutosh,");
	}
	
	@Test(priority=4)
	public void clickTask()
	{
		taskPage = homepage.clickTask();
		
	}
	
	@Test(priority=5)
	public void clickAppt()
	{
		apptPage = homepage.clickapptLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
