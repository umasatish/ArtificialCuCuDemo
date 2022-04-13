package stepsDefinition;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AppointmentConfirmation;
import pageobjects.Makeappointment;
import pageobjects.login;

public class StepsDefinition extends Baseclass
{	
	
	
	
	    @Given("^User launches chrome browser$")
	    public void user_launches_chrome_browser() throws Throwable {	    	
		 //System.setProperty("Webdriver.chrome.driver","D:\\workspace\\ArtificialCucuDemo\\drivers\\chromedriver-latest.exe");	
	    
	    	
	    	
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		// logger.info("********Opens Browser********");
		 
	    }

	    @When("^User enters Url\"([^\"]*)\"$")
	    public void user_enters_urlsomething(String strArg1) throws Throwable {
	    	driver.get("https://katalon-demo-cura.herokuapp.com/");	    	
	    	//logger.info("**********Enters URL***********");
	    	Thread.sleep(1000);
	    }

	    @When("^clicks on Make Appointment$")
	    public void clicks_on_Make_Appointment() throws Throwable {
	    
	       login lp=new login(driver);
	    	lp.btnmkapp();
	       
	    }
	    
	    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	login lp=new login(driver);
	    	lp.setUsername(strArg1);
	    	Thread.sleep(2000);
	    	lp.setPassword(strArg2);
	    	Thread.sleep(2000);
	    	    	  	
	    }
	    
	    @When("^clicks on login$")
	    public void clicks_on_login() throws Throwable {
	    	login lp=new login(driver);
	    	lp.btnlogin();
	      //logger.info("**********Sucessfully Logged in*******");
	    }
	          	    
	    @Then("^User should validate the successful landing of Homepage$")
	    public void user_should_validate_the_successful_landing_of_homepage() throws Throwable {
	    	if(driver.getPageSource().contains("Make Appointment"))
	    	{
               Assert.assertTrue(true);	    	
	    	}
	    	else
	    	{
	               Assert.assertTrue(false);	    	

	    	}
         //logger.info("***********Sucessful Landing of HomePage*************");
	    }
	    
	   
	    @When("^User selects\"([^\"]*)\"$")
	    public void user_selects(String arg1) throws Throwable {
	    	
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setfacility();
	    	
	       
	    }

	    @When("^clicks \"([^\"]*)\"$")
	    public void clicks(String arg1) throws Throwable {
	    	
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setReadmission();    	
	        
	    }

	    @When("^clicks on\"([^\"]*)\"$")
	    public void clicks_on(String arg1) throws Throwable {
	    	
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setMediaid();    	
	       
	    }

	    @When("^User enters date\"([^\"]*)\"$")
	    public void user_enters_date(String arg1) throws Throwable {
	    	
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setVisitdate();

	       
	    }

	    @When("^User enters comments\"([^\"]*)\"$")
	    public void user_enters_comments(String arg1) throws Throwable {
	    	
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setComment();	        
	    }

	    @When("^clicks on BookAppointment$")
	    public void clicks_on_BookAppointment() throws Throwable {
	    	Makeappointment mp=new Makeappointment(driver);
	    	mp.setBookappoint();   	
	    	
	    }

	    @Then("^User should validate the sucesssful ApointmentConformation page$")
	    public void user_should_validate_the_sucesssful_ApointmentConformation_page() throws Throwable {
	    	
	    	if(driver.getPageSource().contains("Appointment Confirmation"))
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);

	    	}
	        //logger.info("******Sucessfully booked an appointment************");
	    }
	    
	    @Then("^User clicks on Go to Homepage$")
	    public void user_clicks_on_Go_to_Homepage() throws Throwable {
	       
	    	AppointmentConfirmation ac=new AppointmentConfirmation(driver);
	    	ac.GoToMainpage();
	    }


}

	

	

