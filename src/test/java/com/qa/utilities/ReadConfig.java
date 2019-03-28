package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
		
		public String getapplicationurl()
		{
			String appurl=pro.getProperty("BaseURL");
			return appurl;
		}
		
		public String Uname()
		{
			String uname=pro.getProperty("Username");
			return uname;
		}
		
		public String pwd()
		{
			String password=pro.getProperty("passwd");
			return password;
		}
		
		
			public String getchromepath() {
			String chrom=pro.getProperty("chromepath");
			return chrom;
		}
		
			public String getfirefoxpath() {
				String firefox=pro.getProperty("firefoxpath");
				return firefox;
			}
	}
	

