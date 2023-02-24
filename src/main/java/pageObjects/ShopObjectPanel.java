package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopObjectPanel extends BasePage{

	
	public WebDriver driver;
	
	By continueShoppingBtn=By.xpath("//button[contains(text(),'Continue')]");
	By proceedBtn=By.cssSelector(".cart-content-btn .btn-primary");
	
	public ShopObjectPanel() throws IOException {
		super();
	}
	public WebElement getcontinueShoppingBtn() throws IOException
	{this.driver=getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	public WebElement getproceedBtn() throws IOException
	{this.driver=getDriver();
		return driver.findElement(proceedBtn);
	}
	
}
