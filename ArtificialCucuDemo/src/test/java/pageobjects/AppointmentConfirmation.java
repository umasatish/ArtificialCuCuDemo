package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AppointmentConfirmation
{
WebDriver driver;
	
	public AppointmentConfirmation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement GoToHomepage;
	
	public void GoToMainpage()
	{
		GoToHomepage.click();
	}
	
	
	

}
