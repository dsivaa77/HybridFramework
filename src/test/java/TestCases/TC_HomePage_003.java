package TestCases;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.SwagLabsHomePage;


public class TC_HomePage_003 extends BaseClass {

	SwagLabsHomePage slhp=new SwagLabsHomePage(driver);
	
	@Test
	public void saucebackpack() throws InterruptedException, IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clicklogin();
		//lp.clickmenu();
		
		Thread.sleep(3000);
		
		SwagLabsHomePage slhp=new SwagLabsHomePage(driver);
		
		slhp.slbackpack();
		Thread.sleep(3000);
		driver.navigate().back();
		slhp.addtocart();
		Thread.sleep(3000);
		slhp.remove();
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
