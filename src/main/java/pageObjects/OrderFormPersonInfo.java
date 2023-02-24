package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPersonInfo extends BasePage{

	public WebDriver driver;
	
	By genderMr=By.cssSelector("[class] .radio-inline:nth-of-type(1) [name]");
	By genderMrs=By.cssSelector("[class] .radio-inline:nth-of-type(2) [name]");
	By txtFirstName=By.cssSelector("input[name='firstname']");
	By txtLastName=By.cssSelector("input[name='lastname']");
	By txtEmail=By.cssSelector("form#customer-form > section input[name='email']");
	By txtPassword=By.cssSelector("form#customer-form > section input[name='password']");
	By btnShow=By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [type='button']");
	By txtBirthdate=By.cssSelector("input[name='birthday']");
	By chkopt1=By.cssSelector("input[name='optin']");
	By chkopt2=By.cssSelector("input[name='newsletter']");
	By chkopt3=By.cssSelector("input[name='psgdpr']");
	By btnContinue=By.cssSelector(".tab-content [role='tabpanel']:nth-of-type(1) [name='continue']");
	
	public OrderFormPersonInfo() throws IOException {
		super();
	}
	public WebElement getgenderMr() throws IOException
	{this.driver=getDriver();
		return driver.findElement(genderMr);
	}
	public WebElement getgenderMrs() throws IOException
	{this.driver=getDriver();
		return driver.findElement(genderMrs);
	}
	public WebElement gettxtFirstName() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtFirstName);
	}
	public WebElement gettxtLastName() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtLastName);
	}
	public WebElement gettxtEmail() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtEmail);
	}
	public WebElement gettxtPassword() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtPassword);
	}
	public WebElement getbtnShow() throws IOException
	{this.driver=getDriver();
		return driver.findElement(btnShow);
	}
	public WebElement gettxtBirthdate() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtBirthdate);
	}
	public WebElement getchkopt1() throws IOException
	{this.driver=getDriver();
		return driver.findElement(chkopt1);
	}
	public WebElement getchkopt2() throws IOException
	{this.driver=getDriver();
		return driver.findElement(chkopt2);
	}
	public WebElement getchkopt3() throws IOException
	{this.driver=getDriver();
		return driver.findElement(chkopt3);
	}
	public WebElement getbtnContinue() throws IOException
	{this.driver=getDriver();
		return driver.findElement(btnContinue);
	}
	
}
