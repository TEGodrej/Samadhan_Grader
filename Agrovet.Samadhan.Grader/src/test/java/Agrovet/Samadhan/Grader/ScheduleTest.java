package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ScheduleTest extends BaseClass{

	@Test(priority = 0)
	public void verifySchedularSectionDisplayTaskProperly() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnSchedulerTab();
		schedularScreen.verifyScheduleMessage();
	}
	
	@Test(priority = 1)
	public void verifyUserAbleToSeeDetailsEvenWithoutInternet() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnSchedulerTab();
		driverUtility.turnOffWifi();
		schedularScreen.verifyScheduleMessage();
		
	}
}
