package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)

public class AttendenceTest extends BaseClass{
	
	@Test(priority = 0)
	public void verifyUserAbleToCheckTheirAttendance() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.clickOnPresentAbsentDaysTab();
		driverUtility.threadWait(2);
		int times=2;
		for(int i=0;i<times;i++) {
			gestureUtility.scrollDown();
		}
		historyScreen.verifyPresentDate();
	}
	
	@Test(priority = 1)
	public void verifyUserAbleToCheckAbsence() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab(); // continue for absent date
	}
	
	@Test(priority = 2)
	public void VerifyInformationOnAttendancePage() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.verifyUi();
	}
	
	@Test(priority = 3)
	public void verifyUserAbleToSeeTheirAttendanceMarked() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.getpresentAbsentDaysTabText();
	}

}
