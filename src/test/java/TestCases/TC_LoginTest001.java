package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.util.Assert;

import PageObjects.Pageobjects;
import Utilities.Reporting;
import OR.SwagLabs_OR;

public class TC_LoginTest001 extends BaseClass {
    @Test(priority=1)
    public void PagTitle() throws IOException {
        
    	String title=driver.getTitle();
    	logger.info("The project title is "+title);
    	if(title.equalsIgnoreCase("Swag Labs"))
    	{
    		logger.info("The title is matched with expected result "+title);
    	}else {
    		captureScreen(driver,"Paglogo");
    		logger.info("The title is not matched with expected result "+title);
    	}
    }
    
     @Test(priority=2)
     public void PageLogo() throws IOException {
    	Pageobjects po=new Pageobjects(driver);
      	po.pagelogovalidation();
    	String plogo=po.logo;
    	
	    if(plogo.equalsIgnoreCase("Swag Labs"))
		{
			logger.info("The home page logo is "+plogo+" and matched with expected result Swag Labs ");
		}
		else
		{
			captureScreen(driver, "PageLogo");
		    logger.info("The home page logo is "+plogo+" not matched with expected result Swag Labs ");	
		}
     }
     
    	@Test(priority=3)
    	public void usernameandpassword() throws InterruptedException {
    	Pageobjects po=new Pageobjects(driver);
    	po.setUserName(username);
    	logger.info("The User name "+username+" is entered in the username field ");
    	po.setPassword(password);
    	logger.info("The password "+password+ " is entered the Password field");
    	po.clicklogin();
    	logger.info("click the login button");
    	Thread.sleep(3000);
    }
     @Test(priority=4)        // This test case is not working as expected will it check later
     public void homepageloginverification() throws InterruptedException {
    	 Pageobjects po=new Pageobjects(driver);	 
    	 if(po.hpcheck()) {
 			logger.info("The home page is opened");
 		}
 		else {
 			logger.info("The home page is not opened");
 		}
     }
     
}	
     
