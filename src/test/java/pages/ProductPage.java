package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.BaseTest;

public class ProductPage extends BaseTest{

	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//div[text()='ASUS VivoBook 14 Intel Core i5 10th Gen 10210U - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home) X412FA-EK5...']

	@FindBy(xpath="//div[text()='ASUS VivoBook 14 Intel Core i5 10th Gen 10210U - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home) X412FA-EK5...']")
	WebElement product;
	
	
	public void clickOnProduct() {
		product.click();
	}
	
	
	
}
