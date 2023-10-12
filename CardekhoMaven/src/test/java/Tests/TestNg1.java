package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CarDekho;
import page.CheckCar;

public class TestNg1 {
	private WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Course\\chromedriver-win32\\chromedriver.exe");
		 driver= new ChromeDriver();
	}
	@BeforeMethod
	public void beforeMethod(){
		driver.get("https://www.cardekho.com");     
	}
	@Test
	public void test(){
		
		CarDekho cardekho=new CarDekho(driver);
		cardekho.newcar();
		cardekho.newexplorecar();
		
		CheckCar checkcar=new CheckCar(driver);
		checkcar.clickonByModel();
		checkcar.sendBrand();
		checkcar.sendModel();
		checkcar.ClickSearch();

	}

}
