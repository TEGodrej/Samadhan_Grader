package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class GradingRequestTest extends BaseClass{
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading
	 */
	@Test(priority = 0)
	public void verifyUserAbleToSendRequestedTransactionIdForGrading() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
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
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering smallBunch details
	 */
	@Test(priority = 1)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringSmallBunchDetails() {
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
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
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering BouquetBunch details
	 */
	@Test(priority = 2)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringBouquetBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering LooseFruit details
	 */
	@Test(priority = 3)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringLooseFruitDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering RottenBunch details
	 */
	@Test(priority = 4)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringRottenBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering UnderRippenBunch details
	 */
	@Test(priority = 5)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringUnderRippenBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering UnrippennBunch details
	 */
	@Test(priority = 6)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringUnrippennBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering DamagedBunch details
	 */
	@Test(priority = 7)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringDamagedBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToLongStalkBunchesTextField(longStalkBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering LongStalkBunch details
	 */
	@Test(priority = 8)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringLongStalkBunchDetails() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String comment=excelUtility.readDataFromExcel("TestData", 17, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
		gradingRequestScreen.clickOnTransactionId();
		enterGradingDetailsScreen.sendkeyToSmallBunchesTextField(smallBunches);
		enterGradingDetailsScreen.sendkeyToBouquetBunchesTextField(bouquetBunches);
		enterGradingDetailsScreen.sendkeyToLooseFruitTextField(looseFruit);
		enterGradingDetailsScreen.sendkeyToRottenBunchesTextField(RottenBunches);
		enterGradingDetailsScreen.sendkeyToUnderRippenBunchesTextField(underRipeBunches);
		enterGradingDetailsScreen.sendkeyToUnrippenBunchesTextField(unripeBunches);
		enterGradingDetailsScreen.sendkeyToDamagedBunchesTextField(damagedBunches);
		gestureUtility.scrollDown();
		enterGradingDetailsScreen.sendkeyToCommentBoxTextField(comment);
		enterGradingDetailsScreen.clickOnSubmitButton();
		gestureUtility.scrollUp();
		enterGradingDetailsScreen.verifyErrorMeassge();
	}
	
	/**
	 *This method is use to verify wheather user able to send requested transactionId for grading without entering Comment
	 */
	@Test(priority = 9)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringComment() {
		String smallBunches=excelUtility.readDataFromExcel("TestData", 9, 1);
		String bouquetBunches=excelUtility.readDataFromExcel("TestData", 10, 1);
		String looseFruit=excelUtility.readDataFromExcel("TestData", 11, 1);
		String RottenBunches=excelUtility.readDataFromExcel("TestData", 12, 1);
		String underRipeBunches=excelUtility.readDataFromExcel("TestData", 13, 1);
		String unripeBunches=excelUtility.readDataFromExcel("TestData", 14, 1);
		String damagedBunches=excelUtility.readDataFromExcel("TestData", 15, 1);
		String longStalkBunches=excelUtility.readDataFromExcel("TestData", 16, 1);
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnTotalGradingRequest();
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
		enterGradingDetailsScreen.clickOnSubmitButton();
		enterGradingDetailsScreen.verifySuccessfullMessage();
		enterGradingDetailsScreen.clickOnOkayButton();

	}

}
