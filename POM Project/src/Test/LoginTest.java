package Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import UI_Components.LoginComponent;

public class LoginTest extends AbstractTest
	{
		@Test(description="Verfiy Login")
		
		public void verifyLogin()
		{
			assertTrue(loginComponent.verfiyLoginFunc(), "message"); //loginComponent :object name
		
		}
	}

