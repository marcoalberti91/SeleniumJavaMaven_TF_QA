import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import xpath.Xpath;
import value.Value;

public class LoginTest extends Baseclass {

  
  @Test
  public void login() 
  {
    // Accept cookies
    FindElementAndClick(Xpath.AcceptCookie, 500);
   
    // Click on Access Button
    FindElementAndClick(Xpath.AccessButton, 500);	
    
    // Click on Mail address and insert value
    FindElementClickAndInsertText(Xpath.IdentificationEmail, Value.IdentificationEmail, 500);	
    
    // Submit insertion
    FindElementAndClick(Xpath.SubmitEmail, 500);
    
    // Click on Password address and insert value
    FindElementClickAndInsertText(Xpath.Password, Value.Password, 500);	
    
    // Submit insertion
    FindElementAndClick(Xpath.SubmitPassword, 1000);
    
    // Submit insertion
    FindElementAndClick(Xpath.MyPersonalData, 500);
    
    // Assert FirstName is correct
    AssertValueIsEqualTo(Xpath.FirstName, Value.FirstName, 500);
    
    // Assert LastName is correct
    AssertValueIsEqualTo(Xpath.LastName , Value.LastName , 500);
    
    // Assert FirstName is correct
    AssertValueIsEqualTo(Xpath.FirstName, Value.FirstName, 500);
    
    // Assert PhoneNumber is correct
    AssertValueIsEqualTo(Xpath.PhoneNumber, Value.PhoneNumber, 500);
    
    // Assert DayOfBirth is correct
    AssertValueIsEqualTo(Xpath.DayOfBirth, Value.DayOfBirth, 500);
    
    // Assert MonthOfBirth is correct
    AssertValueIsEqualTo(Xpath.MonthOfBirth, Value.MonthOfBirth, 500);
    
    // Assert YearOfBirth is correct
    AssertValueIsEqualTo(Xpath.YearOfBirth, Value.YearOfBirth, 500);
  }
}
