package Agrovet.Samadhan.Grader;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class RequestTest extends BaseClass{
	
	@Test(priority = 0)
	public void verifyUserAbleToSendRequestedTransactionIdForGrading(){
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		enterGradingDetailsScreen.verifySuccessfullMessage();
		enterGradingDetailsScreen.clickOnOkayButton();
	}
	
	@Test(priority = 1)
	public void verifyUserShouldBeAbleToRefresh() {
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnRefreshButton();
	}
	
	@Test(priority = 2)
	public void verifyUserShouldBeAbleToSortByOldestFirst() {
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnSortByButton();
		sortByScreen.clickOnOldestFirstRadioButton();
		sortByScreen.clickOnApplyButton();
		
	}
	
	@Test(priority = 3)
	public void verifyUserShouldBeAbleToSortByRecentFirst() {
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnSortByButton();
		sortByScreen.clickOnRecentFirstRadioButton();
		sortByScreen.clickOnApplyButton();
	}
	
	@Test(priority = 4)
	public void verifyUserShouldBeAbleToFilterByName() {
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnFilterByButton();
		filterByScreen.clickOnselectFarmerNameTextField();
		filterByScreen.clickOnFarmerName();
		filterByScreen.clickOnFromDateCalender();
		filterByScreen.fromDate();
		filterByScreen.clickOnSaveButton();
		filterByScreen.clickOnToDateCalender();
		filterByScreen.toDate();
		filterByScreen.clickOnSaveButton();
		filterByScreen.clickOnApplyButton();

	}
	
	@Test(priority = 5)
	public void verifyUserShouldBeAbleToResetFilterCondition() {
		driverUtility.implicitlyWait(15);
		homeScreen.clickOnRequestsTab();
		gradingRequestScreen.clickOnFilterByButton();
		filterByScreen.clickOnselectFarmerNameTextField();
		filterByScreen.clickOnFarmerName();
		filterByScreen.clickOnFromDateCalender();
		filterByScreen.fromDate();
		filterByScreen.clickOnSaveButton();
		filterByScreen.clickOnToDateCalender();
		filterByScreen.toDate();
		filterByScreen.clickOnSaveButton();
		filterByScreen.clickOnResetButton();
		filterByScreen.verifyPageTitle();
	}
	
}
