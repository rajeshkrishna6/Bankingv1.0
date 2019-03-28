package com.qa.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig  readcon =new ReadConfig();
	
	public String BaseURL=readcon.getapplicationurl();
	public String Username= readcon.Uname();
	public String passwd=readcon.pwd();
	
	//public String chrompath=readcon.getchromepath();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=Logger.getLogger("banking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equals("chrome"))
		{
		 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ((ReadConfig) readcon).getchromepath());
		  System.setProperty("webdriver.chrome.driver", readcon.getchromepath());
		  driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
		  System.setProperty("webdriver.gecko.driver", readcon.getfirefoxpath());
		  driver=new FirefoxDriver();
		}
		driver.get(BaseURL);
		logger.info("URL opened");
		
	}
		
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	
	
	public void capturescreen(WebDriver driver,String tname) throws IOException
	{
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			File target= new File(System.getProperty("user.dir")+ "/screenshots/" + tname + ".png");
			FileUtils.copyFile(source,target);
			System.out.println("Screenshot taken");
	}
}
