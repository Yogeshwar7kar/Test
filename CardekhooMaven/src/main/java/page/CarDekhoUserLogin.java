package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CarDekhoUserLogin {
	//variable private
	@FindBy(xpath="//input[@id='emailId']") WebElement EmailId;
	@FindBy(xpath="//input[@id='password']") WebElement Password;
	@FindBy(xpath="//input[@title='Enter Your First Name.']") WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lastName']") WebElement LastName;
	
	@FindBy(xpath="//select[@id='state']") WebElement State;
	
   @FindBy(xpath="//select[@id='city']") WebElement City;
	
	@FindBy(xpath="//input[@id='pinCode']") WebElement PinCode;
	
	@FindBy(xpath="//input[@id='mobileNo']") WebElement MobNo;


	private WebDriver driver;
	
	//constructor Public
	 public CarDekhoUserLogin(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;
	 }
	//Method public
	 
	 public void sendlogin(String login)
	 {
		 EmailId.sendKeys(login);
	 }
	 public void sendpassword(String password)
	 {
		 Password.sendKeys(password);
	 }
	 public void sendfname(String fname)
	 {
		FirstName .sendKeys(fname);
	 }
	 public void sendlname(String lname)
	 {
		LastName .sendKeys(lname);
	 }
	 public void selectstate () {
		 Select s=new Select(State);
		s.selectByVisibleText("Maharashtra");
	 }
	 public void selectcity () {
		 Select s=new Select(City);
		s.selectByVisibleText("Ahmednagar");
	 }
	

	 
	 public void sendpin(String pin)
	 {
		PinCode .sendKeys(pin);
	 }
	 
	 public void sendmobileno(String mobileno)
	 {
		MobNo.sendKeys(mobileno);
	 }
	 
	 
	
	 
	

}
