package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import OR.SwagLabs_OR;
import Utilities.ReadConfig;
import Utilities.Reporting;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	Reporting reports=new Reporting();
	SwagLabs_OR lor=new SwagLabs_OR();
	
	public String baseURL=readconfig.getApplicationURL();
	//public String baseURL="https://www.saucedemo.com/";
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		// logs purpose we write the below script
		logger= LogManager.getLogger(BaseClass.class);
	    //PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) 
		{
		System.setProperty("webdrvier.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		String profilePath="C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
		options.addArguments("user-data-dir="+profilePath);
		//for remove the automated browser pop up
		options.setExperimentalOption("useAutomationExtension",true);     
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		
		driver=new ChromeDriver(options);
		
		}else if(br.equals("ie")) {
			System.setProperty("webdrvier.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		logger.info("Browser initialization started");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		logger.info("The URL is entered in the browser");
		
		//driver.manage().window().maximize();
	}
	
    @AfterClass(enabled=false)
	public void Teardown() {
		driver.manage().deleteAllCookies();
		logger.info("The Script execution completed and browser is closed");
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Target=new File(System.getProperty("user.dir") + "/Screenshots/" + tname +".png");
		FileUtils.copyFile(source, Target);
		System.out.println("Screenshot taken");
	}	
}
