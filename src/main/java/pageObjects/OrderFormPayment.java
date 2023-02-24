package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPayment extends BasePage{
	
	public WebDriver driver;
	
	
	By radioPaycheck=By.cssSelector("[data-module-name='ps_checkpayment']");
	By radioPaybank=By.cssSelector("[data-module-name='ps_wirepayment']");
	By ckeckboxIagree=By.cssSelector("input#conditions_to_approve\\[terms-and-conditions\\]");
	By btnPay=By.cssSelector(".btn-primary.center-block");
	
	public OrderFormPayment() throws IOException {
		super();
	}
	public WebElement getradioPaycheck() throws IOException
	{this.driver=getDriver();
		return driver.findElement(radioPaycheck);
	}
	public WebElement getradioPaybank() throws IOException
	{this.driver=getDriver();
		return driver.findElement(radioPaybank);
	}
	public WebElement getckeckboxIagree() throws IOException
	{this.driver=getDriver();
		return driver.findElement(ckeckboxIagree);
	}
	public WebElement getbtnPay() throws IOException
	{this.driver=getDriver();
		return driver.findElement(btnPay);
	}
	
}
