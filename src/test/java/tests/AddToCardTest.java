package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;
import pages.OrderPage;
import pages.ProductPage;
import utitlities.CommonUtilities;

public class AddToCardTest extends BaseTest{
  @Test
  public void validateProductAddedInCard() throws InterruptedException {
	  ExtentTest test;
	  test = extent.createTest("Add to cart Test");
	  test.info("Test Started");
	  HomePage hp = new HomePage(driver);
	  ProductPage pp = new ProductPage(driver);
	  CommonUtilities utilities = new CommonUtilities(driver);
	  OrderPage op  = new OrderPage(driver);
	  
	 hp.enterProductAndSearch("asus vivobook 14");
	 pp.clickOnProduct();
	 utilities.switchWindowHandles();
	
	 test.info("Ended");
     test.fail("Test failure");
     
	 
	 op.addToCart();
	 
//	  Hello Divyesh i had tried for a while but its failing when i am trying to switch to the child window and while clicking on 
//	 add to card Symbol i am getting exception
  }
  
  
  
  
}
