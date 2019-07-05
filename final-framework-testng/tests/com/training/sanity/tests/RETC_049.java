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

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.BlogPage_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
//import org.apache.log4j.Logger;

public class RETC_049 {
	
  // static final logger log= new logger.getLogger(RETC_049.class);
	private WebDriver driver;
	private String baseUrl;
	
	private static Properties properties;
	//private ScreenShot screenShot;
	private LoginPOM loginPOM;
	private BlogPage_POM BlogPage_POM;
	//private static ExtentReports extent;
	//private ExtentTest logger;

	@BeforeClass 
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		//extent = new ExtentReports("C:\\JAVA\\Selenium\\Project\\RETC_048\\RETC_048.html");
		
	}

	@BeforeMethod 
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);		
		baseUrl = properties.getProperty("baseURL");
		loginPOM = new LoginPOM(driver); 
		BlogPage_POM = new BlogPage_POM(driver);
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
  @Test(priority=1)
  public void properties() throws InterruptedException 
      {
		//logger =extent.startTest("login test");
		//logger.log(LogStatus.INFO," loggin test");
	    loginPOM.loginlinkclick();
		loginPOM.sendUserName("qa.sureshot@gmail.com");
		//logger.log(LogStatus.PASS," Username entered");
		loginPOM.sendPassword("suresh@123");
		loginPOM.clickLoginBtn(); 
		//logger.log(LogStatus.PASS," Logged in correctly");
		//screenShot.captureScreenShot("First");
		BlogPage_POM.blogLinkClick();
		BlogPage_POM.readMore();	
		BlogPage_POM.commentTextArea("suresh");
		BlogPage_POM.postCommentButtonClick();
		BlogPage_POM.replyUserButtonClick();
		
		//BlogPage_POM.addNewRegionButtonClick();
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		
		
		  
		  //Thread.sleep(5000);
		  
		 
		 System.out.println(" !! Congrats !! Test User Logged out ");
		
      }
	    
	  
      
 
	
	
	
@Test(priority=2)
public void properties2() throws InterruptedException 
    {
	//driver = DriverFactory.getDriver(DriverNames.CHROME);		
	//baseUrl = properties.getProperty("baseURL");
		//logger =extent.startTest("login test");
		//logger.log(LogStatus.INFO," loggin test");
	    loginPOM.loginlinkclick();
		loginPOM.sendUserName("admin");
		//logger.log(LogStatus.PASS," Username entered");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		//logger.log(LogStatus.PASS," Logged in correctly");
		//screenShot.captureScreenShot("second");
		
		BlogPage_POM.commentsAdminMenuClick();
		String Expected =BlogPage_POM.countCommentB4();
		BlogPage_POM.mouseOverComment();
		String Actual = BlogPage_POM.countCommentA4();
		
		Assert.assertEquals(Actual, Expected);
		System.out.println(Expected +" and "+ Actual);
		//BlogPage_POM.blogLinkClick();
		//BlogPage_POM.readMore();	
		//BlogPage_POM.commentTextArea("wow TC049_admin");
		//BlogPage_POM.postCommentButtonClick();
		//BlogPage_POM.replyUserButtonClick();
		
		//BlogPage_POM.addNewRegionButtonClick();
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		
		
		  
		  //Thread.sleep(5000);
		  
		 
		 System.out.println(" !! Congrats !! Suresh- RETC 049 Test case is Passed ");
		
    }

@AfterMethod
	public void tearDown1() throws Exception {
		Thread.sleep(1000);
		driver.quit();
                  }
}