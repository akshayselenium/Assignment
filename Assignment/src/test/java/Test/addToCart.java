package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class addToCart extends base {
	
	
	
	//Include all test cases in this class
	//Find data provider mentioned
	
    	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();	
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider="getData4")
	
	public void createAcc(String username, String password) throws IOException {
		
		driver.get(prop.getProperty("url"));
		LandingPage l2 = new LandingPage(driver);  //passing driver argument to give life to driver object in LandingPage class
		l2.getLogin().click();
		
		LoginPage lp2 = new LoginPage(driver);  //passing driver argument to give life to driver object in LandingPage class
	    lp2.loginMail().sendKeys(username);
	    lp2.loginpass().sendKeys(password);
	    lp2.submitLogin().click();
	    
	    l2.Selectproduct().click();
	    
	    l2.quickview().click();
	    
	    l2.addquantity().clear();
	    l2.addquantity().sendKeys("2");
	    
	    l2.addtoCart().click();
	   
	    l2.checkout().click();
	    
        l2.checkout().click();
        
        l2.procesAdd().click();
        
        //l2.procesCar().click();
        
        //l2.close().click();
        
        l2.check().click();
        
        l2.procesCar().click();

        
        // retrieve unit price of product
        String price = l2.price().getText().toString();   
        
        System.out.println(price);
        
        String unit_price = price.replace("$", "");
        
        System.out.println("Unit Price:= " + unit_price);
        
        //converting string to float
        float i = Float.parseFloat(unit_price);
        
        System.out.println(i);
        
        //Total amount calculated , expected
        float Total_amount = ((2*i) +2);
        		
        System.out.println(Total_amount);
        
        //retrieve acutal amount
        
        String i2 = l2.totalprice().getText().toString();
        
        System.out.println(i2);
        
        String total_price = i2.replace("$", "");
        
        System.out.println("total Price:= " + total_price);
        
        //converting actual amount to float
        float Total_PRICE = Float.parseFloat(total_price);
        
        System.out.println(i2);  
        
        // verify expected amount equals to actual amount
        
        Assert.assertEquals(Total_amount, Total_PRICE);
      
        l2.makepayment().click();
    
        l2.makeconfirmOrder().click();
    
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
