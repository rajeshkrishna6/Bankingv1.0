package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpwd;
	
	@FindBy(name="btnLogin")
	WebElement buttonclick;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setpwd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void btnclk()
		{
		buttonclick.click();
		}
	
	
}
