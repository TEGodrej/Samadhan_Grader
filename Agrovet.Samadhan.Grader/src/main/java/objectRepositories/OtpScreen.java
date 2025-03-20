package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.android.AndroidDriver;

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
	
	public void sendKeysToFirstOtpTextBox(String Key) {
		try {
			firstOtpTextBox.sendKeys(Key);
		}catch (Exception e) {
			System.out.println("Not able to send key to firstOtpTextBox");
		}
	}
	
	public void sendKeyToSecondOtpTextBox(String Key) {
		try {
			secondOtpTextBox.sendKeys(Key);
		}catch (Exception e) {
			System.out.println("Not able to send key to secondOtpTextBox");
		}
	}
	
	public void sendKeyToThirdOtpTextBox(String key) {
		try {
			thirdOtpTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to send key to thirdOtpTextBox");
		}
	}
	
	public void sendKeyToForthOtpTextBox(String key) {
		try {
			forthOtpTextBox.sendKeys(key);
		}catch (Exception e) {
			System.out.println("Not able to send key to forthOtpTextBox");
		}
	}
	
	public void clickOnLoginButton() {
		try {
			String button=loginButton.getText();
			loginButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on " + loginButton.getText());
		}
	}
	
	public void clickOnOkayButton() {
		try {
			String button=okayButton.getText(); 
			okayButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on Okay Button" + okayButton.getText());
		}
	}
	
	public void verifySuccessMessage() {
		try {
			assertTrue(successMessage.isDisplayed());
			System.out.println(successMessage.getText()+ " is displayed");
		}catch (Exception e) {
			assertTrue(!successMessage.isDisplayed());
			System.out.println("successMessage is not displayed");
		}
	}
	
	public void verifyOtpErrorMessage() {
		try {
			assertTrue(otpErrorMessage.isDisplayed());
			System.out.println(otpErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("OTP ErrorMessage is not displayed");
		}
	}
	
	public void verifyOkayMessage() {
		try {
			assertTrue(!successMessage.isDisplayed());
		}catch (Exception e) {
			System.out.println("successMessage is not displayed");
		}
	}
	
	public void verifyCcErrorMessage() {
		try {
			assertTrue(ccErrorMessage.isDisplayed());
			System.out.println(ccErrorMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("cc error message is not displayed");
		}
	}
}
