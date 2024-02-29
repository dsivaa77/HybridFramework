package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement textusername;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement passwordd;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement login;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	public void setUserName(String uname) {
		textusername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		passwordd.sendKeys(pwd);
	}
	
	public void clicklogin() {
		login.click();
	}
	
	public void clickmenu() {
		menu.click();
	}
	
	public void clicklogout() {
		logout.click();
	}
	
	
	
	
}
