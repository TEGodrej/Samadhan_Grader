package objectRepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


/**
 *This class contains elements of "SortByScreen" and also contains reusable methods for the elements
 *It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class SortByScreen {
	
	AndroidDriver driver;
	public SortByScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@content-desc='Recent First, Oldest First']/android.widget.RadioButton[2]/android.view.ViewGroup")
	private WebElement oldestFirstRadioButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Recent First, Oldest First']/android.widget.RadioButton[1]/android.view.ViewGroup")
	private WebElement recentFirstRadioButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Apply']")
	private WebElement applyButton;
	
	/**
	 *This method is use to click on OldestFirst Radio Button
	 */
	public void clickOnOldestFirstRadioButton() {
		try {
			oldestFirstRadioButton.click();
			System.out.println("Clicked on oldest first RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to click on oldest first RadioButton");
		}
	}
	
	/**
	 *This method is use to click on RecentFirst Radio Button
	 */
	public void clickOnRecentFirstRadioButton() {
		try {
			recentFirstRadioButton.click();
			System.out.println("Clicked on recent first RadioButton");
		}catch (Exception e) {
			System.out.println("Not able to click on recent first RadioButton");
		}
	}
	
	/**
	 *This method is use to click on CancelButton
	 */
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on cancel button");
		}catch (Exception e) {
			System.out.println("Not able to click on cancel button");
		}
	}
	
	/**
	 *This method is use to click on ApplyButton
	 */
	public void clickOnApplyButton() {
		try {
			applyButton.click();
			System.out.println("Clicked on apply button");
		}catch (Exception e) {
			System.out.println("Not able to click on apply button");
		}
	}
}
