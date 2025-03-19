package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FilterByScreen {
	
	AndroidDriver driver;
	public FilterByScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//android.widget.TextView[@text='Select Farmer Name'])[2]")
	private WebElement selectFarmerNameTextField;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='From Date']/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement fromDateCalender;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"To Date\"]/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	private WebElement toDateCalender;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Close']")
	private WebElement closeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Divya Prakash Amar']")
	private WebElement farmerName;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Apply']")
	private WebElement applyButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath = "//android.view.View[@text='Grading Requests']")
	private WebElement pageTitle;
	
	public void fromDate() {
		String Date="17";
		WebElement date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+Date+"']"));
		date.click();
	}
	
	public void toDate() {
		String Date="18";
		WebElement date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+Date+"']"));
		date.click();
	}
	
	public void clickOnselectFarmerNameTextField() {
		try {
			selectFarmerNameTextField.click();
			System.out.println("Clicked on selectFarmerNameTextField");
		}catch (Exception e) {
			System.out.println("Not able to click on selectFarmerNameTextField");
		}
	}
	
	public void clickOnFromDateCalender() {
		try {
			fromDateCalender.click();
			System.out.println("Clicked on fromDateCalender");
		}catch (Exception e) {
			System.out.println("Not able to click on fromDateCalender");
		}
	}
	
	public void clickOnToDateCalender() {
		try {
			toDateCalender.click();
			System.out.println("Clicked on toDateCalender");
		}catch (Exception e) {
			System.out.println("Not able to click on toDateCalender");
		}
	}
	
	public void clickOnSaveButton() {
		try {
			saveButton.click();
			System.out.println("Clicked on saveButton");
		}catch (Exception e) {
			System.out.println("Not able to click on saveButton");
		}
	}
	
	public void clickOnCloseButton() {
		try {
			closeButton.click();
			System.out.println("Clicked on closeButton");
		}catch (Exception e) {
			System.out.println("Not able to click on closeButton");
		}
	}
	
	public void clickOnFarmerName() {
		try {
			farmerName.click();
			System.out.println("Clicked on farmerName");
		}catch (Exception e) {
			System.out.println("Not able to click on farmerName");
		}
	}
	
	public void clickOnApplyButton() {
		try {
			applyButton.click();
			System.out.println("Clicked on applyButton");
		}catch (Exception e) {
			System.out.println("Not able to click on applyButton");
		}
	}
	
	public void clickOnResetButton() {
		try {
			resetButton.click();
			System.out.println("Clicked on resetButton");
		}catch (Exception e) {
			System.out.println("Not able to click on resetButton");
		}
	}
	
	public void verifyPageTitle() {
		try {
			assertTrue(pageTitle.isDisplayed());
			System.out.println(pageTitle.getText()+" Screen is displayed");
		}catch (Exception e) {
			System.out.println("pageTitle is not displayed");
		}
	}

}
