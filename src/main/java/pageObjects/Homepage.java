package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	
	public WebDriver driver;
	
	By toggle=By.cssSelector(".toggle");
	By homepageLink=By.linkText("HOMEPAGE");
	By accordionLink=By.linkText("ACCORDION");
	By actionsLink=By.linkText("ACTIONS");
	By browsertabLink=By.linkText("BROWSER TABS");
	By buttonsLink=By.linkText("BUTTONS");
	By calculatorLink=By.linkText("CALCULATOR (JS)");
	By contactusLink=By.linkText("CONTACT US FORM TEST");
	By datepickerLink=By.linkText("DATE PICKER");
	By dropdownLink=By.linkText("DROPDOWN CHECKBOX RADIO");
	By fileuploadLink=By.linkText("FILE UPLOAD");
	By hiddenelementsLink=By.linkText("HIDDEN ELEMENTS");
	By iframesLink=By.linkText("IFRAMES");
	By loaderLink=By.linkText("LOADER");
	By loadertwoLink=By.linkText("LOADER TWO");
	By loginportalLink=By.linkText("LOGIN PORTAL TEST");
	By mousemovementLink=By.linkText("MOUSE MOVEMENT");
	By popupalertLink=By.linkText("POP UPS & ALERTS");
	By predictivesearchLink=By.linkText("PREDICTIVE SEARCH");
	By tablesLink=By.linkText("TABLES");
	By teststoreLink=By.linkText("TEST STORE");
	By aboutmeLink=By.linkText("ABOUT ME");
	
	public Homepage() throws IOException
	{
		super();
	}
	
	public WebElement getToggle() throws IOException
	{this.driver=getDriver();
		return driver.findElement(toggle);
	}
	public WebElement getHomepage() throws IOException
	{this.driver=getDriver();
		return driver.findElement(homepageLink);
	}
	public WebElement getAccordion() throws IOException
	{this.driver=getDriver();
		return driver.findElement(accordionLink);
	}
	public WebElement getActions() throws IOException
	{this.driver=getDriver();
		return driver.findElement(actionsLink);
	}
	public WebElement getBrowsertabs() throws IOException
	{this.driver=getDriver();
		return driver.findElement(browsertabLink);
	}
	public WebElement getButtons() throws IOException
	{this.driver=getDriver();
		return driver.findElement(buttonsLink);
	}
	public WebElement getCalculator() throws IOException
	{this.driver=getDriver();
		return driver.findElement(calculatorLink);
	}
	public WebElement getContactus() throws IOException
	{this.driver=getDriver();
		return driver.findElement(contactusLink);
	}
	public WebElement getDatepicker() throws IOException
	{this.driver=getDriver();
		return driver.findElement(datepickerLink);
	}
	public WebElement getDropdown() throws IOException
	{this.driver=getDriver();
		return driver.findElement(dropdownLink);
	}
	public WebElement getFileupload() throws IOException
	{this.driver=getDriver();
		return driver.findElement(fileuploadLink);
	}
	public WebElement getHiddenelements() throws IOException
	{this.driver=getDriver();
		return driver.findElement(hiddenelementsLink);
	}
	public WebElement getIFrames() throws IOException
	{this.driver=getDriver();
		return driver.findElement(iframesLink);
	}
	public WebElement getLoader() throws IOException
	{this.driver=getDriver();
		return driver.findElement(loaderLink);
	}
	public WebElement getLoadertwo() throws IOException
	{this.driver=getDriver();
		return driver.findElement(loadertwoLink);
	}
	public WebElement getLoginportal() throws IOException
	{this.driver=getDriver();
		return driver.findElement(loginportalLink);
	}
	public WebElement getMousemovement() throws IOException
	{this.driver=getDriver();
		return driver.findElement(mousemovementLink);
	}
	public WebElement getPopups() throws IOException
	{this.driver=getDriver();
		return driver.findElement(popupalertLink);
	}
	public WebElement getPredictivesearch() throws IOException
	{this.driver=getDriver();
		return driver.findElement(predictivesearchLink);
	}
	public WebElement getTables() throws IOException
	{this.driver=getDriver();
		return driver.findElement(tablesLink);
	}
	public WebElement getTeststore() throws IOException
	{this.driver=getDriver();
		return driver.findElement(teststoreLink);
	}
	public WebElement Aboutme() throws IOException
	{this.driver=getDriver();
		return driver.findElement(aboutmeLink);
	}
	
}
