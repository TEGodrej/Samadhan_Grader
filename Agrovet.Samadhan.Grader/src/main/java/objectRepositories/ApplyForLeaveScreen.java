package objectRepositories;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 * This class contains elements of "ApplyForLeaveScreen" and also contains reusable methods for the elements
 * It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class ApplyForLeaveScreen extends BaseClass{
	
	AndroidDriver driver;
	
	public ApplyForLeaveScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Select an option']")
	private WebElement selectLeaveTypeDropDown;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='From Date']/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement fromDateTextField;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='To Date']/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement toDateTextField;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Close']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement MessageTextField;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Emergency']")
	private WebElement emergencyTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sick']")
	private WebElement sickTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Planned Leave']")
	private WebElement plannedLeaveTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Partial Leave']")
	private WebElement partialLeave;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add Attachments']")
	private WebElement addAttachmentTab;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Apply']")
	private WebElement applyButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Unable to apply for leave: Approval authority not assigned. Please contact your manager.']")
	private WebElement warningMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please select leave type']")
	private WebElement selectLeaveTypeWarningMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please select From date to To date']")
	private WebElement dateWarningMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please enter a message']")
	private WebElement messageWarningMessage;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Date']/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement partialLeaveDate;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='From Time']/android.view.ViewGroup/android.widget.EditText")
	private WebElement partialLeaveFromTime;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='To Time']/android.view.ViewGroup/android.widget.EditText")
	private WebElement partialLeaveToDate;
	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	private WebElement TimeOkButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\\\"android:id/content\\\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement partialLeaveMessageTextBox;
	
	/**
	 *This method is use to click on date
	 */
	public void clickOnDate() {
		try {
			int date=25;
			WebElement Date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+date+"']"));
			System.out.println("Clicked on date");
			Date.click();
		}catch (Exception e) {
			System.out.println("Not able to click on Date");
		}
	}
	/**
	 *This method is use to click on partialLeave FormHour Time
	 */
	public void partialLeaveFormHourTime() {
		try {
		    int hourTime=17;
			WebElement time=driver.findElement(AppiumBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+hourTime+"']"));
			time.click();
			System.out.println("Clicked on From Hour Time");
		}catch (Exception e) {
			System.out.println("Not able to click on From Hour Time");
		}
	}
	/**
	 *This method is use to click on partialLeave ToHour Time
	 */
	public void partialLeaveToHourTime() {
		try {
		    int hourTime=18;
			WebElement time=driver.findElement(AppiumBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+hourTime+"']"));
			time.click();
			System.out.println("Clicked on From Hour Time");
		}catch (Exception e) {
			System.out.println("Not able to click on From Hour Time");
		}
	}
	
	/**
	 *This method is use to click on partialLeave FromMinute Time
	 */
	
	public void partialLeaveFromMinuteTime() {
		try {
			int minuteTime=10;
			WebElement time=driver.findElement(AppiumBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+minuteTime+"']"));
			time.click();
			System.out.println("Clicked on From Munite Time");
		}catch (Exception e) {
			System.out.println("Not able to click on From Minute Time");
		}
	}
	/**
	 *This method is use to click on partialLeave ToMinute Time
	 */
	public void partialLeaveToMinuteTime() {
		try {
		    int minuteTime=10;
			WebElement time=driver.findElement(AppiumBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+minuteTime+"']"));
			time.click();
			System.out.println("Clicked on From Hour Time");
		}catch (Exception e) {
			System.out.println("Not able to click on From Hour Time");
		}
	}
	/**
	 *This method is use to select month
	 */
	public void Month() {
		try {
			String Month="March";
			WebElement month = driver.findElement(AppiumBy.xpath("//android.view.View[@text='"+Month+"']"));
			month.click();
			System.out.println("clicked on " + month.getText());
		}catch (Exception e) {
			System.out.println("Not able to click on Month");
		}
	}
	/**
	 *This method is use to select Todate and it is getting data from excel file
	 */
	public void Todate() {
		try {
			String date=excelUtility.readDataFromExcel("TestData", 7, 1);
			WebElement Date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+date+"']"));
			String date1=Date.getText();
			Date.click();
			System.out.println("clicked on "+date1);
		}catch (Exception e) {
			System.out.println("Not able to click on date");
		}
	}
	/**
	 *This method is use to select Fromdate and it is getting data from excel file
	 */
	public void Fromdate() {
		try {
			String date=excelUtility.readDataFromExcel("TestData", 6, 1);
			WebElement Date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+date+"']"));
			String date1=Date.getText();
			Date.click();
			System.out.println("clicked on "+date1);
