package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class login {
	
	WebDriver driver;
			
		
		public login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(id="btn-make-appointment")
		WebElement btnmkappontment;
		
		@FindBy(id="txt-username")
		WebElement txtusername;
		
		@FindBy(id="txt-password")
		WebElement txtpassword;
		
		@FindBy(id="btn-login")
		WebElement btnlogin;
		
		public void btnmkapp()
		{
			btnmkappontment.click();
		}
		
		public void setUsername(String strArg1)
		{
			
			txtusername.sendKeys(strArg1);
		}

		public void setPassword(String strArg2)
		{
			txtpassword.sendKeys(strArg2);	
		}
		
		public void btnlogin()
		{
			btnlogin.click();
		}
		

}
