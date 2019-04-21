package com.htap.qa.util;

import com.htap.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=60;
	public static long IMPLICIT_WAIT=20;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("");
	}

}
