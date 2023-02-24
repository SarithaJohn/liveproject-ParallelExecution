package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormDelivery extends BasePage{
	
	public WebDriver driver;
	
	By firstnametxt=By.cssSelector(".form-fields input[name='firstname']");
	By lastnametxt=By.cssSelector(".form-fields input[name='lastname']");
	By companytxt=By.cssSelector("input[name='company']");
	By addresstxt=By.cssSelector("input[name='address1']");
	By addrCompltxt=By.cssSelector("input[name='address2']");
	By citytxt=By.cssSelector("input[name='city']");
	By stateDropdown=By.cssSelector("[name='id_state']");
	By zipcodetxt=By.cssSelector("[name='postcode']");
	By countryDropdown=By.cssSelector("[name='id_country']");
	By phonetxt=By.cssSelector("input[name='phone']");
	By chkinvoice=By.cssSelector("[class='col-md-9 col-md-offset-3'] [type]");
	By btnContinuenext=By.cssSelector("[name='confirm-addresses']");
	
	
	public OrderFormDelivery() throws IOException {
		super();
	}
	public WebElement getfirstnametxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(firstnametxt);
	}
	public WebElement getlastnametxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(lastnametxt);
	}
	public WebElement getcompanytxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(companytxt);
	}
	public WebElement getaddresstxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(addresstxt);
	}
	public WebElement getaddrCompltxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(addrCompltxt);
	}
	public WebElement getcitytxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(citytxt);
	}
	public WebElement getstateDropdown() throws IOException
	{this.driver=getDriver();
		return driver.findElement(stateDropdown);
	}
	public WebElement getzipcodetxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(zipcodetxt);
	}
	public WebElement getcountryDropdown() throws IOException
	{this.driver=getDriver();
		return driver.findElement(countryDropdown);
	}
	public WebElement getphonetxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(phonetxt);
	}
	public WebElement getchkinvoice() throws IOException
	{this.driver=getDriver();
		return driver.findElement(chkinvoice);
	}
	public WebElement getbtnContinuenext() throws IOException
	{this.driver=getDriver();
		return driver.findElement(btnContinuenext);
	}
	
}
