package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import page.CarDekhoUserLogin;
import page.InstagramLoginPage;

public class Testng extends Browser {
	
	private WebDriver driver;
	private CarDekhoUserLogin cardekhouserlogin ;
    private ExtentHtmlReporter reporter;
	
	
	static ExtentTest test;
	static ExtentHtmlReporter report;
	
	
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchbrowser(String browserName)throws Exception{
		reporter=new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
		
		System.out.println("BeforeTest");
		
		if(browserName.equals("Edge"))
		{
			driver=launchEdge();
		}
		
	}
	@BeforeClass
	public void pom()
	{
		cardekhouserlogin=new CarDekhoUserLogin(driver);
	}
	@BeforeMethod
	public void url(){
		driver.get("https://www.cardekho.com/login");
	}
	@Test
	public void cardekho(){
	//	CarDekhoUserLogin cardekhouserlogin=new CarDekhoUserLogin(driver);
		cardekhouserlogin.sendlogin("abc@gmail.com");
		cardekhouserlogin.sendpassword("12345");
		cardekhouserlogin.sendfname("ram");
		cardekhouserlogin.sendlname("patil");
		cardekhouserlogin.sendpin("123456");
		cardekhouserlogin.sendmobileno("1234567898");
		cardekhouserlogin.selectstate();
		cardekhouserlogin.selectcity();
	}
	@AfterMethod
	public void afterMethod(){
		driver.close();
	}


}
