package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Pageobjects;
import Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) {
		Pageobjects lp=new Pageobjects(driver);
		lp.setUserName(user);
		logger.info("The Login Username is "+user);
		lp.setPassword(pwd);
		logger.info("The login password is "+pwd);
		
		lp.clicklogin();
		logger.info("Click the login button");
		
		lp.clickmenu();
		logger.info("Click the menu bar");
		
		lp.clicklogout();
		logger.info("Click the logout button");
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException{
		
	//	String path="C://Users//DELL//Documents//LoginData.xlsx";
		String path="C://Users//DELL//eclipse-workspace//HybridFramework//src//test//java//TestData//LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet3");
		int colcount=XLUtils.getCellCount(path, "Sheet3", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet3", i, j);
			}
		}
			return logindata;
	}
	
	@DataProvider(name="logindata")
	public Object[][] getData(){
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"error_user","secret_sauce"}
		};
	}
	

}
