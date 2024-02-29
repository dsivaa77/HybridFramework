package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Reporting extends TestListenerAdapter {
	
	public ExtentSparkReporter spark ;
	public ExtentReports extent ;
	public ExtentTest test;
	
	
	public void onStart(ITestContext testContext) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test_Report "+timestamp+".html";
		spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/Result_Reports/"+repName);
	
	    extent = new ExtentReports();
	 
		spark.config().setDocumentTitle("Hybrid Framework");
		spark.config().setReportName("Functional Test");
		spark.config().setTheme(Theme.DARK);
	    
	    extent.attachReporter(spark);
	    
	    extent.attachReporter(spark);
	    extent.setSystemInfo("HostName", "Local Host");
	    extent.setSystemInfo("OS", "Windows");
	    extent.setSystemInfo("Tester Name", "Shiva");
	    extent.setSystemInfo("Browser", "Chrome");
	    
	}	
	public void onTestSuccess(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));     //MarkupHelper.createTable(tr.getName(),ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		
		String screenshotPath=System.getProperty("user.dir")+tr.getName()+".png";
		
		File f=new File(screenshotPath);
		
		if(f.exists()) {
			try {
			test.fail("Screenshot is below : " + test.addScreenCaptureFromPath(screenshotPath));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}	
	}
	public void onTestSkippped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
	
}
