package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	

	// making driver object as public - common to all methods in intializatDriver method
public WebDriver driver;

   // making prop file as public

public Properties prop;

	public WebDriver initializeDriver() throws IOException 
	{
	    prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Akshay\\Desktop\\Books PDF\\E2EProject2\\src\\main\\java\\resources\\data.properties");
		
		//load properties file
		prop.load(fis);
		
		//retrieve & save browser name set in prop file  
	    String browserName = prop.getProperty("browser");
	    
	    if(browserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");
			// Creating a object to instantiate the browser driver
		    driver = new ChromeDriver();
	    }
	    
	    else if(browserName.equals("firefox"))
	    {
	    	/* System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Desktop\\geckodriver.exe");
	    	DesiredCapabilities capabilities = new DesiredCapabilities();

	    	 capabilities = DesiredCapabilities.firefox();
	    	 capabilities.setBrowserName("firefox");
	    	 capabilities.setVersion("47.0.1");
	    	 capabilities.setPlatform(Platform.WINDOWS);
	    	 capabilities.setCapability("marionette", false);

	    	  driver = new FirefoxDriver(capabilities);
		    //driver = new FirefoxDriver();*/
	    }
	    
	    //Applying implicit wait
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return driver;
	    
	
	}
	


}
