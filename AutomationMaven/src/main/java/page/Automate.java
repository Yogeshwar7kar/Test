package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automate {
	        //variable private
			@FindBy(xpath="//input[@id='name']") WebElement Name;
			
			@FindBy(xpath="//input[@id='email']") WebElement Email;
			@FindBy(xpath="//input[@id='phone']") WebElement Phone;
			@FindBy(xpath="//textarea[@id='textarea']") WebElement Address;
			@FindBy(xpath="//input[@id='male']") WebElement Male;
			@FindBy(xpath="//input[@id='monday']") WebElement Day;
			@FindBy(xpath="//Select[@id='country']") WebElement Country;
			@FindBy(xpath="//Select[@id='colors']") WebElement Color;
			@FindBy(xpath="//input[@id='datepicker']") WebElement Date;
			
			
			private  WebDriver driver;
			
			//constructor Public
			 public Automate(WebDriver driver)
			 {
				 PageFactory.initElements(driver, this);
				 this.driver=driver;
			 }
			//Method public
			 public void senduserName(String user) {
				 Name.sendKeys(user);
			 }
			 public void sendemail(String email) {
				 Email.sendKeys(email);
			 }
			 public void sendphone(String phone) {
				 Phone.sendKeys(phone);
			 }
			
			 public void sendaddress(String address) {
				 Address.sendKeys(address);
			 }
			 public void clickmale() {
				 Male.click();
			 }
			
			 public void clickday() {
				 Day.click();
			 }
			
			
			
			 public void selectcountry () {
				 Select s=new Select(Country);
				s.selectByVisibleText("France");
			 }
			
			 public void selectcolor () {
			 Select s=new Select(Color);
			 s.selectByVisibleText("Red");
			 }
			 
			 public void senddate(String date) {
				 Date.sendKeys(date);
			 }
		
				
			}
		
				
			 
			  


