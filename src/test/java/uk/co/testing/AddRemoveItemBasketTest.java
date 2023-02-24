package uk.co.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.ShopHomepage;
import pageObjects.ShopObjectPanel;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;


@Listeners(resources.Listeners.class)
public class AddRemoveItemBasketTest extends Hooks {

	public AddRemoveItemBasketTest() throws IOException {
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
	public void addRemoveItem() throws InterruptedException, IOException {
		
		ExtentManager.log("Starting AddRemove Item Basket Test....");
		
		
		Homepage home=new Homepage();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)BasePage.getDriver();
		 * js.executeScript("window.scrollBy(0,800)");
		 * js.executeScript("arguments[0].click()", home.getTeststore());
		 */
		JavaScriptExecutor("window.scrollBy(0,800)");
		JavaScriptExecutor("arguments[0].click()", home.getTeststore());
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		//home.getTeststore().click();
		
		ShopHomepage shopHome=new ShopHomepage();
		
		ExtentManager.pass("Reached the shop home page...");
		shopHome.getProduct1().click();
		
		ShopProductPage shopProd=new ShopProductPage();
		
		ExtentManager.pass("Reached the shop product page...");
		Select option=new Select(shopProd.getSize());
		option.selectByVisibleText("M");
		ExtentManager.pass("Have successfully selected product size...");
		shopProd.getproductColorBlack().click();
		ExtentManager.pass("Have successfully selected color...");
		shopProd.getQuantityIncrease().click();
		ExtentManager.pass("Have successfully increased quantity...");
		shopProd.getAddToCart().click();
		ExtentManager.pass("Have successfully added product to basket...");
		
		Thread.sleep(2000);
		
		ShopObjectPanel shopObject=new ShopObjectPanel();
		shopObject.getcontinueShoppingBtn().click();
		ExtentManager.pass("Have successfully continue shopping");
		JavaScriptExecutor("arguments[0].click()", shopProd.getHomepageLink());
		//shopProd.getHomepageLink().click();
		//waitForElementInvisible(shopHome.getProduct2(),Duration.ofSeconds(10));
		shopHome.getProduct2().click();
		ExtentManager.pass("Have successfully product 2 selected");
		shopProd.getAddToCart().click();
		ExtentManager.pass("Have successfully product 2 added to cart");
		Thread.sleep(2000);
		
		shopObject.getcontinueShoppingBtn().click();
		JavaScriptExecutor("arguments[0].click()", shopProd.getHomepageLink());
		//shopProd.getHomepageLink().click();
		shopHome.getProduct4().click();
		ExtentManager.pass("Have successfully product 3 selected");
		shopProd.getAddToCart().click();
		ExtentManager.pass("Have successfully product 3 added to cart");
		Thread.sleep(2000);
		
		shopObject.getproceedBtn().click();
		ShoppingCart cart=new ShoppingCart();
		cart.getremoveBtn2().click();
		ExtentManager.pass("Have successfully product 2 removed");
		waitForElementInvisible(cart.getremoveBtn2(),Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOf(cart.getremoveBtn2()));
		System.out.println(cart.gettotalvalue().getText());
		try {
		Assert.assertEquals(cart.gettotalvalue().getText(),"$57.14");
		ExtentManager.pass("The total amount matched");
		ExtentManager.pass("Have successfully amount confirmed");
	
		}
		catch(AssertionError e){
			Assert.fail("cart amount not matched");
			ExtentManager.fail("Total amountnot matched");
		}
		
		}

}
