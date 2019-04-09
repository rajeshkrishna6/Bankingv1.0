package com.qa.Testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageObjects.LoginPage;
import com.qa.pageObjects.NewCustomer;

public class TC_AddCustomer_002 extends BaseClass {

	
@Test
public void addnewcust() throws InterruptedException, IOException
{
	LoginPage ip=new LoginPage(driver);
	ip.setusername(Username);
	ip.setpwd(passwd);
	ip.btnclk();
	Thread.sleep(3000);

	NewCustomer ncustom=new NewCustomer(driver);
	ncustom.clicknewcustomer();
	
	ncustom.custname("Raj");
	ncustom.radgender("male");
	ncustom.dob("10","15","2019");
	Thread.sleep(3000);
	ncustom.address("Sneha sadan apts");
	ncustom.city("chennai");
	ncustom.state("Tamilnadu");
	ncustom.pinnum("600028");
	ncustom.telenumber("45678922");
	Thread.sleep(3000);
	
	String emailtxt=randomgenstr() + "@gmail.com";
	ncustom.custemail(emailtxt);
	ncustom.passwd("krishna");
	ncustom.btnclick();
	Thread.sleep(3000);
	
	boolean res =driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if (res ==true)
	{
	Assert.assertTrue(true);	
	}
	else
	{
		capturescreen(driver,"NewCustomer");
		Assert.assertTrue(false);
	}
}

	public String randomgenstr()
{
	String str=RandomStringUtils.randomAlphabetic(8);
	return str;
}

}
