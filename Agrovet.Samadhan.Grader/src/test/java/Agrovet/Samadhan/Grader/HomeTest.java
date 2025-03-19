package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class HomeTest extends BaseClass{

	@Test(priority = 0)
	public void verifyUserAbleToCheckBadgeDetails() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnBadgeTab();
		homeScreen.verifyUserName();
	}
	
	@Test(priority = 1)
	public void verifyhomePageIsLoadedAfterLogin() {
		driverUtility.implicitlyWait(10);
		homeScreen.verifyPageTitle();
	}
	
	@Test(priority = 3)
	public void verifyHomeUi() {
		driverUtility.implicitlyWait(10);
		homeScreen.verifyHomeUi();
	}
	
	@Test(priority = 4)
	public void verifyUserAbleToSeeHomeScreenDetailsWithoutInternet() {
		driverUtility.implicitlyWait(10);
		homeScreen.verifyHomeUi();
		driverUtility.threadWait(5);
		driverUtility.turnOffWifi();
		homeScreen.verifyInternetWarningMessage();
		driverUtility.threadWait(2);
		driverUtility.turnOnWifi();
		driverUtility.threadWait(5);
		homeScreen.verifyHomeUi();

	}
		
	
}
