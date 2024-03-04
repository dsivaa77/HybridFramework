package TestCases;

import org.testng.annotations.Test;

import PageObjects.Pageobjects;

public class TC_Products_004 extends BaseClass{
	
	
	@Test(priority=1)
	public void logintest() throws InterruptedException
	{
	Pageobjects po=new Pageobjects(driver);
	po.setUserName(username);
	logger.info("The User name "+username+" is entered in the username field ");
	po.setPassword(password);
	logger.info("The password "+password+ " is entered the Password field");
	po.clicklogin();
	logger.info("click the login button");
	Thread.sleep(3000);
	po.clickmenu();
	logger.info("Click the menu bar");
	po.aboutoptioninmenu();
	logger.info("About option is clicked");
	po.pricingmenu();
	logger.info("The pricing page is opened");
	Thread.sleep(9000);
	po.productsmenu();
	logger.info("Products menu is mouse hover");
	Thread.sleep(9000);
	//po.developersmenu();
	}
	@Test(priority=2)
	public void crossbrowser() {
		Pageobjects po=new Pageobjects(driver);
		po.crossbrowser();
		logger.info("Sause cross browser element is clicked");
	}
	@Test(priority=3,enabled=false)
	public void platformt() {
		Pageobjects po=new Pageobjects(driver);
		po.platform();
	}
	@Test(priority=4)
	public void orchastrate() throws InterruptedException {
		Pageobjects po=new Pageobjects(driver);
		po.productsmenu();
		po.orchastrate();
		Thread.sleep(6000);
	}
	
	
}
