package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFile {
	
	public static String getProperties(String reqProp) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Aditya\\eclipse-workspace\\CodenBox\\Imp.properties");
		Properties prop=new Properties();
		prop.load(file);
		String reqValue=prop.getProperty(reqProp);
	//	System.out.println(reqValue);
		return reqValue;
		
	}

	
}
