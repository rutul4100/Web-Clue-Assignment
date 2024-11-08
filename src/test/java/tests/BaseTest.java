package tests;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver ;
    public ExtentReports extent;
    public ExtentSparkReporter sparkReporter;
  @BeforeMethod
  public void beforeMethod() {
	  sparkReporter = new ExtentSparkReporter("extent-report.html");
      extent = new ExtentReports();
      extent.attachReporter(sparkReporter);
      
      sparkReporter.config().setDocumentTitle("Add TO CART Test Case");
      sparkReporter.config().setReportName("Functional Test");
      sparkReporter.config().setTheme(Theme.DARK);
      extent = new ExtentReports();
      extent.attachReporter(sparkReporter);
	  WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
  }

  @AfterMethod
  public void afterMethod() {
	  extent.flush();
	  driver.quit();
  }

}
