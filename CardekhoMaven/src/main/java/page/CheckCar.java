package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckCar {
	//variable private
		@FindBy(xpath="//li[text()='By Model']") WebElement ByModel;
		
		@FindBy(xpath="//input[@id='bmvBrand']") WebElement Brand;
		
		@FindBy(xpath="//input[@id='bmvModel']") WebElement Model;
		@FindBy(xpath="(//button[text()='Search'])[1]") WebElement Search;
		
		
		//constructor Public
		 public CheckCar(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		//Method public
		 public void clickonByModel() {
			 ByModel.click();
		 }
		 public void sendBrand() {
			 Brand.sendKeys("Maruti");
		 }
		
		 public void sendModel() {
		
			 Model.sendKeys("Brezza");
		 }
		 
		 public void ClickSearch() {
				
			 Search.click();
		 }

}
