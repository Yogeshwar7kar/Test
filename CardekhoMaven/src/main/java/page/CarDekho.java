package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarDekho {
@FindBy(xpath="(//a[@title='New Cars'])[1]") WebElement NewCar;
	
	@FindBy(xpath="//span[text()='Explore New Cars']") WebElement NewCarExplore;
	
	
	private WebDriver driver;   //mouse1
	private Actions action;

	//constructor Public
	 public CarDekho(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	
		 this.driver=driver;     //mouse2
		 action=new Actions(driver);
	 }
	//Method public
	 public void newcar() {
		// Actions act=new Actions(driver);
		action.moveToElement(NewCar).click().build().perform();
		 
	 }
	 public void newexplorecar() {
		// Actions act=new Actions(driver);
		action.moveToElement(NewCarExplore).click().build().perform();
		 
	 }
	
	

}
