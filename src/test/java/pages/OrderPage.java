package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import tests.BaseTest;

public class OrderPage extends BaseTest{

	
	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
	WebElement addToCardButton;
	
	
	public void addToCart() {
		//button[@class='QqFHMw vslbG+ In9uk2']
		Set<String> windows = this.driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		this.driver.switchTo().window(child);
		System.out.println(child );
		System.out.println(windows);
		Actions act = new Actions(this.driver);
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(this.driver.findElement(By.cssSelector("QqFHMw vslbG+ In9uk2 JTo6b7"))));
		act.moveToElement(this.driver.findElement(By.cssSelector("QqFHMw vslbG+ In9uk2 JTo6b7"))).click().perform();
	}
}
