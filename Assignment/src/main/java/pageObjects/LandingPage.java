package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage {

	//page objects
	public WebDriver driver;
	public WebDriverWait wait;
	
	//create constructor to perform initialization of driver object in this page objects class
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//storing element locator
	
	
	By signIn = By.cssSelector(".login"); //Login Element
	
	By Women = By.cssSelector(".sf-with-ul");  //Featured Courses
	By quickView = By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img");
	By quantity = By.id("quantity_wanted");
	By addToCart = By.id("add_to_cart");
	By checkout = By.linkText("Proceed to checkout");
	By processAdd = By.name("processAddress");
	By processCar = By.name("processCarrier");
    By Close = By.xpath("//*[@id='order']/div[2]/div/div/a");
    By checkbox = By.id("cgv");
	By price = By.cssSelector("table#cart_summary span.price>span");
    By totalprice = By.cssSelector("table#cart_summary  span#total_price");
    By payment = By.cssSelector(".bankwire");
	By confirmOrder = By.xpath("//button[@type='submit']");
	By my_Order = By.xpath("//a[@title='My orders']");
	
	//method to derive page objects using findelement
	public WebElement getLogin() {
		
		return driver.findElement(signIn);
	}

     public WebElement Selectproduct() {
		
		return driver.findElement(Women);
	}
     
     public WebElement quickview() {
    	 wait = new WebDriverWait(driver,10);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(quickView));
    	 return driver.findElement(quickView);
     }
     
     public WebElement addquantity() {
    	 return driver.findElement(quantity);
     }
     
     public WebElement addtoCart() {
    	 return driver.findElement(addToCart);
     }
     
     public WebElement checkout() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(checkout));
    	 return driver.findElement(checkout);
     }
     
     public WebElement procesAdd() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(processAdd));
    	 return driver.findElement(processAdd);
     }

     public WebElement procesCar() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(processCar));
    	 return driver.findElement(processCar);
     }
     
     public WebElement close() {
    	 return driver.findElement(Close);
     }
     
     public WebElement check() {
    	 return driver.findElement(checkbox);
     }
     
     public WebElement price() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(price));
    	 return driver.findElement(price);
    	
    	 
     }
 
     public WebElement totalprice() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(totalprice));
    	 return driver.findElement(totalprice);
    	
    	 
     }
     
     public WebElement makepayment() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(payment));
    	 return driver.findElement(payment);
    	
    	 
     }
     
     public WebElement makeconfirmOrder() {
    	 wait = new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrder));
    	 return driver.findElement(confirmOrder);
    	
    	 
     }
     
     public WebElement Myorders() {
    	 return driver.findElement(my_Order);
     }
     
     }
	
