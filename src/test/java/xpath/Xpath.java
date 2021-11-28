package xpath;
public class Xpath {

	// Login page
	public static String AcceptCookie = "//button[@class='evidon-banner-acceptbutton']";
	public static String AccessButton = "//span[.='Log in']";
	public static String IdentificationEmail = "//input[@id='identification_email']";
	public static String SubmitEmail = "//button[@data-testid='checkout-submit-email']";
	public static String Password = "//input[@id='password']";
	public static String SubmitPassword = "//button[@data-testid='submit-password']";
	
	// My personal information sections
	public static String MyPersonalData = "//button[@aria-controls='user-space-user-information']";
	public static String FirstName = "//input[@name='firstName']";
	public static String LastName = "//input[@name='lastName']";
	public static String PhoneNumber = "//input[@data-testid='phone-input-number']";
	public static String DayOfBirth = "//input[@data-testid='birthDate-input-day']";
	public static String MonthOfBirth = "//select[@name='birthDate.month']";
	public static String YearOfBirth = "//input[@data-testid='birthDate-input-year']";
}


