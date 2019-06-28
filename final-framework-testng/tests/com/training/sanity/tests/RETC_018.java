package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RETC_018_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_018 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private RETC_018_POM RETC_018_POM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		
		loginPOM = new LoginPOM(driver); 
		RETC_018_POM = new RETC_018_POM(driver);
		
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
		
		RETC_018_POM.postLink();
		Thread.sleep(2000);
	
		RETC_018_POM.CategorieLink();
		
		Thread.sleep(2000);
		RETC_018_POM.nameTextCon("tc18_1");
		RETC_018_POM.slugTextCon("Slug Text entered for tc18");
		RETC_018_POM.tagDescTextCon("Tag descritpion  entered for tc18");
		RETC_018_POM.submitButtonClick();
		screenShot.captureScreenShot("RETC_018");
 //    	String ss= "tc18_1";
//		String expected = "Post published. View post";
//		screenShot.captureScreenShot("RETC_017_publish_publised post");
//		System.out.println(ss);
//		System.out.println(expected);
//		Assert.assertEquals(expected, ss);
		
      }
	    
	  
      
  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
}
}
