package TestCases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.Pageobjects;



public class TC_HomePage_003 extends BaseClass {

	Pageobjects hp=new Pageobjects(driver);
	
	@Test
	public void saucebackpack() throws InterruptedException, IOException {
		
		Pageobjects lp=new Pageobjects(driver);
		
		lp.setUserName(username);
		logger.info("Entered the user name in the user name field");
		lp.setPassword(password);
		logger.info("Entered the password in the password field");
		lp.clicklogin();
		logger.info("Click the login button");
		//lp.clickmenu();
		
		Thread.sleep(3000);
		
		Pageobjects hp=new Pageobjects(driver);
		
		hp.slbackpack();
		Thread.sleep(3000);
		driver.navigate().back();
		hp.addtocart();
		logger.info("The product added to cart");
		Thread.sleep(3000);
		hp.remove();
		logger.info("The product is removed from the cart");
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Sauce Labs Bike Light");
		
		if(res==true) {
			assertTrue(true);
		}
		else
		{
			captureScreen(driver,"SwagLabsHomePage");
			assertTrue(false);
		}
	
	
	}
}
