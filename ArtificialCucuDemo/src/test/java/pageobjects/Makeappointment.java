package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Makeappointment {
WebDriver driver;
	
	public Makeappointment(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//select[@id='combo_facility']")
	WebElement Facility;
	
	@FindBy(id="chk_hospotal_readmission")
	WebElement AFHR;
	
	@FindBy(id="radio_program_medicaid")
	WebElement Healthcareprogram;
	
	@FindBy(id="txt_visit_date")
	WebElement Visitdate;

	@FindBy(id="txt_comment")
	WebElement Comment;
	
	@FindBy(id="btn-book-appointment")
	WebElement Bookappointment;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement GoToHomepage;
	
	
	
	public void setfacility()
	{
      Select select=new Select(Facility);
      Facility.click();
      select.selectByIndex(1);
	}
	
	public void setReadmission()
	{
		AFHR.click();
	}
	
   public void setMediaid()
   {
	   Healthcareprogram.click();
   }
   
   public void setVisitdate()
   {
	   Visitdate.sendKeys("29-04-2022");	   
   }
   
   public void setComment()
   {
	   Comment.sendKeys("Thank you satish");
   }
   
   public void setBookappoint()
   {
	   Bookappointment.click();
   }
   public void setGoToHomepage()
   {
	   GoToHomepage.click();
   }

}
