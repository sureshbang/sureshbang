package com.training.pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class RETC_017_POM 

{
	private WebDriver driver; 

public RETC_017_POM(WebDriver driver) {
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

//div[@class='wp-menu-name

@FindBy(xpath="//*[@id=\"menu-posts\"]/a/div[3]")  
private WebElement postsLink; 

@FindBy(xpath="//a[@href='edit.php' and @class='wp-first-item current']")
private WebElement allPostsLink;

@FindBy(xpath="//a[@href='http://realestatem1.upskills.in/wp-admin/post-new.php' and @class='page-title-action']")
private WebElement addNewButton;

@FindBy(xpath="//*[@id='title']")
private WebElement validTitle;

@FindBy(xpath="//*[@id='content']")
private WebElement validContent;

@FindBy(xpath="//*[@id='publish']")
private WebElement publishButton;

@FindBy(xpath="//*[@id='message']/p")  //*[@id="message"]/p
private WebElement postPublished;



		





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

public  void postLink() {
	this.postsLink.click();
	
           }
public  void allPostsLink() {
	this.allPostsLink.click();

          }
public  void  addNewButton() {
	this.addNewButton.click();
}

public void validTitle(String validTitle) {
	this.validTitle.clear();
	this.validTitle.sendKeys(validTitle);
}
public void validContent(String validContent) {
	this.validContent.clear();
	this.validContent.sendKeys(validContent);
}
public  void  publishButton() {
	this.publishButton.click();
}
public String postPublished(String rtext) {
	this.postPublished.getText();
	 
			rtext=postPublished.getText();
			return rtext;
}

}
