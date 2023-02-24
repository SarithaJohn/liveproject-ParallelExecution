package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShoppingCart extends BasePage {

public WebDriver driver;
	
	By promocodeLbl=By.cssSelector(".promo-code-button .collapse-button");
	By promocodeTxt=By.cssSelector("input[name='discount_name']");
	By promocodeAddBtn=By.xpath("//span[text()='Add']");
	By proceedBtn=By.cssSelector(".cart-detailed-actions .btn-primary");
	By removeBtn1=By.cssSelector(".remove-from-cart > .float-xs-left.material-icons");
	By removeBtn2=By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By continueshoppingLink=By.cssSelector(".cart-grid-body.col-lg-8.col-xs-12 > .label");
	By totalvalue=By.cssSelector(".cart-total .value");
	
	
	public ShoppingCart() throws IOException {
		super();
	}
	public WebElement getpromocodeLbl() throws IOException
	{
		this.driver=getDriver();
		return driver.findElement(promocodeLbl);
	}
	public WebElement getproceedBtn() throws IOException
	{this.driver=getDriver();
		return driver.findElement(proceedBtn);
	}
	public WebElement getpromocodeTxt() throws IOException
	{this.driver=getDriver();
		return driver.findElement(promocodeTxt);
	}
	public WebElement getremoveBtn1() throws IOException
	{this.driver=getDriver();
		return driver.findElement(removeBtn1);
	}
	public WebElement getpromocodeAddBtn() throws IOException
	{this.driver=getDriver();
		return driver.findElement(promocodeAddBtn);
	}
	public WebElement getremoveBtn2() throws IOException
	{this.driver=getDriver();
		return driver.findElement(removeBtn2);
	}
	public WebElement getcontinueshoppingLink() throws IOException
	{this.driver=getDriver();
		return driver.findElement(continueshoppingLink);
	}
	public WebElement gettotalvalue() throws IOException
	{this.driver=getDriver();
		return driver.findElement(totalvalue);
	}
	
}
