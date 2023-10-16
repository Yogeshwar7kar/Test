package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import page.Automate;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing Course\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Automate automate=new Automate(driver);
	    automate.senduserName("Ram");
	    
	    automate.sendemail("abc@gmail.com");
	    automate.sendphone("9898989898");
	    automate.sendaddress("Pune");
	    automate.clickmale();
	    automate.clickday();
	    automate.senddate("04/09/2023");
	    automate.selectcountry();
	    automate.selectcolor();


	}

}
