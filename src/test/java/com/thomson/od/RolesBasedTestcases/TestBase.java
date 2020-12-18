package com.thomson.od.RolesBasedTestcases;

import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlTest;

import com.thomson.od.opendistroPages.LoginPage;

import Utilities.ConfigReader;

public class TestBase {
	public static WebDriver driver = null;	
	public static ConfigReader configProp = null;
	Logger log = Logger.getLogger(TestBase.class);
	
	
	
	@BeforeTest
	public void preCondition(XmlTest xmltest)throws Exception
		{
		
			configProp =  new ConfigReader();
			
		    String browserName=configProp.getBrowser();		    
		    log.info("Getting browser parameter from testng.xml:"+browserName);
		    String baseURL = configProp.getUrl();
			if(browserName==null)			
			   browserName=configProp.getBrowser();
		
			if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\"+"Drivers\\geckodriver_v0.21.0_win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\"+"Drivers\\chromedriver_87\\chromedriver.exe");
				 driver=new ChromeDriver();
			}
				
		
			driver.manage().deleteAllCookies();
			driver.navigate().to(baseURL);
						Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			LoginPage loginpage= new LoginPage(driver); 
		loginpage.Login("admin", "admin");
		}
	 

	@AfterTest
	public void postCondition()
	{
	
	driver.quit();
	}

}
