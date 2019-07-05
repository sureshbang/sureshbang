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
import com.training.pom.RETC_046_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_046 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RETC_046_POM RETC_046_POM;

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
		RETC_046_POM = new RETC_046_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
  @Test
  public void properties() throws InterruptedException 
      {
	  
	    loginPOM.loginlinkclick();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		RETC_046_POM.propertiesLinkclick();
		RETC_046_POM.addNewButtonclick();		
		RETC_046_POM.enterTileText("prestige46");
		
		RETC_046_POM.textAreaBox("home town46");
		RETC_046_POM.featureCheckkBox();
		RETC_046_POM.regionCheckkBox();
		Thread.sleep(5000);
		
		RETC_046_POM.publishButtonClick();
		
      }
	    
	  
      
  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
                   }
}