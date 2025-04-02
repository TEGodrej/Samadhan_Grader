package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class AttendenceTest extends BaseClass{
	
	/**
	 *This method is use to verify wheather User is able to check their attendance
	 */
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
	/**
	 *This method is use to verify wheather User is able to check their absence
	 */
	@Test(priority = 1)
	public void verifyUserAbleToCheckAbsence() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab(); // continue for absent date
	}
	/**
	 *This method is use to verify information on attendance page
	 */
	@Test(priority = 2)
	public void VerifyInformationOnAttendancePage() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.verifyUi();
	}
	/**
	 *This method is use to verify wheather user is able to see their attendance marked
	 */
	@Test(priority = 3)
	public void verifyUserAbleToSeeTheirAttendanceMarked() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnAttendanceTab();
		attendanceScreen.getpresentAbsentDaysTabText();
	}

}