//			System.out.println("clicked on Date");
		}catch (Exception e) {
			System.out.println("Not able to click on date");
		}
	}
	
	/**
	 *This method is use to click On SelectLeaveType DropDown
	 */
	public void clickOnSelectLeaveTypeDropDown() {
		try {
			selectLeaveTypeDropDown.click();
			System.out.println("Clicked on Select Leave Type DropDown");
		}catch (Exception e) {
			System.out.println("Not able to click on selectLeave Type DropDown");
		}
	}
	
	/**
	 *This method is use to click On EmergencyTab
	 */
	public void clickOnEmergencyTab() {
		try {
			String tab=emergencyTab.getText();
			emergencyTab.click();
			System.out.println("Click on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on emergency tab");
		}
	}
	/**
	 *This method is use to click On FromDate TextField
	 */
	public void clickOnFromDateTextField() {
		try {
			fromDateTextField.click();
			System.out.println("Clicked on from Date");
		}catch (Exception e) {
			System.out.println("Not able to click on from Date");
		}
	}
	
	/**
	 *This method is use to click On SaveButton
	 */
	public void clickOnSaveButton() {
		try {
			String button=saveButton.getText();
			saveButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on save button");
		}
	}
	
	/**
	 *This method is use to click On ToDate TextField
	 */
	public void clickOnToDateTextField() {
		try {
			toDateTextField.click();
			System.out.println("Clicked on To Date");
		}catch (Exception e) {
			System.out.println("Not able to click on ToDate");
		}
	}
	/**
	 *This method is use to sendkey To Message TextField
	 *@param String key
	 */
	public void sendkeyToMessageTextField(String key) {
		try {
			MessageTextField.click();
			MessageTextField.sendKeys(key);
			System.out.println("Entered value in MessageTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in MessageTextField");
		}
	}
	/**
	 *This method is use to clickOnApplyButton
	 */
	public void clickOnApplyButton() {
		try {
			String button=applyButton.getText();
			applyButton.click();
			System.out.println("Clicked on "+button+" Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Apply button");
		}
	}
	/**
	 *This method is use to verify WarningMessage
	 */
	public void verifyWarningMessage() {
		try {
			assertTrue(warningMessage.isDisplayed());
			System.out.println(warningMessage.getText()+" is displayed");
		}catch (Exception e) {
			assertFalse(!warningMessage.isDisplayed(), "warning message is not displayed");
//			System.out.println("warning message is not displayed");
		}
	}
	/**
	 *This method is use to click On SickTab
	 */
	public void clickOnSickTab() {
		try {
			String tab=sickTab.getText();
			sickTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on sickTab");
		}
	}
	/**
	 *This method is use to click On PlannedLeave Tab
	 */
	public void clickOnPlannedLeaveTab() {
		try {
			String tab=plannedLeaveTab.getText();
			plannedLeaveTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on plannedLeave Tab");
		}
	}
	/**
	 *This method is use to verify SelectLeaveType Warning Message
	 */
	public void verifySelectLeaveTypeWarningMessage() {
		try {
			assertTrue(selectLeaveTypeWarningMessage.isDisplayed());
			System.out.println(selectLeaveTypeWarningMessage.getText() +" Is displayed");
		}catch (Exception e) {
			System.out.println("selectLeaveType Warning Message is not displayed");
		}
	}
	/**
	 *This method is use to verify Date Warning Message
	 */
	public void verifyDateWarningMessage() {
		try {
			assertTrue(dateWarningMessage.isDisplayed());
			System.out.println(dateWarningMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("date warning message is not displayed");
		}
	}
	/**
	 *This method is use to verify Date Warning Message
	 */
	public void verifyMessageWarningMessage() {
		try {
			assertTrue(messageWarningMessage.isDisplayed());
			System.out.println(messageWarningMessage.getText()+ " is displayed");
		}catch (Exception e) {
			System.out.println("message warning message is not displayed");
		}
	}
	
	/**
	 *This method is use to click On PartialLeave Date
	 */
	public void clickOnPartialLeaveDate() {
		try {
			partialLeaveDate.click();
			System.out.println("Clicked on Date");
		}catch (Exception e) {
			System.out.println("Not able to click on PartialLeave Date");
		}
	}
	
	/**
	 *This method is use to click On PartialLeave
	 */
	public void clickOnPartialLeave() {
		try {
			partialLeave.click();
			System.out.println("Clicked on Partial Leave");
		}catch (Exception e) {
			System.out.println("Not able to click on Partial Leave");
		}
	}
	/**
	 *This method is use to click On PartialLeave FromTime
	 */
	public void clickOnPartialLeaveFromTime() {
		try {
			partialLeaveFromTime.click();
			System.out.println("Clicked on PartialLeave From Time");
		}catch (Exception e) {
			System.out.println("Not able to click on PartialLeave From Time");
		}
	}
	/**
	 *This method is use to click On TimeOk Button
	 */
	public void clickOnTimeOkButton() {
		try {
			TimeOkButton.click();
			System.out.println("Click on Ok Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Ok Button");
		}
	}
	/**
	 *This method is use to click On PartialLeave ToTime
	 */
	public void clickOnPartialLeaveToTime() {
		try {
			partialLeaveToDate.click();
			System.out.println("Clicked on PartialLeave To Date");
		}catch (Exception e) {
			System.out.println("Not able to click on PartialLeave ToDate");
		}
	}
	/**
	 *This method is use to Sendkeys To PartialLeave Message TextBox
	 */
	public void SendkeyToPartialLeaveMessageTextBox(String key) {
		try {
			partialLeaveMessageTextBox.click();
			partialLeaveMessageTextBox.sendKeys(key);
			System.out.println("Entered message into the message textfield");
		}catch (Exception e) {
			System.out.println("Not able to enter message");
		}
	}
}
