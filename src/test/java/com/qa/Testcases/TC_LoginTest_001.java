package com.qa.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void LoginTest() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(Username);
		logger.info("Username entered");
		lp.setpwd(passwd);
		logger.info("Password entered");
		lp.btnclk();
		logger.info("Button clicked");
		
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))	
		{
		Assert.assertTrue(true);
		logger.info("Login successful");
		}
	else
		{
		capturescreen(driver, "LoginTest");
		Assert.assertTrue(false);
		logger.info("Login failed");
		}
	}
}
