package uk.co.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayment;
import pageObjects.OrderFormPersonInfo;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopHomepage;
import pageObjects.ShopObjectPanel;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)
public class OrderCompleteTest extends Hooks{

	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * @BeforeTest public void setup() throws IOException { driver=getDriver();
	 * driver.get(getUrl()); wait=getWait(); }
	 * 
	 * 
	 * @AfterMethod
	 * 
	 * @AfterTest public void tearDown() { driver.close(); driver=null; }
	 */
	
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		
		ExtentManager.log("Starting OrderComplete Test....");
		
		
		
		Homepage home=new Homepage();
		JavaScriptExecutor("window.scrollBy(0,800)");
		JavaScriptExecutor("arguments[0].click()", home.getTeststore());
		//home.getTeststore().click();
		ExtentManager.pass("Reached the shop home page...");
		ShopHomepage shopHome=new ShopHomepage();
		shopHome.getProduct1().click();
		ExtentManager.pass("Reached the shop product page...");
		ShopProductPage shopProd=new ShopProductPage();
		Select option=new Select(shopProd.getSize());
		ExtentManager.pass("Have successfully selected product size...");
		option.selectByVisibleText("M");
		shopProd.getproductColorBlack().click();
		ExtentManager.pass("Have successfully selected color...");
		shopProd.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased quantity...");
		shopProd.getAddToCart().click();
		ExtentManager.pass("Have successfully added to basket...");
		
		Thread.sleep(5000);
		
		ShopObjectPanel shopObject=new ShopObjectPanel();
		shopObject.getproceedBtn().click();
		ExtentManager.pass("Have successfully proceed to next page...");
		ShoppingCart cart=new ShoppingCart();
		cart.getpromocodeLbl().click();
		ExtentManager.pass("Have successfully selected promo label...");
		Thread.sleep(3000);
		cart.getpromocodeTxt().sendKeys("20OFF");
		//wait.until(ExpectedConditions.elementToBeSelected(cart.getpromocodeTxt())).sendKeys("20OFF");
		cart.getpromocodeAddBtn().click();
		ExtentManager.pass("Have successfully added promo code...");
		waitForElementInvisible(cart.getproceedBtn(),Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(cart.getproceedBtn())).click();
		cart.getproceedBtn().click();
		ExtentManager.pass("Have successfully proceed to next page...");
		OrderFormPersonInfo personinfo=new OrderFormPersonInfo();
		personinfo.getgenderMrs().click();
		ExtentManager.pass("Have successfully selected gender...");
		personinfo.gettxtFirstName().sendKeys("Annmaria");
		personinfo.gettxtLastName().sendKeys("Thomas");
		//personinfo.gettxtEmail().sendKeys("aaron@yyyy.com");
		personinfo.gettxtEmail().sendKeys("aaron"+Math.random()+"@yyyy.com");
		personinfo.gettxtPassword().sendKeys("test1");
		personinfo.getbtnShow().click();
		personinfo.gettxtBirthdate().sendKeys("12/07/2010");
		personinfo.getchkopt3().click();
		ExtentManager.pass("Have successfully entered personal details...");
		Thread.sleep(3000);
		personinfo.getbtnContinue().click();
		
		ExtentManager.pass("Have successfully continue to next page...");
		OrderFormDelivery deliveryorder=new OrderFormDelivery();
		deliveryorder.getcompanytxt().sendKeys("Trv");
		deliveryorder.getaddresstxt().sendKeys("999 asgsdhfgs,center");
		deliveryorder.getcitytxt().sendKeys("san trivan");
		deliveryorder.getstateDropdown().click();
		ExtentManager.pass("Have successfully added company details...");
		
		Select dropdownstate=new Select(deliveryorder.getstateDropdown());
		dropdownstate.selectByValue("49");
		ExtentManager.pass("Have successfully selected state...");
		deliveryorder.getzipcodetxt().sendKeys("12345");
		if(!(deliveryorder.getchkinvoice().isSelected()))
		{
			deliveryorder.getchkinvoice().click();
			
		}
		
		deliveryorder.getbtnContinuenext().click();
		ExtentManager.pass("Have successfully goto next page...");
		OrderFormShippingMethod ordershipping=new OrderFormShippingMethod();
		if(!(ordershipping.getradioMycarrier().isSelected()))
		{
			ordershipping.getradioMycarrier().click();
		}
		ordershipping.gettxtComment().sendKeys("My Gate code is 9753");
		ordershipping.getbtnContinue().click();
		ExtentManager.pass("Have successfully added shipping details and goto next page...");
		OrderFormPayment payment=new OrderFormPayment();
		payment.getradioPaycheck().click();
		payment.getckeckboxIagree().click();
		payment.getbtnPay().click();
		ExtentManager.pass("Have successfully click the payment...");
		System.out.println("test passed");
		
	}

}
