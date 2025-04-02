package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 * This class contains elements of "FilterByScreen" and also contains reusable methods for the elements
 * It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
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
	
	/**
	 *This method is used to select FormDate
	 */
	public void fromDate() {
		String Date="17";
		WebElement date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+Date+"']"));
		date.click();
	}
	/**
	 *This method is used to select ToDate
	 */
	public void toDate() {
		String Date="18";
		WebElement date = driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='"+Date+"']"));
		date.click();
	}
	/**
	 *This method is used to click On selectFarmerName TextField
	 */
	public void clickOnselectFarmerNameTextField() {
		try {
			selectFarmerNameTextField.click();
			System.out.println("Clicked on selectFarmerNameTextField");
		}catch (Exception e) {
			System.out.println("Not able to click on selectFarmerNameTextField");
		}
	}
	/**
	 *This method is used to click On FromDate Calender
	 */
	public void clickOnFromDateCalender() {
		try {
			fromDateCalender.click();
			System.out.println("Clicked on fromDateCalender");
		}catch (Exception e) {
			System.out.println("Not able to click on fromDateCalender");
		}
	}
	/**
	 *This method is used to click On ToDate Calender
	 */
	public void clickOnToDateCalender() {
		try {
			toDateCalender.click();
			System.out.println("Clicked on toDateCalender");
		}catch (Exception e) {
			System.out.println("Not able to click on toDateCalender");
		}
	}
	/**
	 *This method is used to click On SaveButton
	 */
	public void clickOnSaveButton() {
		try {
			String button=saveButton.getText();
			saveButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on saveButton");
		}
	}
	/**
	 *This method is used to click On CloseButton
	 */
	public void clickOnCloseButton() {
		try {
			String button=closeButton.getText();
			closeButton.click();
			System.out.println("Clicked on "+button+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on closeButton");
		}
	}
	/**
	 *This method is used to click On FarmerName
	 */
	public void clickOnFarmerName() {
		try {
			farmerName.click();
			System.out.println("Clicked on farmerName");
		}catch (Exception e) {
			System.out.println("Not able to click on farmerName");
		}
	}
	/**
	 *This method is used to click On Apply Button
	 */
	public void clickOnApplyButton() {
		try {
			applyButton.click();
			System.out.println("Clicked on applyButton");
		}catch (Exception e) {
			System.out.println("Not able to click on applyButton");
		}
	}
	/**
	 *This method is used to click On Reset Button
	 */
	public void clickOnResetButton() {
		try {
			resetButton.click();
			System.out.println("Clicked on resetButton");
		}catch (Exception e) {
			System.out.println("Not able to click on resetButton");
		}
	}
	/**
	 *This method is used to verify PageTitle
	 */
	public void verifyPageTitle() {
		try {
			assertTrue(pageTitle.isDisplayed());
			System.out.println(pageTitle.getText()+" Screen is displayed");
		}catch (Exception e) {
			System.out.println("pageTitle is not displayed");
		}
	}

}
