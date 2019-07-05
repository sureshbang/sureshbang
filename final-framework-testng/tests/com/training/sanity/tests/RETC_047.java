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
import com.training.pom.RETC_047_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_047 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RETC_047_POM RETC_047_POM;

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
		RETC_047_POM = new RETC_047_POM(driver);
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
		RETC_047_POM.propertiesLinkclick();
		RETC_047_POM.addNewButtonclick();	
		RETC_047_POM.addNewFeatureLinkClick();
		RETC_047_POM.addTextInTextBox("interior");
		RETC_047_POM.parentTypeDropDown();
		
		RETC_047_POM.addNewFeatureButtonClick();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		  RETC_047_POM.enterTileText("prestige4777");
		  RETC_047_POM.textAreaBox("home town47777"); 
		  RETC_047_POM.featureCheckkBox();
		  Thread.sleep(5000);
		  
		  RETC_047_POM.publishButtonClick();
		 System.out.println(" !! Congrats !! Suresh- RETC 047 Test case is Passed ");
		
      }
	    
	  
      
  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
                   }
}