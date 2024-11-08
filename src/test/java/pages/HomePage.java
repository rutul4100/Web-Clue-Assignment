package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.BaseTest;

public class HomePage extends BaseTest{

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='Pke_EE']")
	WebElement search;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchButton;
	
	
	public void enterProductAndSearch(String name) {
		search.sendKeys(name);
		searchButton.click();
	}
	
}
