package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class loginAccount extends base {
	
	
		
		//Include all test cases in this class
		//Find data provider mentioned
		
	    	
		@BeforeTest
		public void initialize() throws IOException {
			
			driver = initializeDriver();	
			
		}
		
		@Test(dataProvider="getData4")
		
		public void createAcc(String username, String password) throws IOException {
			
			driver.get(prop.getProperty("url"));
			LandingPage l2 = new LandingPage(driver);  //passing driver argument to give life to driver object in LandingPage class
			l2.getLogin().click();
			
			LoginPage lp2 = new LoginPage(driver);  //passing driver argument to give life to driver object in LandingPage class
		    lp2.loginMail().sendKeys(username);
		    lp2.loginpass().sendKeys(password);
		    lp2.submitLogin().click();

}
		
		@DataProvider
		public Object[][] getData4() {
			
			
			Object[][] data4= new Object[1][2];
			
			//0th row
			data4[0][0] = "akshay10115g@gmail.com";
            data4[0][1] = "dummy1";
			return data4;
		}
			@AfterTest
			public void teardown() {
				
			driver.close();
				
			}
}
	