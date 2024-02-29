package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.util.Assert;

import PageObjects.LoginPage;
import Utilities.Reporting;

public class TC_LoginTest001 extends BaseClass {
	
    
    @Test
    public void LoginTest() throws InterruptedException {
        
    	logger.info("URL is logged");
    	String title=driver.getTitle();
    	logger.info("Title is printed");
    	
    	System.out.println(title);
    	
    	LoginPage lp=new LoginPage(driver);
    	
    	lp.setUserName(username);
    	logger.info("UserName is entered");
    	logger.error("This is error log message");
    	logger.fatal("Fatal message");
    	logger.debug("debug message");
    	logger.warn("warn message");
    	
    	lp.setPassword(password);
    	logger.info("Password is entered");
    	
    	lp.clicklogin();
    	logger.info("login button clicked");
    	
    	Thread.sleep(3000);
    }
	@Test
    public void failedcase() throws IOException {
    	String title=driver.getTitle();
    	if(title.equals("SAS title page")) {
    		logger.info("Title is matched");
    	}
    	else {
    		captureScreen(driver,"failedcase");
    		logger.info("Title is not matched");
    	}
    }
	
	
	
}
