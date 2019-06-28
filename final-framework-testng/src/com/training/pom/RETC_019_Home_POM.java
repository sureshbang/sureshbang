package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RETC_019_Home_POM 

{
	private WebDriver driver; 

public RETC_019_Home_POM(WebDriver driver) {
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

@FindBy(xpath="//a[contains(@href,'edit-tags.php?taxonomy=category')]")
private WebElement categoriesLink;

@FindBy(xpath="//input[@type='checkbox' and @name='delete_tags[]']")
private WebElement categoriesCheckBox;

@FindBy(xpath="//select[@id='bulk-action-selector-top' and @name='action']")
private WebElement bulkActionsDropDown;

@FindBy(xpath="//input[@type='submit' and @id='doaction']")
private WebElement applyButton;




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
public  void CategorieLink() {
	this.categoriesLink.click();
	
           }
public  void categoriesCheckBox() {
	this.categoriesCheckBox.click();
	
           }
public void bulkActionsDropDown() {
	Select sel = new Select(this.bulkActionsDropDown);
	sel.selectByIndex(1);
}
public void applyButtonClick() {
	this.applyButton.click();
}

}
