package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {

	//public static WebDriver driver;
	public static WebDriverWait wait;
	private String url;
	private Properties prop;
	public static String screenShotDestinationPath;
	//public static String browser;
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
		
		System.out.println(System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
		// "/Users/anoop_mac/eclipse-workspace/Automation_Testing_Project/src/test/java/Data_Driven/Configurations.properties");
		// System.out.println(System.getProperty("user.dir") +
		// "/src/test/java/Data_Driven/Configurations.properties");
		prop.load(data);
	}
	
	public static WebDriver getDriver() throws IOException {

		return WebDriverInstance.getDriver();
		
		/*
		 * if (prop.getProperty("browser").equals("chrome")) {
		 * 
		 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 * + "/src/main/java/drivers/chromedriver");
		 * System.out.println(System.getProperty("user.dir") +
		 * "/src/main/java/drivers/chromedriver");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * } else if (prop.getProperty("browser").equals("firefox")) {
		 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		 * "/src/main/java/drivers/geckodriver"); driver = new FirefoxDriver();
		 * 
		 * }
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * return driver;
		 */
	}
public static void JavaScriptExecutor(String script) throws IOException
{
	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	js.executeScript(script);
}

public static void JavaScriptExecutor(String script1,WebElement element) throws IOException
{
	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	js.executeScript(script1,element);
	
}

	public static void waitForElementInvisible(WebElement element,Duration timer) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriver(), timer);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public String getUrl() throws IOException {

		url = prop.getProperty("url");
		return url;
	}

	public static String takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		String destFile = System.getProperty("user.dir") + "/target/screenshots/"
		
				// "/Users/anoop_mac/eclipse-workspace/Automation_Testing_Project/src/test/resources/ScreenShots/"
				+ timestamp() + ".png";
		screenShotDestinationPath=destFile;

		try {
			FileUtils.copyFile(srcFile, new File(destFile));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//FileUtils.copyFile(srcFile, destFile);
		return name;
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static String getScreenshotDestinationPath() {
		return screenShotDestinationPath;
	}
	
	
}
