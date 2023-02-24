package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormShippingMethod extends BasePage{
	
	public WebDriver driver;
	
	By radioMycarrier=By.cssSelector("#delivery_option_2");
	By txtComment=By.cssSelector("#delivery_message");
	By btnContinue=By.cssSelector("[name='confirmDeliveryOption']");
	
	public OrderFormShippingMethod() throws IOException {
		super();
	}
	public WebElement getradioMycarrier() throws IOException
	{this.driver=getDriver();
		return driver.findElement(radioMycarrier);
	}
	public WebElement gettxtComment() throws IOException
	{this.driver=getDriver();
		return driver.findElement(txtComment);
	}
	public WebElement getbtnContinue() throws IOException
	{this.driver=getDriver();
		return driver.findElement(btnContinue);
	}
}
