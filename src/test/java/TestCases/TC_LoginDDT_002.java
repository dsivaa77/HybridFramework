package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clicklogin();
		Thread.sleep(4000);
		lp.clickmenu();
		Thread.sleep(3000);
		lp.clicklogout();
		Thread.sleep(3000);
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
	

}
