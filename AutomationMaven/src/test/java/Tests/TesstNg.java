package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Automate;

public class TesstNg {
	private WebDriver driver;
	@BeforeClass
		public void browser()
		{
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing Course\\chromedriver-win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
	@BeforeMethod
	public void url()
	{
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test(priority=2)
	public  void test1()
	{
		Automate automate=new Automate(driver);
	  
	    automate.clickmale();
	    automate.clickday();
	    automate.senddate("04/09/2023");
	    automate.selectcountry();
	    automate.selectcolor();

	}
	@Test(priority=1)
	public  void test2()
	{
		Automate automate=new Automate(driver);
	    automate.senduserName("Ram");
	    
	    automate.sendemail("abc@gmail.com");
	    automate.sendphone("9898989898");
	    automate.sendaddress("Pune");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("good");
	}
	@AfterMethod
	public void pm()
	{
		system.out.println("night abcdef");
		}

		
	
	
	
	

}
