package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ScheduleTest extends BaseClass{

	/**
	 *This method is use to verify Schedular SectionDisplay task properly
	 */
	@Test(priority = 0)
	public void verifySchedularSectionDisplayTaskProperly() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnSchedulerTab();
		schedularScreen.verifyScheduleMessage();
	}
	
	/**
	 *This method is use to verify user should be able to see their details even without internet
	 */
	@Test(priority = 1)
	public void verifyUserAbleToSeeDetailsEvenWithoutInternet() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnSchedulerTab();
		driverUtility.turnOffWifi();
		schedularScreen.verifyScheduleMessage();
		
	}
}
