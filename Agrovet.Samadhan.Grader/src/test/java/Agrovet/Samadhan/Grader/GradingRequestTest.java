package Agrovet.Samadhan.Grader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class GradingRequestTest extends BaseClass{

	@Test(priority = 0)
	public void verifyUserAbleToSendRequestedTransactionIdForGrading() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 1)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringSmallBunchDetails() {
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 2)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringBouquetBunchDetails() {
		String smallBunches="1";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 3)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringLooseFruitDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 4)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringRottenBunchDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 5)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringUnderRippenBunchDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 6)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringUnripnBunchDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String damagedBunches="7";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 7)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringDamagedBunchDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String longStalkBunches="5";
		String comment="ok";
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
	
	@Test(priority = 8)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringLongStalkBunchDetails() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String comment="ok";
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
	
	@Test(priority = 9)
	public void verifyUserAbleToSendRequestedTransactionIdForGradingWithoutEnteringComment() {
		String smallBunches="1";
		String bouquetBunches="2";
		String looseFruit="3";
		String RottenBunches="4";
		String underRipeBunches="5";
		String unripeBunches="6";
		String damagedBunches="7";
		String longStalkBunches="5";
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
