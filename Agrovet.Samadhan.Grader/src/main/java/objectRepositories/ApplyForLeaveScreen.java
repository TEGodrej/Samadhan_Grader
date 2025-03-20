package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ApplyForLeaveScreen extends BaseClass{
	
	AndroidDriver driver;
	
	public ApplyForLeaveScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Select an option']")
	private WebElement selectLeaveTypeDropDown;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"From Date\"]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement fromDateTextField;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"To Date\"]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement toDateTextField;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Close']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.EditText")
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
	
	public void Todate() {
		try {
			String date=excelUtility.readDataFromExcel("TestData", 7, 1);
			WebElement Date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+date+"']"));
			String date1=Date.getText();
			Date.click();
//			System.out.println("clicked on Date");
			System.out.println("clicked on "+date1);
		}catch (Exception e) {
			System.out.println("Not able to click on date");
		}
	}
	
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
	public void clickOnSelectLeaveTypeDropDown() {
		try {
			selectLeaveTypeDropDown.click();
			System.out.println("Clicked on Select Leave Type DropDown");
		}catch (Exception e) {
			System.out.println("Not able to click on selectLeave Type DropDown");
		}
	}
	public void clickOnEmergencyTab() {
		try {
			String tab=emergencyTab.getText();
			emergencyTab.click();
			System.out.println("Click on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on emergency tab");
		}
	}
	public void clickOnFromDateTextField() {
		try {
			fromDateTextField.click();
			System.out.println("Clicked on from Date");
		}catch (Exception e) {
			System.out.println("Not able to click on from Date");
		}
	}
	public void clickOnSaveButton() {
		try {
			String button=saveButton.getText();
			saveButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on save button");
		}
	}
	public void clickOnToDateTextField() {
		try {
			toDateTextField.click();
			System.out.println("Clicked on To Date");
		}catch (Exception e) {
			System.out.println("Not able to click on ToDate");
		}
	}
	public void sendkeyToMessageTextField(String key) {
		try {
			MessageTextField.sendKeys(key);
			System.out.println("Entered value in MessageTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in MessageTextField");
		}
	}
	public void clickOnApplyButton() {
		try {
			String button=applyButton.getText();
			applyButton.click();
			System.out.println("Clicked on "+button+" Button");
		}catch (Exception e) {
			System.out.println("Not able to click on Apply button");
		}
	}
	public void verifyWarningMessage() {
		try {
			assertTrue(warningMessage.isDisplayed());
			System.out.println(warningMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("warning message is not displayed");
		}
	}
	
	public void clickOnSickTab() {
		try {
			String tab=sickTab.getText();
			sickTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on sickTab");
		}
	}
	public void clickOnPlannedLeaveTab() {
		try {
			String tab=plannedLeaveTab.getText();
			plannedLeaveTab.click();
			System.out.println("Clicked on "+tab+" tab");
		}catch (Exception e) {
			System.out.println("Not able to click on plannedLeave Tab");
		}
	}
	
	public void verifySelectLeaveTypeWarningMessage() {
		try {
			assertTrue(selectLeaveTypeWarningMessage.isDisplayed());
			System.out.println(selectLeaveTypeWarningMessage.getText() +" Is displayed");
		}catch (Exception e) {
			System.out.println("selectLeaveType Warning Message is not displayed");
		}
	}
	
	public void verifyDateWarningMessage() {
		try {
			assertTrue(dateWarningMessage.isDisplayed());
			System.out.println(dateWarningMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("date warning message is not displayed");
		}
	}
	
	public void verifyMessageWarningMessage() {
		try {
			assertTrue(messageWarningMessage.isDisplayed());
			System.out.println(messageWarningMessage.getText()+ " is displayed");
		}catch (Exception e) {
			System.out.println("message warning message is not displayed");
		}
	}
}
