package ObjectRepository;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class HomePage {
	
	WebDriver driver;
	
	@FindBy(name="radioButton")
	private static WebElement radiobutton;
	
	@FindBy(id="autocomplete")
	private static WebElement dynamicDrop;
	
	@FindBy(id="dropdown-class-example")
	private static WebElement staticDrop;
	
	@FindBy(id="checkBoxOption1")
	private static WebElement checkBox;
	
	@FindBy(id="openwindow")
	private static WebElement openWindow;
	
	@FindBy(id="opentab")
	private static WebElement openTab;
	
	@FindBy(xpath ="//*[@placeholder='Enter Your Name']")
	private static WebElement alertTxBxName;
	
	@FindBy(id="alertbtn")
	private static WebElement alert;
	
	@FindBy(id="confirmbtn")
	private static WebElement alertConfirm;
	
	@FindBy(id="hide-textbox")
	private static WebElement hideTxBx;
	
	@FindBy(id="show-textbox")
	private static WebElement showTxBx;
	
	@FindBy(id="displayed-text")
	private static WebElement displayTxBx;
	
	@FindBy(xpath="//*[@id='mousehover']")
	private static WebElement mouseOver;
	
	@FindBy(xpath="//a[@href='#top']")
	private static WebElement mouseOvertop;
	
	@FindBy(xpath="//*[@id=\"post-501\"]/div/div[4]/div/fieldset/div/div/a[2]")
	private static WebElement mouseOverreload;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/input")
	private static WebElement searchTxBx;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/aside/div[1]/form/button")
	private static WebElement submitSearch;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getTitle()
	{
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		if(PageTitle.equals("Automation Practice – CodenBox AutomationLab"))
		{
			System.out.println("getTitle test case is passed");
		}
		else
		{
			System.out.println("getTitle test case is failed");
		}
	}
	
	public void getCurrentURL()
	{
		String CurrURL=driver.getCurrentUrl();
		System.out.println(CurrURL);
		if(CurrURL.equals("https://codenboxautomationlab.com/practice/"))
		{
			System.out.println("URL test case is passed");
		}
		else
		{
			System.out.println("URL test case is failed");
		}
	}
	
	public void getLinksSize()
	{
		int linkSize=driver.findElements(By.tagName("a")).size();
		System.out.println(linkSize);
	}
	
	public void clickRadioBtn()
	{
		radiobutton.click();
		int r=driver.findElements(By.name("radioButton")).size();
		System.out.println("Nuber of radio button "+ r);
		for(int i=0;i<=r;i++)
		{
			driver.findElement(By.xpath("(//*[@name=\'radioButton\'])[2]")).click();
		}
		boolean radio3=driver.findElement(By.xpath("(//*[@name=\'radioButton\'])[3]")).isSelected();
		System.out.println(radio3);
		if(radio3)
		{
			System.out.println("Radio 3 is selected");
		}
		else
		{
			System.out.println("Radio 3 is not selected");
		}
	}
	
	public void getRadBtnNames()
	{
		List<WebElement>allRadBtn=driver.findElements(By.name("radioButton"));
		System.out.println(allRadBtn.size());
		for(WebElement ele:allRadBtn)
		{
			System.out.println(ele.getAttribute("value"));
		}
	}
	
	public void dynamDrpDwn()
	{
		dynamicDrop.sendKeys("India");
		dynamicDrop.sendKeys(Keys.TAB);
		dynamicDrop.getAttribute("value");
	}
	
	public void stcDropDwn()
	{
		String tagname=staticDrop.getTagName();
		System.out.println("Tag name of dropdown element is "+tagname);
		String attriname=staticDrop.getAttribute("id");
		System.out.println("Attribute od drop down element is "+attriname);
		Select s=new Select(staticDrop);
		s.selectByIndex(0);
		s.selectByValue("option2");
		s.selectByVisibleText("API");
	}
	
	
	

}
