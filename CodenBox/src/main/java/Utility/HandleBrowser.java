package Utility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrowser {
	
	public WebDriver LaunchURL() throws IOException
	{
		WebDriver driver = null;
		String reqBrowser=propertiesFile.getProperties("Browser");
		if (reqBrowser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation and Testing\\Testing Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		} 
		else 
		{
			System.out.println("Please enter correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(propertiesFile.getProperties("URL"));
		return driver;
	}
	

}
