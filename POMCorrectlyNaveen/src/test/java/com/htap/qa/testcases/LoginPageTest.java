 package com.htap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.htap.qa.base.TestBase;
import com.htap.qa.pages.HomePage;
import com.htap.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage =  new LoginPage();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{		
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "DrConnect by HealthTap");
	}
	
	@Test(priority=2)
	public void testLogo()
	{
		boolean flag = loginpage.validateLogoImage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	public void checkLogin()
	{
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
