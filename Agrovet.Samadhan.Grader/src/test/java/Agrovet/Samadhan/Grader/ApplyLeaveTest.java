package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ApplyLeaveTest extends BaseClass{
	
	/**
	 *This method is to verify emergency leave type functionality
	 */
	@Test(priority = 0)
	public void verifyUserAbleToApplyEmergencyLeave() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
//		String message="emergency";
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnEmergencyTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyWarningMessage();
	}
	
	/**
	 *This method is to verify sick leave type functionality
	 */
	@Test(priority = 1)
	public void verifyUserAbleToApplySickLeave() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnSickTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
        driverUtility.hideKeyboard();
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyWarningMessage();
	}
	/**
	 *This method is to verify planned leave type functionality
	 */
	@Test(priority = 2)
	public void verifyUserAbleToApplyPlannedLeave() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnPlannedLeaveTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyWarningMessage();
	}
	/**
	 *This method is to verify should not be able to apply leave without selecting "LeaveType"
	 */
	@Test(priority = 3)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingLeaveType() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifySelectLeaveTypeWarningMessage();
	}
	/**
	 *This method is to verify should not be able to apply leave without selecting "To Date"
	 */
	@Test(priority = 4)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingToDate() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnEmergencyTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		driverUtility.hideKeyboard();
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyDateWarningMessage();
	}
	
	/**
	 *This method is to verify should not be able to apply leave without selecting "From Date"
	 */
	@Test(priority = 5)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingFromDate() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnEmergencyTab();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		driverUtility.hideKeyboard();
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyDateWarningMessage();
	}
	
	/**
	 *This method is to verify should not be able to apply leave without Entering Message
	 */
	@Test(priority = 6)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutEnteringMessage() {
		
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnEmergencyTab();
		applyForLeaveScreen.clickOnFromDateTextField();
		applyForLeaveScreen.Fromdate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnToDateTextField();
		applyForLeaveScreen.Todate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyMessageWarningMessage();
	}
	/**
	 *This method is to verify should  be able to apply partial leave
	 */
	@Test(priority = 7)
	public void verifyUserAbleToApplyPartialLeave() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnPartialLeave();
		applyForLeaveScreen.clickOnPartialLeaveDate();
		applyForLeaveScreen.clickOnDate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnPartialLeaveFromTime();
		applyForLeaveScreen.partialLeaveFormHourTime();
		applyForLeaveScreen.partialLeaveFromMinuteTime();
		applyForLeaveScreen.clickOnTimeOkButton();
		applyForLeaveScreen.clickOnPartialLeaveToTime();
		applyForLeaveScreen.partialLeaveToHourTime();
		applyForLeaveScreen.partialLeaveToMinuteTime();
		applyForLeaveScreen.clickOnTimeOkButton();
		driverUtility.threadWait(2);
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		driverUtility.hideKeyboard();
		applyForLeaveScreen.clickOnApplyButton();
	}
	/**
	 *This method is to verify should not be able to apply partial leave without entering "To Time"
	 */
	@Test(priority = 8)
	public void verifyUserAbleToApplyPartialLeaveWithoutEnteringToTime() {
		String message=excelUtility.readDataFromExcel("TestData", 5, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnApplyLeaveTab();
		applyForLeaveScreen.clickOnSelectLeaveTypeDropDown();
		applyForLeaveScreen.clickOnPartialLeave();
		applyForLeaveScreen.clickOnPartialLeaveDate();
		applyForLeaveScreen.clickOnDate();
		applyForLeaveScreen.clickOnSaveButton();
		applyForLeaveScreen.clickOnPartialLeaveFromTime();
		applyForLeaveScreen.partialLeaveFormHourTime();
		applyForLeaveScreen.partialLeaveFromMinuteTime();
		applyForLeaveScreen.clickOnTimeOkButton();
		driverUtility.threadWait(2);
		applyForLeaveScreen.sendkeyToMessageTextField(message);
		driverUtility.hideKeyboard();
		applyForLeaveScreen.clickOnApplyButton();
	}
	
}
