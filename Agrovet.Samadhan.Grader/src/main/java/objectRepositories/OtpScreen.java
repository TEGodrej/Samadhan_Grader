package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;


/**
 * This class contains elements of otpScreen and also contains reusable methods for the elements
 * It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class OtpScreen extends BaseClass{
	AndroidDriver driver;
	
	public OtpScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'OTP')]/android.widget.EditText[1]")
	private WebElement firstOtpTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'OTP')]/android.widget.EditText[2]")
	private WebElement secondOtpTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'OTP')]/android.widget.EditText[3]")
	private WebElement thirdOtpTextBox;
	
	@FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'OTP')]/android.widget.EditText[4]")
	private WebElement forthOtpTextBox;
	
	@FindBy(xpath = "//android.widget.TextView[@text='RESEND']")
	private WebElement resendButton;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='button-text']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Okay']")
	private WebElement okayButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Your attendance has been successfully marked.']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Otp should be 4 digits']")
	private WebElement otpErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='CC is not within allowed distance!']")
	private WebElement ccErrorMessage;
	
	/**
	 *This method is use to sendKeys To FirstOtp TextBox
	 *@param String Key
	 */
	public void sendKeysToFirstOtpTextBox(String Key) {
		try {
			firstOtpTextBox.sendKeys(Key);
		}catch (Exception e) {
			System.out.println("Not able to send key to firstOtpTextBox");
		}
	}
	
	/**
	 *This method is use to sendKey To SecondOtp TextBox
	 *@param String Key
	 */
	public void sendKeyToSecondOtpTextBox(String Key) {
		try {
			secondOtpTextBox.sendKeys(Key);
		}catch (Exception e) {
			System.out.println("Not able to send key to secondOtpTextBox");
		}
	}
	/**
	 *This method is use to sendKey To ThirdOtp TextBox
	 *@param String Key
	 */
	public void sendKeyToThirdOtpTextBox(String key) {
		try {
			thirdOtpTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to send key to thirdOtpTextBox");
		}
	}
	/**
	 *This method is use to sendKey To ForthOtp TextBox
	 *@param String Key
	 */
	public void sendKeyToForthOtpTextBox(String key) {
		try {
			forthOtpTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to send key to forthOtpTextBox");
		}
	}
	/**
	 *This method is use to click On LoginButton
	 */
	public void clickOnLoginButton() {
		try {
			String button=loginButton.getText();
			loginButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on " + loginButton.getText());
		}
	}
	/**
	 *This method is use to click On OkayButton
	 */
	public void clickOnOkayButton() {
		try {
			String button=okayButton.getText(); 
			okayButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on Okay Button" + okayButton.getText());
		}
	}
	/**
	 *This method is use to verify Success Message
	 */
	public void verifySuccessMessage() {
		try {
			assertTrue(successMessage.isDisplayed());
			System.out.println(successMessage.getText()+ " is displayed");
		}catch (Exception e) {
			assertTrue(!successMessage.isDisplayed());
			System.out.println("successMessage is not displayed");
		}
	}
	/**
	 *This method is use to verify Otp Error Message
	 */
	public void verifyOtpErrorMessage() {
		try {
			assertTrue(otpErrorMessage.isDisplayed());
			System.out.println(otpErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("OTP ErrorMessage is not displayed");
		}
	}
	/**
	 *This method is use to verify Okay Message
	 */
	public void verifyOkayMessage() {
		try {
			assertTrue(!successMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("successMessage is not displayed");
		}
	}
	/**
	 *This method is use to verify Cc Error Message
	 */
	public void verifyCcErrorMessage() {
		try {
			assertTrue(ccErrorMessage.isDisplayed());
			System.out.println(ccErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("cc error message is not displayed");
		}
	}
}
