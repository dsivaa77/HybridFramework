package PageObjects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import OR.SwagLabs_OR;
import TestCases.BaseClass;
import TestCases.BaseClass;

public class Pageobjects extends SwagLabs_OR {
	public WebDriver driver;
   BaseClass bc=new BaseClass();
	WebDriver ldriver;
	public String logo;
	public String hpcheck;
	public boolean hpverification;
	
	public Pageobjects(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void pagelogovalidation() {
		logo=pagelogo.getText();
		
	}
	
	public void setUserName(String uname) {
		WebDriverWait usernamewait = new WebDriverWait(driver, Duration.ofSeconds(3));
		usernamewait.until(ExpectedConditions.elementToBeClickable(textusername));
		textusername.clear();
		textusername.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		WebDriverWait passwordwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		passwordwait.until(ExpectedConditions.elementToBeClickable(passwordd));
		passwordd.clear();
		passwordd.sendKeys(pwd);
	}
	public void clicklogin() {
		WebDriverWait loginwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		loginwait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}
	
	public boolean hpcheck() {
		try {
		return pagelogo.isDisplayed();
		}
		catch(Exception e) {
		 return false;
	}	
	}
	public void clickmenu() {
		WebDriverWait Menuwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		Menuwait.until(ExpectedConditions.elementToBeClickable(menu));
		menu.click();
	}
	public void clicklogout() {
		WebDriverWait logoutwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		logoutwait.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
	}
	
	public void slbackpack() {
		slbackpack.click();
	}
	
	public void addtocart() {
		backpackatoc.click();
	}
	
	public void remove() {
		backpackremove.click();
	}
	
	//About 
	public void aboutoptioninmenu() {
		about.click();
	}
	//Products
	public void productsmenu() {
		
		Actions action=new Actions(ldriver);
		action.moveToElement(products).build().perform();
		
		}
	public void platform() {
		platformtest.click();
	}
	public void crossbrowser() {
		WebDriverWait crossbrowsertwait = new WebDriverWait(driver, Duration.ofSeconds(3));
		crossbrowsertwait.until(ExpectedConditions.elementToBeClickable(crossbrowser));
		crossbrowser.click();
	}
	public void orchastrate() {
		orchastrate.click();
	}
	
	public void platformconfigurator() {
		cofigurator.click();
	}
	public void documentation() {
		pdocumentation.click();
	}
	public void docsearch() {
		docsearch.click();
		
	}
	public void searchbox() {
		searchbox.sendKeys("Selenium",Keys.ENTER);
		//searchbox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	
	
	
	//Developers
	public void developersmenu() {
		Actions action=new Actions(ldriver);
		action.moveToElement(devloprs).build().perform();
		//developers.click();
		
	}
	public void pricingmenu() {
		pricing.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
