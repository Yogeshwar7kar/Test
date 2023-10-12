package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CarDekho;

public class Test1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Course\\chromedriver-win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		
			driver.get("https://www.cardekho.com");                    
		                                                       
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			CarDekho cardekho=new CarDekho(driver);
			cardekho.newcar();
			cardekho.newexplorecar();

	}

}
