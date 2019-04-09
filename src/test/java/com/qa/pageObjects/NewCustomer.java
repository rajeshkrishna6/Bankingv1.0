package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver ldriver;
	
	public NewCustomer(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	//@FindBy(how= How.XPATH, using ="// * [text[]='New Customer'][1}")
	@FindBy (how=How.LINK_TEXT,using="New Customer")
	WebElement lnknewcustomer;
	
	@FindBy(how = How.NAME, using ="name")
	WebElement customername;
	
	@FindBy(how = How.NAME, using ="rad1")
	WebElement rdGender;
	
	@FindBy(how = How.NAME, using ="dob")
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using ="addr")
	WebElement txtaddress;
	
	@FindBy(how = How.NAME, using ="city")
	WebElement txtcity;
	
	@FindBy(how = How.NAME, using ="state")
	WebElement txtstate;
	
	@FindBy(how = How.NAME, using ="pinno")
	WebElement txtpinno;
	
	@FindBy(how = How.NAME, using ="telephoneno")
	WebElement txttelephoneno;
	
	@FindBy(how=How.NAME, using ="emailid")
	WebElement txtemailid;
	
	@FindBy(how = How.NAME, using ="password")
	WebElement txtpasswd;
	
	@FindBy(how= How.NAME,using ="sub")
	WebElement btnsubmit;
	
	
	
	public void clicknewcustomer()
	{
		lnknewcustomer.click();
	}
	
	public void custname(String cname)
	{
		customername.sendKeys(cname);
	}
	
	public void radgender(String gen)
	{
		rdGender.click();
	}
	
	public void dob(String dd,String mm, String yy)
	{
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yy);
	}
	
	public void address(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	public void city(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void state(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void pinnum(String cpinno)
	{
		txtpinno.sendKeys(cpinno);
	}
	
	public void telenumber(String telno)
	{
		txttelephoneno.sendKeys(telno);
	}
	
	public void passwd(String pwd)
	{
		txtpasswd.sendKeys(pwd);
	}
	
	public void custemail(String cmailid)
	{
		txtemailid.sendKeys(cmailid);
	}
	
	public void btnclick()
	{
		btnsubmit.click();
	}
}
