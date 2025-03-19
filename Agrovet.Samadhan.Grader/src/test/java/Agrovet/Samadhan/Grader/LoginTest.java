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
		
	}
	
	@Test(priority = 1)
	public void verifyUserAbleToLoginWithInvalidMobileNumber() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 0, 1);
		driverUtility.implicitlyWait(10);
		loginScreen.ClickOnSelectRoleTextField();
		loginScreen.ClickOnGrader();
		loginScreen.clickAndSendKeyToMobileNumberTextField(mobileNumber);
		driverUtility.threadWait(2);
		loginScreen.clickOnSendOtpButton();
		loginScreen.verifyMobileNumberErrorMessage();
	}
	
	@Test(priority = 2)
	public void verifyUserAbleToLoginWithInvalidOtp() {
		String mobileNumber=excelUtility.readDataFromExcel("TestData", 8, 1);
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
	}
	
	@Test(priority = 3)
	public void verifyUserAbleToLoginWithInvalidCcCode() {
		System.out.println("Use Invalid CC Code");
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
		otpScreen.verifyOkayMessage();
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
		
	}
	@Test(priority = 5)
	public void verifyUserAbleToLoginWhenNearToCcCenter() {
		String mobileNumber="9354029690";
		String firstDigit="1";
		String secondDigit="2";
		String thirdDigit="1";
		String forthDigit="1";
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
		
	}
	
	@Test(priority = 6)
	public void verifyUserAbleToLoginWhenFarFromCcCenter() {
		System.out.println("Use cc code = 5578");
		String mobileNumber="9354029690";
		String firstDigit="1";
		String secondDigit="2";
		String thirdDigit="1";
		String forthDigit="1";
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
		otpScreen.verifyCcErrorMessage();
	}
}
