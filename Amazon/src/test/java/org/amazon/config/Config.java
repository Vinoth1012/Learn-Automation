package org.amazon.config;

import java.io.FileReader;
import java.util.Properties;

public class Config {
	public static String readPropertyFile(String strPropertyKey) throws Exception
	{  
		String strPropertyValue = "";
		try {
			FileReader reader=new FileReader("D:\\Automation\\Workspace\\Amazon\\src\\test\\resources\\config\\config.properties");  
		    Properties p=new Properties();  
		    p.load(reader);
		    strPropertyValue = p.getProperty(strPropertyKey);
		    reader.close();
		   
		}
		catch(Exception e)
			{
			throw new Exception();
		}
		 return strPropertyValue;
	}
}