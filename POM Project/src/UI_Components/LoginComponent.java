package UI_Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.serviceCall;

public class LoginComponent {
	
	
	//PageFactory
	
	@FindBy(name="userName")
	static WebElement usernameEditbox;
	
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	
	//input[@name='login']
	@FindBy(xpath="//input[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//font[text()][1]")
	WebElement loginVerification;
	
	
	public void login()
	{
		usernameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
	}
	
	public boolean verfiyLoginFunc()
	{
		login();
		String actualText=loginVerification.getText();
		//String expectedText="";
		
		//Latter added
		String expectedText=serviceCall.getloginVerficationText(); /////////import bds_Queries.serviceCall;
		if(actualText.equals(expectedText))
	
		return true;
		return false;
	
		
		
	}

}
