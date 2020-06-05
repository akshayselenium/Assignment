package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;



    //using inheritance to inherit properties of base class
    public class createAccount extends base{
	
	//Include all test cases in this class
	//Find data provider mentioned
	
    	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();	
		
	}
	
	@Test(dataProvider="getData")
	
	public void createAcc(String string) throws IOException {
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);  //passing driver argument to give life to driver object in LandingPage class
        l.getLogin().click();
		
        LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(string);
		lp.clickonButton().click();
	
	}
		
	
	@DataProvider
	public Object[] getData() {
		
		// Row stands for how many different values data types test should run
		// Column Stands for how many values per each test
		
		Object[] data = new Object[1];
		
		//0th row
		data[0] = "akshay10115g@gmail.com";

		return data;
		
	}
	
   @Test(dataProvider="getData2")
	
	public void fillForm(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) throws IOException {
		
	   
	   
		LoginPage lp2 = new LoginPage(driver);
	
		lp2.selectTitle().click();
		
		
		lp2.enterFirstName().sendKeys(string1);
		lp2.enterLastName().sendKeys(string2);
		lp2.setPassword().sendKeys(string3);

		lp2.select(4); 	
		lp2.select2(5);
		lp2.select3(7);
		
		lp2.entername().sendKeys(string4);
		lp2.enterlname().sendKeys(string5);
		lp2.entercompany().sendKeys(string6);
		lp2.enteraddr().sendKeys(string7);
	    lp2.entercity().sendKeys(string8);
		lp2.select4(7);
		
		lp2.enterpostcode().sendKeys(string9);
		lp2.select5(1);
		lp2.entermobile().sendKeys(string10);
		lp2.enteralias().sendKeys(string11);
		
		lp2.register().click();
	
   }
		
	
	@DataProvider
	public Object[] []getData2() {
		
		// Row stands for how many different values data types test should run
		// Column Stands for how many values per each test
		
		Object[] []data2= new Object[1][11];
		
		//0th row
		data2[0][0] = "New";
		data2[0][1] = "User";
		data2[0][2] = "dummy1";
		data2[0][3] = "New";
		data2[0][4] = "User";
		data2[0][5] = "dummy4";
		data2[0][6] = "dummy5";
		data2[0][7] = "dummy6";
		data2[0][8] = "40009";
		data2[0][9] = "9812345612";
		data2[0][10] = "dummy9";
		//data2[0][11] = "dummy10";
		//data2[0][12] = "dummy11";
		//data2[0][13] = "dummy12";
		//data2[0][14] = "fhfejbf";
		
		return data2;
		
	}

	
	
	@AfterTest
	public void teardown() {
		
	driver.close();
		
	}  
}
