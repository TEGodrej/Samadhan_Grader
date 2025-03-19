package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ApplyLeaveTest extends BaseClass{

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
	
	@Test(priority = 1)
	public void verifyUserAbleToApplySickLeave() {
		String message="Fever";
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
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyWarningMessage();
	}
	
	@Test(priority = 2)
	public void verifyUserAbleToApplyPlannedLeave() {
		String message="I will not be for 2 days";
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
	
	@Test(priority = 3)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingLeaveType() {
		String message="I will not be available for 2 days";
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
	
	@Test(priority = 4)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingToDate() {
		String message="emergency";
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
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyDateWarningMessage();
	}
	
	@Test(priority = 5)
	public void verifyUserShouldNotBeAbleToApplyLeaveWithoutSelectingFromDate() {
		String message="emergency";
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
		applyForLeaveScreen.clickOnApplyButton();
		applyForLeaveScreen.verifyDateWarningMessage();
	}
	
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
	
}
