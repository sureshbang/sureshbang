package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RETC_016_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_016 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RETC_016_POM RETC_016_POM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		RETC_016_POM = new RETC_016_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
  @Test
  public void categories() throws InterruptedException 
      {
	  
	    loginPOM.loginlinkclick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		RETC_016_POM.postLink();
		Thread.sleep(2000);
		RETC_016_POM.allPostsLink();
		//RETC_016_POM.addNewButton();
		RETC_016_POM.rowTitle();
		Thread.sleep(2000);
		RETC_016_POM.clickUndoLink();
		
      }
	    
	  
      
  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
}
}
