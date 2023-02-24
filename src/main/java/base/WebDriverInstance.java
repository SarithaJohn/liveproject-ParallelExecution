package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriverInstance {

	public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	//Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
	
	public static WebDriver getDriver() {
		
		if(driver.get()==null) {
			try {
				driver.set(createDriver());
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException
	{
		WebDriver driver=null;
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
		
		//System.out.println(System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
		// "/Users/anoop_mac/eclipse-workspace/Automation_Testing_Project/src/test/java/Data_Driven/Configurations.properties");
		// System.out.println(System.getProperty("user.dir") +
		// "/src/test/java/Data_Driven/Configurations.properties");
		prop.load(data);
		
		
		  if (prop.getProperty("browser").equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		  + "/src/main/java/drivers/chromedriver");
		  //System.out.println(System.getProperty("user.dir") +
		  //"/src/main/java/drivers/chromedriver");
		  
		  driver = new ChromeDriver();
		  
		  }
		 
		  else if (prop.getProperty("browser2").equals("firefox")) {
			//if (prop.getProperty("browser2").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver");
			// "/Users/anoop_mac/Downloads/selenium_eclipse_chrome/BrowserDrivers/geckodriver");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return driver;
	}
	
				
	/*
	 * @Test
	 * 
	 * @Parameters("browser") public WebDriver browserSetup(String browser) throws
	 * Exception {
	 * 
	 * if (browser.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
	 * + "/src/main/java/drivers/chromedriver"); driver = new ChromeDriver();
	 * 
	 * } else if (browser.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
	 * "/src/main/java/drivers/geckodriver"); driver = new FirefoxDriver(); } else {
	 * throw new Exception("Browser is not correct"); }
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * }
	 */
	
	
	public static void cleanupDriver() {
		
		driver.get().quit();
		driver.remove();
	}
	
}
