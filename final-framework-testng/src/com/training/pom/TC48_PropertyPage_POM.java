package com.training.pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TC48_PropertyPage_POM {


		private WebDriver driver; 
		
		public TC48_PropertyPage_POM(WebDriver driver) {
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
		
		
		@FindBy(xpath="//div//a[@id='region-add-toggle'][contains(text(),'Add New Region')]")
		private WebElement addNewRegionLink;
		
		
		@FindBy(xpath="//input[@id='newregion' and @class='form-required']")
		private WebElement addText;
		
	    @FindBy(xpath="//select[@id='newregion_parent' and @class='postform']")
		private WebElement	parentType;	
		
	   
		@FindBy(xpath="//input[@id='region-add-submit' and @type='button']")
		private WebElement addNewRegionButton;
		
		
		@FindBy(xpath="//input[@name='post_title' and @type='text']") 
		private WebElement enterTitle;
		
		@FindBy(xpath="//textarea[@class='wp-editor-area' and @id='content']")
	     private WebElement textArea;
		
		@FindBy(xpath="//input[@value='452' and @type='checkbox'][@id='in-region-452']")
		private WebElement RegionChkBox;	
	  	  
	  
	 
	  
	  @FindBy(xpath="//input[@name='publish'and @type='submit']") 
	  private  WebElement publishButton;
	  
	  
	  @FindBy(xpath="//a[contains(text(),'Move to Trash')]")
	  private  WebElement moveToTrash;
	 
	  @FindBy(xpath="//a[contains(text(),'Trash ')]")
	  private WebElement trashLink;

		
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
	
	  public void enterTileText(String enterTitle) 
	  { 
		  this.enterTitle.clear();
	  this.enterTitle.sendKeys(enterTitle);
	  
	  } 
	  public void textAreaBox(String textArea) 
	  { 
		  this.textArea.clear();
	  this.textArea.sendKeys(textArea);
	  
	  } 
	  
	  public void regionCheckkBox() 
	  {
		  this.RegionChkBox.click();
	  
	  } 
	  
	  public void publishButtonClick() { driver.switchTo().defaultContent();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	  this.publishButton.click();
	  
	  }
	 
		
		public void addNewRegionLinkClick() {
			this.addNewRegionLink.click();			
			
		}
		public void addTextInTextBox(String addText) {
			this.addText.sendKeys(addText);;			
			
		}
		public void parentTypeDropDown() {
			Select s = new Select(this.parentType);
			s.selectByVisibleText("   North Bangalore");
			
		}
		
		
		public void addNewRegionButtonClick() {
			this.addNewRegionButton.click();
			
		}
		public void moveToTrashLink() {
			this.moveToTrash.click();
			
		}	
		
		public  void  clickTrashLink() {
			this.trashLink.click();
		}
		
		
	}



