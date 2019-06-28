package com.training.pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class RETC_016_POM 

{
	private WebDriver driver; 

public RETC_016_POM(WebDriver driver) {
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

@FindBy(xpath="//a[@class='row-title']")
private WebElement rowTitle;

@FindBy(xpath="//a[@class='submitdelete']")
private WebElement trash;
		

@FindBy(linkText="Undo")
private WebElement undoLink;




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
public void rowTitle() {
	Actions tr = new Actions(driver);
	tr.moveToElement(rowTitle).build().perform();
	tr.moveToElement(trash).build().perform();
	trash.click();
}

public  void  clickUndoLink() {
	this.undoLink.click();
}

}
