import org.junit.Before;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import value.Value;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class Baseclass 
{
  protected WebDriver driver;
  JavascriptExecutor js;
  
  
  @Before
  public void setUp() {
	  
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
	WebDriver driver = new ChromeDriver(options);
    //js = (JavascriptExecutor) driver;
    
    // Open URL
    driver.get(Value.TheForkURL);
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.manage().window().maximize();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
  
  public void FindElementAndClick(String Xpath, int time)
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
	  driver.findElement(By.xpath(Xpath)).click();	
	  System.out.println("Click on button identified by xpath: " + Xpath);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
  }
  
  public void FindElementClickAndInsertText(String Xpath, String Value, int time)
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
	  driver.findElement(By.xpath(Xpath)).click();	
	  System.out.println("Click on button identified by xpath: " + Xpath);
	  driver.findElement(By.xpath(Xpath)).sendKeys(Value);
	  System.out.println("Inserting value: " + Value);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
  }
  
  public void AssertValueIsEqualTo(String Xpath, String Value, int time)
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
	  String XpathValue = driver.findElement(By.xpath(Xpath)).getAttribute("value");
      assertThat(XpathValue, is(Value));
      System.out.println("Found coherent value: " + Value);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
  }
  
}
