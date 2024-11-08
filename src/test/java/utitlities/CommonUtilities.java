package utitlities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {
WebDriver driver;
	
	public CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchWindowHandles() {
		Set<String> windows= driver.getWindowHandles();
		 Iterator<String> it = windows.iterator();
		 String parent =it.next();
		 String child = it.next();
		 driver.switchTo().window(child);
	}
	
	public void moveToElement() throws InterruptedException {
		
		
		
		WebElement element = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		Actions act = new Actions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
		act.moveToElement(element).click().perform();
		Thread.sleep(5000);
	}
}
