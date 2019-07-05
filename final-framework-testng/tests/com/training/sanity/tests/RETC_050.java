package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RETC_047_POM;
import com.training.pom.TC48_PropertyPage_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_050 {
	
//static final logger log= new logger(RETC_048.class);
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private TC48_PropertyPage_POM TC48_PropertyPage_POM;
	//private static ExtentReports extent;
	//private ExtentTest logger;
	private RETC_047_POM RETC_047_POM;

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
		loginPOM = new LoginPOM(driver); 
		TC48_PropertyPage_POM = new TC48_PropertyPage_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
  @Test
  public void properties() throws InterruptedException 
      {
		//logger =extent.startTest("login test");
		//logger.log(LogStatus.INFO," loggin test");
	    loginPOM.loginlinkclick();
		loginPOM.sendUserName("admin");
		//logger.log(LogStatus.PASS," Username entered");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		//logger.log(LogStatus.PASS," Logged in correctly");
		screenShot.captureScreenShot("First");
		TC48_PropertyPage_POM.propertiesLinkclick();
		TC48_PropertyPage_POM.addNewButtonclick();	
		TC48_PropertyPage_POM.enterTileText("prestige49");
		TC48_PropertyPage_POM.textAreaBox("home town48");
		 RETC_047_POM.featureCheckkBox();
		TC48_PropertyPage_POM.regionCheckkBox();
				
		TC48_PropertyPage_POM.moveToTrashLink();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		TC48_PropertyPage_POM.clickTrashLink();
		Thread.sleep(4000);
		
		//div//div//table/tbody/tr/td/strong[contains(text(),'bombay')]
		String before = "//div//div//table/tbody/tr/td/strong[contains(text(),'";
		String after = "']";
		WebElement eetitle= driver.findElement(By.xpath("//input[@name='post_title' and @type='text']"));
		String etitle = eetitle.getText();
		String parentComment = before+etitle+after;
		WebElement expected = driver.findElement(By.xpath(parentComment));
		String e= expected.getText();
		WebElement Actual = driver.findElement(By.xpath("//div//div//table/tbody/tr/td/strong[contains(text(),'prestige49')]"));
		String a= Actual.getText();
		Assert.assertEquals(a, e, "pass");
		
		  
		  //Thread.sleep(5000);
		  
		  
		 System.out.println(" !! Congrats !! Suresh- RETC 050 Test case is Passed ");
		
      }
	    
	  
      
  @AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
                   }
}