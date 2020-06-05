package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class LoginPage {

	    //page objects
		public WebDriver driver;
		//public WebDriverWait wait = new WebDriverWait(driver, 5);
		 

		public Select dropdown;
		
		//create constructor to perform initialization of driver object in this page objects class
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		
		By createAccountEmail = By.id("email_create");
		By createAccountButton = By.cssSelector("#SubmitCreate");
		
		//Fill Form
		By title = By.cssSelector("#id_gender1");
		By firstName = By.cssSelector("#customer_firstname");
		By lastName = By.cssSelector("#customer_lastname");
		By password = By.cssSelector("#passwd");
		
		By name = By.cssSelector("#firstname");
		By lname = By.cssSelector("#lastname");
		By company = By.cssSelector("#company");
		By addr1 = By.cssSelector("#address1");
		
		By city = By.cssSelector("#city");
		By postcode = By.cssSelector("#postcode");
		
		By mobile = By.cssSelector("#phone_mobile");
	    By alias = By.cssSelector("#alias");
	    
	    By register = By.cssSelector("#submitAccount");
	    
	   By Selectday = By.name("days");	 
	   By Selectmonth = By.name("months");
	   By Selectyear = By.name("years");
	   
	   By Selectstate = By.name("id_state");
	   
	   By Selectcountry = By.name("id_country");
	   
	   By loginmail = By.cssSelector("#email");
	   
	   By loginpass = By.cssSelector("#passwd");
	   
	   By submitLogin = By.cssSelector("#SubmitLogin");
	   
		
		//method to derive page objects using find element
		
		public WebElement getemail() {
		
			
			return driver.findElement(createAccountEmail);
		}
		
		
		public WebElement clickonButton() {
			
			return driver.findElement(createAccountButton);
		}

	
        public WebElement selectTitle() {
		
			
			return driver.findElement(title);
		}
		
        public WebElement enterFirstName() {
		
			
			return driver.findElement(firstName);
		}
        
        public WebElement enterLastName() {
		
			
			return driver.findElement(lastName);
		}
        
        
       public WebElement setPassword() {
		
			
			return driver.findElement(password);
		}

       public WebElement entername() {
   		
			
			return driver.findElement(name);
		}
       
       public WebElement enterlname() {
      		
			
			return driver.findElement(lname);
		}
       
       public WebElement entercompany() {
     		
			
			return driver.findElement(company);
		}
     
       public WebElement enteraddr() {
    		
			
			return driver.findElement(addr1);
		}
    
       public WebElement entercity() {
   		
			
			return driver.findElement(city);
		}
       
       public WebElement enterpostcode() {
      		
			
			return driver.findElement(postcode);
		}
       
       public WebElement entermobile() {
     		
			
			return driver.findElement(mobile);
		}
       
       public WebElement enteralias() {
    		
			
			return driver.findElement(alias);
		}
       
       public WebElement register() {
   		
			
			return driver.findElement(register);
		}
       
       public void select(int index) {
    	   dropdown = new Select(driver.findElement(Selectday));
    	   dropdown.selectByIndex(index);
    	   
    	   
		}
       
       public void select2(int index) {
    	   dropdown = new Select(driver.findElement(Selectmonth));
    	   dropdown.selectByIndex(index);
    	   
    	   
		}
       
       public void select3(int index) {
    	   dropdown = new Select(driver.findElement(Selectyear));
    	   dropdown.selectByIndex(index);
    	   
    	   
		}
         
       public void select4(int index) {
    	   dropdown = new Select(driver.findElement(Selectstate));
    	   dropdown.selectByIndex(index);
    	   
    	   
		}
       
       public void select5(int index) {
    	   dropdown = new Select(driver.findElement(Selectcountry));
    	   dropdown.selectByIndex(index);
    	   
    	   
		}
       
       
       public WebElement loginMail() {
    	
    	   return driver.findElement(loginmail);
}
       
       

       public WebElement loginpass() {
       	
    	   return driver.findElement(loginpass);
}
       
       
       
       public WebElement submitLogin() {
          	
    	   return driver.findElement(submitLogin);
}
}