package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	public static void getScreenshot(WebDriver driver,String picname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrfile= ts.getScreenshotAs(OutputType.FILE);
		
		try 
		{
		 Files.copy(scrfile, new File("C:\\Users\\Aditya\\git\\LoginTest\\CodenBox\\"+picname+".png"));
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("File path generated successfully");
		}
	}

}
