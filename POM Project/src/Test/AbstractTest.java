package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Components.LoginComponent;

public class AbstractTest {
	
	LoginComponent loginComponent;
	
	WebDriver driver;
	
	
	AbstractTest()
	{
		loginComponent=new LoginComponent();//Constructor is called(to intialize the object)
		
	}
	
	@BeforeTest
	public void setupEnvironment()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/deepakkumarbehera/Tools/chromedriver");
	     driver = new ChromeDriver();
	     driver.get("http://newtours.demoaut.com/");
	     
	     //Added  PF
	    PageFactory.initElements(driver, loginComponent);
	}
	
	@AfterTest
	public void closeEnvironment()
	{
		driver.close();
	}
}
