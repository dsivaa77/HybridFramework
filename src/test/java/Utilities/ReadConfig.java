package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		
		File src=new File("C:\\Users\\DELL\\eclipse-workspace\\HybridFramework\\Configurations\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("The Exception is "+ e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	
	
	
	
}
