package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
Properties pro;
	
	public ReadConfig()
	{
		File src = new File ("./Configuration/config.properties");
		try
		{			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);				
		}		
		catch (Exception e)
		{
			LoggerLoad.error("ReadConfig" + e.getMessage());
			System.out.println ("Exception is " + e.getMessage());
		}
	}	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;		
	}
	
	public String getBrowser()
	{
		String browser = pro.getProperty("browser");
		return browser;
	}
	
	public String getCode()
	{
		String code = pro.getProperty("code");
		return code;
	}	
	
	public String getRegistrationURL()
	{
		String code = pro.getProperty("registrationURL");
		return code;
	}	
}
