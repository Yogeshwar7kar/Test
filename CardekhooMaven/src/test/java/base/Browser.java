package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

//	public static WebDriver launchChrome() {
//		
//		 
//		   System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Browser Files\\chromedriver.exe");
//		   System.setProperty("webdriver.chrome.driver"," src\\test\\resources\\BrowserFiles\\chromedriver.exe");
//		   
//		   WebDriver driver=new ChromeDriver();
//			return driver;
//			
//		}

	public static WebDriver launchEdge() {
		
		System.setProperty("webdriver.Edge.driver", "src\\test\\resources\\BrowserFile\\msedgedriver.exe");
		//System.setProperty("webdriver.Edge.driver", "F:\\Software Testing Course\\edgedriver_win64\\msedgedriver.exe");

	    WebDriver driver=new EdgeDriver();
	    return driver;
			
		}
	}

	


