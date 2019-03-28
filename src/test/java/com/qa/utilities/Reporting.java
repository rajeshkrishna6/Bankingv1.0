package com.qa.utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting {

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extentreports;
	public ExtentTest extenttest;
	
	@BeforeTest
	public void setExtent()
	{
		htmlreporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myreport.html");
		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("Functional Report");
		
		extentreports =new ExtentReports();
		extentreports.attachReporter(htmlreporter);
		extentreports.setSystemInfo("hostname", "localhost");
		extentreports.setSystemInfo("OS", "Win 10");
		extentreports.setSystemInfo("Testername", "Raj");
		extentreports.setSystemInfo("Browser", "chrome");
		
	}
	
	@AfterTest
	public void endrpt()
	{
		extentreports.flush();	
	}
	@BeforeMethod
	public void setup()
	{
		
		
	}
	
	
}
