package Agrovet.Samadhan.Grader;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class LoginTest extends BaseClass{

	@Test(priority = 0)
	public void verifyUserAbleToLoginWithValidCredential() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		String firstDigit=excelUtility.readDataFromExcel("TestData", 1, 1);
		String secondDigit=excelUtility.readDataFromExcel("TestData", 2, 1);
		String thirdDigit=excelUtility.readDataFromExcel("TestData", 3, 1);
		String forthDigit=excelUtility.readDataFromExcel("TestData", 4, 1);
		driverUtility.implicitlyWait(10);
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		
		loginScreen.clickOnSendOtpButton();
		driverUtility.threadWait(2);
		otpScreen.sendKeysToFirstOtpTextBox(firstDigit);
		driverUtility.threadWait(1);
		otpScreen.sendKeyToSecondOtpTextBox(secondDigit);
		otpScreen.sendKeyToThirdOtpTextBox(thirdDigit);
		otpScreen.sendKeyToForthOtpTextBox(forthDigit);
		otpScreen.clickOnLoginButton();
		otpScreen.verifySuccessMessage();
		otpScreen.clickOnOkayButton();
		driverUtility.threadWait(1);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnlogoutTab();
		logoutScreen.clickOnYesButton();
		loginScreen.verifyWelcomeMessage();
		System.out.println("===================Method Ends=====================");
		
	}
	
	@Test(priority = 1)
	public void verifyUserAbleToLoginWithInvalidMobileNumber() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 8, 1);
		driverUtility.implicitlyWait(10);
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		driverUtility.threadWait(2);
		loginScreen.clickOnSendOtpButton();
		loginScreen.verifyMobileNumberErrorMessage();
		System.out.println("===================Method Ends=====================");
	}
	
	@Test(priority = 2)
	public void verifyUserAbleToLoginWithInvalidOtp() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		String firstDigit=excelUtility.readDataFromExcel("TestData", 1, 1);
		String secondDigit=excelUtility.readDataFromExcel("TestData", 2, 1);
		String thirdDigit=excelUtility.readDataFromExcel("TestData", 3, 1);		
		driverUtility.implicitlyWait(10);
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		loginScreen.clickOnSendOtpButton();
		driverUtility.threadWait(2);
		otpScreen.sendKeysToFirstOtpTextBox(firstDigit);
		driverUtility.threadWait(1);
		otpScreen.sendKeyToSecondOtpTextBox(secondDigit);
		otpScreen.sendKeyToThirdOtpTextBox(thirdDigit);
		otpScreen.clickOnLoginButton();
		otpScreen.verifyOtpErrorMessage();
		System.out.println("===================Method Ends=====================");
	}
	
	@Test(priority = 3)
	public void verifyUserAbleToLoginWithInvalidCcCode() {
		
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		String firstDigit=excelUtility.readDataFromExcel("TestData", 1, 1);
		String secondDigit=excelUtility.readDataFromExcel("TestData", 2, 1);
		String thirdDigit=excelUtility.readDataFromExcel("TestData", 3, 1);
		String forthDigit=excelUtility.readDataFromExcel("TestData", 4, 1);
		driverUtility.implicitlyWait(10);
		System.out.println("Use Invalid CC Code");
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		loginScreen.clickOnSendOtpButton();
		driverUtility.threadWait(2);
		otpScreen.sendKeysToFirstOtpTextBox(firstDigit);
		driverUtility.threadWait(1);
		otpScreen.sendKeyToSecondOtpTextBox(secondDigit);
		otpScreen.sendKeyToThirdOtpTextBox(thirdDigit);
		otpScreen.sendKeyToForthOtpTextBox(forthDigit);
		otpScreen.clickOnLoginButton();
		otpScreen.verifyOkayMessage();
		System.out.println("===================Method Ends=====================");
	}
	
	@Test(priority = 4)
	public void verifyUserNotBeAbleToLoginWithoutInternet() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		driverUtility.implicitlyWait(10);
		driverUtility.turnOffWifi();
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		loginScreen.clickOnSendOtpButton();
		loginScreen.verifyInternetErrorMessage();
		driverUtility.turnOnWifi();
		System.out.println("===================Method Ends=====================");
		
	}
	@Test(priority = 5)
	public void verifyUserAbleToLoginWhenNearToCcCenter() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		String firstDigit=excelUtility.readDataFromExcel("TestData", 1, 1);
		String secondDigit=excelUtility.readDataFromExcel("TestData", 2, 1);
		String thirdDigit=excelUtility.readDataFromExcel("TestData", 3, 1);
		String forthDigit=excelUtility.readDataFromExcel("TestData", 4, 1);
		driverUtility.implicitlyWait(10);
		System.out.println("Near to cc Code");
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		loginScreen.clickOnSendOtpButton();
		driverUtility.threadWait(2);
		otpScreen.sendKeysToFirstOtpTextBox(firstDigit);
		driverUtility.threadWait(1);
		otpScreen.sendKeyToSecondOtpTextBox(secondDigit);
		otpScreen.sendKeyToThirdOtpTextBox(thirdDigit);
		otpScreen.sendKeyToForthOtpTextBox(forthDigit);
		otpScreen.clickOnLoginButton();
		otpScreen.verifySuccessMessage();
		otpScreen.clickOnOkayButton();
		driverUtility.threadWait(1);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnlogoutTab();
		logoutScreen.clickOnYesButton();
		loginScreen.verifyWelcomeMessage();
		System.out.println("===================Method Ends=====================");
		
	}
	
	@Test(priority = 6)
	public void verifyUserAbleToLoginWhenFarFromCcCenter() {
		System.out.println("Use cc code = 5578");
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		String firstDigit=excelUtility.readDataFromExcel("TestData", 1, 1);
		String secondDigit=excelUtility.readDataFromExcel("TestData", 2, 1);
		String thirdDigit=excelUtility.readDataFromExcel("TestData", 3, 1);
		String forthDigit=excelUtility.readDataFromExcel("TestData", 4, 1);
		driverUtility.implicitlyWait(10);
		System.out.println("Far from CC Code");
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		loginScreen.clickOnSendOtpButton();
		driverUtility.threadWait(2);
		otpScreen.sendKeysToFirstOtpTextBox(firstDigit);
		driverUtility.threadWait(1);
		otpScreen.sendKeyToSecondOtpTextBox(secondDigit);
		otpScreen.sendKeyToThirdOtpTextBox(thirdDigit);
		otpScreen.sendKeyToForthOtpTextBox(forthDigit);
		otpScreen.clickOnLoginButton();
		otpScreen.verifyCcErrorMessage();
		System.out.println("===================Method Ends=====================");
	}
}
