package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShopProductPage extends BasePage{

	public WebDriver driver;
	
	
	By sizeOption=By.cssSelector("[data-product-attribute='1']");
	By quantityIncrease=By.cssSelector(".touchspin-up");
	By quantitydecrease=By.cssSelector(".touchspin-down");
	By addtocartBtn=By.cssSelector("[data-button-action]");
	//By homepageLink=By.xpath("//span[text()='Home']");
	By homepageLink=By.cssSelector("ol > li:nth-of-type(1) > a > span");//("//span[text()='Home']");
	By productColorBlack=By.cssSelector("li:nth-of-type(2) > label > input[name='group[2]']");
	By productColorWhite=By.cssSelector("li:nth-of-type(1) > label > input[name='group[2]']");
	
	public ShopProductPage() throws IOException {
		super();
	}
	public WebElement getSize() throws IOException
	{
		this.driver=getDriver();
		return driver.findElement(sizeOption);
	}
	public WebElement getQuantityIncrease() throws IOException
	{this.driver=getDriver();
		return driver.findElement(quantityIncrease);
	}
	public WebElement getQuantityDecrease() throws IOException
	{this.driver=getDriver();
		return driver.findElement(quantitydecrease);
	}
	public WebElement getAddToCart() throws IOException
	{this.driver=getDriver();
		return driver.findElement(addtocartBtn);
	}
	public WebElement getHomepageLink() throws IOException
	{this.driver=getDriver();
		return driver.findElement(homepageLink);
	}
	public WebElement getproductColorBlack() throws IOException
	{this.driver=getDriver();
		return driver.findElement(productColorBlack);
	}
	public WebElement getproductColorWhite() throws IOException
	{this.driver=getDriver();
		return driver.findElement(productColorWhite);
	}
}
