package Com.GenericRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.PomRepo.LoginAba;
import Com.PomRepo.Logout;

public class BaseClass 
{   
	public static WebDriver driver;
	HandlingData hl = new HandlingData();
	@BeforeClass
	public void BC() throws Exception
	{
		System.out.println("Launch Browser");
		String browser = hl.readdata("browser");
		if(browser.contains("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Papa.impwait, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void BM() throws Exception
	{
		LoginAba lb = PageFactory.initElements(driver, LoginAba.class);
		System.out.println("Login Application");
		String url = hl.readdata("url");
		String us = hl.readdata("username");
		String pwd = hl.readdata("password");
		driver.get(url);
		lb.getUsername().sendKeys(us);
		lb.getPwd().sendKeys(pwd);
		lb.getLogin().click();
	}
	@AfterMethod
	public void AM()
	{
		Logout lo = PageFactory.initElements(driver, Logout.class);
		System.out.println("logout Application");
		Actions act = new Actions(driver);
		act.moveToElement(lo.getLogout()).perform();
		lo.getSignout().click();
	}
	@AfterClass
	public void AC()
	{
		System.out.println("Close Browser");
		driver.close();
	}
}
