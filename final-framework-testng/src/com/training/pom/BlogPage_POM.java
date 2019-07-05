package com.training.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class BlogPage_POM {


		private WebDriver driver; 
		
		public BlogPage_POM(WebDriver driver) {
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
		
		
		@FindBy(xpath="//a[contains(text(),'Blog')]")
		private WebElement blogLink;
		
		@FindBy(xpath="//p[text()='New Launch in Home']//following-sibling::a[@class='read-more']")
		private WebElement readMoreLink;
		
		@FindBy(xpath="//textarea[@id='comment' and @name='comment']")
		private WebElement commentText;
		
		@FindBy(xpath="//input[@value='Post Comment' and @name='submit']")
		private WebElement postCommentButton;
		
		
		@FindBy(xpath="//a[@class='comment-reply-link']")
		private WebElement replyUserButton;
		
		@FindBy(xpath="//div[@class='wp-menu-name'][contains(text(),'Comments')]")
		private WebElement commentsAdmin;
		
		
		
		@FindBy(xpath="//div[@class='wp-menu-name'][contains(text(),'Comments')]/span")
		private WebElement countCommentBefore;
		
		public String countCommentB4(){
			return countCommentBefore.getText();
		}
		
		@FindBy(xpath="//*[@id=\"comment-1871\"]/td[2]/div[3]/span[3]")
		private WebElement rr;
		
		
		
		public void mouseOverComment() {
			String before = "//p[text()='";
			String after = "']";
			String commentToHover = commentText.getText();
			String parentComment = before+commentToHover+after;
			WebElement cc = driver.findElement(By.xpath(parentComment));
			
			
			Actions tr = new Actions(driver);
			tr.moveToElement(cc).perform();
			WebElement subElement = driver.findElement(By.linkText("Reply"));
			 
	        tr.moveToElement(subElement);
	 
	        tr.click();
	 
	        tr.perform();
			//tr.moveToElement(rr).build().perform();
			//rr.click();
		}
		@FindBy(xpath="//div[@class='wp-menu-name'][contains(text(),'Comments')]/span")
		private WebElement countCommentAfter;
		
		public String countCommentA4(){
			return countCommentAfter.getText();
		} 
	 

		
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
		
		
		
		public void blogLinkClick()
		{
			this.blogLink.click();
		}
		
		
		public void readMore()
		{			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			this.readMoreLink.click();

		}
		
		public void  commentTextArea(String commentText)
		{
			this.commentText.sendKeys(commentText);
		}
		
		public void postCommentButtonClick()
		{
			this.postCommentButton.click();
		}
		public void replyUserButtonClick()
		{
			this.replyUserButton.click();
		}
		public void commentsAdminMenuClick()
		{
			this.commentsAdmin.click();
		}
		
		
	}



