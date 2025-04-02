package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;


/**
 *This class contains elements of "LoginScreen" and also contains reusable methods for the elements
 *It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class LoginScreen extends BaseClass{
	
	AndroidDriver driver;
	public LoginScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Select an option']")
	private WebElement selectRoleTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Grader']")
	private WebElement grader;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Team lead']")
	private WebElement teamLead;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Field officer']")
	private WebElement fieldOfficer;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Nursery']")
	private WebElement nursery;
	
	@FindBy(xpath = "//android.widget.EditText[@text='Enter Mobile Number']")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Send OTP']")
//	@FindBy(xpath = "//android.widget.TextView[@resource-id=\"button-text\"]")
//	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Send OTP\"]")
	private WebElement sendOtpButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='The mobile number is not registered yet!']")
	private WebElement mobileNumberErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Something went wrong. Please try again later.']")
	private WebElement internetErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Welcome to Samadhan, your one-stop solution for all your needs. Please log in to continue.']")
	private WebElement welcomeMessage;
	
	/**
	 *This method is use to Click On SelectRole TextField
	 */
	public void ClickOnSelectRoleTextField() {
		try {
			String roleTextField=selectRoleTextField.getText();
			selectRoleTextField.click();
			System.out.println("Clicked on "+roleTextField +" textfield");
		}catch (Exception e) {
			System.out.println("Not able to click on select role text field");
		}
	}
	/**
	 *This method is use to Click On Grader
	 */
	public void ClickOnGrader() {
		try {
			String role=grader.getText();
			grader.click();
			System.out.println("Clicked on "+ role +" role");
		}catch (Exception e) {
			System.out.println("Not able to click on grader");
		}
	}
	/**
	 *This method is use to click And SendKey To MobileNumberTextField
	 */
	public void clickAndSendKeyToMobileNumberTextField(String key) {
		try {
			mobileNumberTextField.click();
			driverUtility.threadWait(2);
			mobileNumberTextField.sendKeys(key);
			System.out.println("Entered Mobile Number Into Mobile Number TextField");
		}catch (Exception e) {
			System.out.println("Not Able To Perform Action On Mobile Number TextField");
		}
	}
	/**
	 *This method is use to click On SendOtp Button
	 */
	public void clickOnSendOtpButton() {
		try {
			driverUtility.explicitWait(2, sendOtpButton);
			String sendOtpText=sendOtpButton.getText();
			sendOtpButton.click();
			System.out.println("clicked on "+sendOtpText +" button");
		}catch (Exception e) {
			System.out.println("Not able to click on send OTP Button");
		}
	}
	/**
	 *This method is use to verify MobileNumber Error Message
	 */
	public void verifyMobileNumberErrorMessage() {
		try {
			assertTrue(mobileNumberErrorMessage.isDisplayed());
			System.out.println(mobileNumberErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("mobile number error message is not displayed");
		}
	}
	/**
	 *This method is use to verify Internet Error Message
	 */
	public void verifyInternetErrorMessage() {
		try {
			assertTrue(internetErrorMessage.isDisplayed());
			System.out.println(internetErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("internet error message is not displayed");
		}
	}
	/**
	 *This method is use to verify Welcome Message
	 */
	public void verifyWelcomeMessage() {
		try {
			assertTrue(welcomeMessage.isDisplayed());
			System.out.println(welcomeMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("welcome message is not displayed");
		}
	}
}
