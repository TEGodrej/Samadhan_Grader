package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;


/**
 *@author DivyaPrakashAmar
 *This class contains all the functionality of Home Screen
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class HomeTest extends BaseClass{
    
	/**
	 *This method is use to verify wheather User is Able To Check BadgeDetails
	 */
	@Test(priority = 0)
	public void verifyUserAbleToCheckBadgeDetails() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnBadgeTab();
		homeScreen.verifyUserName();
	}
	
	/**
	 *This method is use to verify wheather HomePage is Loaded after Login
	 */
	@Test(priority = 1)
	public void verifyhomePageIsLoadedAfterLogin() {
		driverUtility.implicitlyWait(10);
		homeScreen.verifyPageTitle();
	}
	
	/**
	 *This method is use to verify UI of the home page
	 */
	@Test(priority = 3)
	public void verifyHomeUi() {
		driverUtility.implicitlyWait(10);
		homeScreen.verifyHomeUi();
	}
	
	/**
	 *This method is use to verify wheather User is able to See HomeScreen details without internet
	 */
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
