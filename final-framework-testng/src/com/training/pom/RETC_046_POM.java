package com.training.pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RETC_046_POM {


		private WebDriver driver; 
		
		public RETC_046_POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[contains(text(),' Log In / Register')]")
		private WebElement loginLink;
		
		@FindBy(id="user_login")
		private WebElement userName; 
		
		@FindBy(id="user_pass")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement loginBtn; 
		
		
		@FindBy(xpath="//div[@class='wp-menu-name'][contains(text(),'Properties')]")
		private WebElement propertiesLink;
		
		@FindBy(xpath="//a[@class='page-title-action'][contains(text(),'Add New')]")
		private WebElement addNewButton;
		
		@FindBy(xpath="//input[@name='post_title' and @type='text']")
		private WebElement enterTitle;
		
		@FindBy(xpath="//textarea[@class='wp-editor-area' and @id='content']")
		private WebElement textArea;
		
		@FindBy(xpath="//input[@value='416' and @type='checkbox'][@id='in-property_feature-416']")
		private WebElement featureChkBox;
		
		@FindBy(xpath="//input[@value='58' and @type='checkbox'][@id='in-region-58'][@name='tax_input[region][]']")
		private WebElement regionChkBox;
		
		
		
		@FindBy(xpath="//h1[@class='wp-heading-inline']")
		private WebElement element;
		
		@FindBy(xpath="//input[@name='publish'and @type='submit']")
		private WebElement publishButton;

		
		public void loginlinkclick()
		{
			this.loginLink.click();
		}
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendPassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void clickLoginBtn() {
			this.loginBtn.click(); 
		}
		public void propertiesLinkclick() {
			this.propertiesLink.click(); 
		}
		
		public void addNewButtonclick() {
			this.addNewButton.click(); 
			
		}
		public void enterTileText(String enterTitle) {
			this.enterTitle.clear(); 
			this.enterTitle.sendKeys(enterTitle);
			
		}
		public void textAreaBox(String textArea) {
			this.textArea.clear(); 
			this.textArea.sendKeys(textArea);
			
		}
		public void featureCheckkBox() {
			this.featureChkBox.click();			
			
		}
		public void regionCheckkBox() {
			this.regionChkBox.click();			
			
		}
		public void publishButtonClick() {
			driver.switchTo().defaultContent();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			//js.executeScript("arguments[0].click();",publishButton);
			this.publishButton.click();			
			
		}
		

		
		
	}



