package TestCases;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObjects.Pageobjects;

public class TC_NeedHelp extends BaseClass {
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
	po.productsmenu();
	logger.info("The products menu is opened");
	po.platformconfigurator();
	Thread.sleep(5000);
	po.documentation();
	Thread.sleep(5000);
	}
	@Test(priority=2)
	public void documentation() {
		Pageobjects po=new Pageobjects(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(300.0)");
		po.documentation();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=3)
    public void documentationtab() {	
		//String mainwindowhandle=driver.getWindowHandle();
		//System.out.println(mainwindowhandle);
		//String mainwindowtitle=driver.switchTo().window(mainwindowhandle).getTitle();
		//logger.info("The main window title is "+mainwindowtitle);
		Set<String> windowhandles=driver.getWindowHandles();
		
		for(String window:windowhandles) {
			String t=driver.switchTo().window(window).getTitle();
			System.out.println(t);
			if(t.contains("Sauce Labs Documentation, Developer Community & Resources | Sauce Labs Documentation")) {
				driver.switchTo().window(window);
			}
				
		}
		
	//	for(String handle:windowhandles) {
	//		if(!handle.equals(mainwindowhandle)) {
				
	//			driver.switchTo().window(handle);
	//		}
	//	}	
		Pageobjects po=new Pageobjects(driver);
		po.docsearch();
	}
	@Test(priority=4)
	public void searchbox() {
		Pageobjects po=new Pageobjects(driver);
		po.searchbox();
	}
	
	
	
	
	
	
	
	
}
