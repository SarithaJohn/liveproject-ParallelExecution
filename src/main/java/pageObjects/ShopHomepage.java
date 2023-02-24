package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopHomepage extends BasePage{

	public WebDriver driver;
	
	
	By product1=By.linkText("Hummingbird Printed T-Shirt");
	By product2=By.linkText("Hummingbird Printed Sweater");
	By product3=By.linkText("The Best Is Yet To Come'...");
	By product4=By.linkText("Mug The Best Is Yet To Come");
	By product5=By.linkText("Mug The Adventure Begins");
	By product6=By.linkText("Mug Today Is A Good Day");
	By product7=By.linkText("Today Is A Good Day Framed...");
	By product8=By.linkText("Mug The Best Is Yet To Come");
	
	public ShopHomepage() throws IOException {
		super();
	}
	public WebElement getProduct1() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product1);
	}
	public WebElement getProduct2() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product2);
	}
	public WebElement getProduct3() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product3);
	}
	public WebElement getProduct4() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product4);
	}
	public WebElement getProduct5() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product5);
	}
	public WebElement getProduct6() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product6);
	}
	public WebElement getProduct7() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product7);
	}
	public WebElement getProduct8() throws IOException
	{this.driver=getDriver();
		return driver.findElement(product8);
	}
	
}
