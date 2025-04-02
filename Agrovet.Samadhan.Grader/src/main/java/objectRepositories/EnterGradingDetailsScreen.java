package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 * This class contains elements of "EnterGradingDetailsScreen" and also contains reusable methods for the elements
 * It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class EnterGradingDetailsScreen {
	
	AndroidDriver driver;
	public EnterGradingDetailsScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@content-desc=\"Yes, No\"]/android.widget.RadioButton[1]/android.view.ViewGroup")
	private WebElement yesButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Yes, No\"]/android.widget.RadioButton[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement noButton;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement smallBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement bouquetBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement looseFruitTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")
	private WebElement rottenBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.EditText")
	private WebElement underRippenBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.EditText")
	private WebElement unrippenBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.EditText")
	private WebElement damagedBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.EditText")
	private WebElement longStalkBunchesTextField;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.EditText")
	private WebElement commentBoxTextField;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.widget.Button[@content-desc='Okay']")
	private WebElement okayButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Your Grading Data has been successfully Submitted \"]")
	private WebElement successfullMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please enter valid numbers']")
	private WebElement errorMessage;
	
	/**
	 *This method is used to sendkeys To SmallBunches TextField
	 *@param String key
	 */
	public void sendkeyToSmallBunchesTextField(String key) {
		try {
			smallBunchesTextField.sendKeys(key);
			System.out.println("Value entered in small Bunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in small Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To BouquetBunches TextField
	 *@param String key
	 */
	public void sendkeyToBouquetBunchesTextField(String key) {
		try {
			bouquetBunchesTextField.sendKeys(key);
			System.out.println("Value entered in bouquetBunchesTextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in bouquet Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To LooseFruit TextField
	 *@param String key
	 */
	public void sendkeyToLooseFruitTextField(String key) {
		try {
			looseFruitTextField.sendKeys(key);
			System.out.println("value entered in loose Fruit TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in loose Fruit TextField");
		}
	}
	/**
	 *This method is used to sendkey To RottenBunches TextField
	 *@param String key
	 */
	public void sendkeyToRottenBunchesTextField(String key) {
		try {
			rottenBunchesTextField.sendKeys(key);
			System.out.println("Value entered in rotten Bunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in rotten Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To UnderRippenBunches TextField
	 *@param String key
	 */
	public void sendkeyToUnderRippenBunchesTextField(String key) {
		try {
			underRippenBunchesTextField.sendKeys(key);
			System.out.println("Value entered in underRippen Bunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in underRippen Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To DamagedBunches TextField
	 *@param String key
	 */
	public void sendkeyToDamagedBunchesTextField(String key) {
		try {
			damagedBunchesTextField.sendKeys(key);
			System.out.println("Value entered in damaged Bunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in damaged Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To LongStalkBunches TextField
	 *@param String key
	 */
	public void sendkeyToLongStalkBunchesTextField(String key) {
		try {
			longStalkBunchesTextField.sendKeys(key);
			System.out.println("Value entered in longStalk Bunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in longStalk Bunches TextField");
		}
	}
	/**
	 *This method is used to sendkey To CommentBox TextField
	 *@param String key
	 */
	public void sendkeyToCommentBoxTextField(String key) {
		try {
			commentBoxTextField.sendKeys(key);
			System.out.println("Value entered in commentBox TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in commentBox TextField");
		}
	}
	/**
	 *This method is used to click On SubmitButton
	 */
	public void clickOnSubmitButton() {
		try {
			String tab=submitButton.getText();
			submitButton.click();
			System.out.println("Clicked on "+tab+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on submitButton");
		}
	}
	/**
	 *This method is used to sendkeyToUnrippenBunchesTextField
	 *@param String key
	 */
	public void sendkeyToUnrippenBunchesTextField(String key) {
		try {
			unrippenBunchesTextField.sendKeys(key);
			System.out.println("Value entered in unrippenBunches TextField");
		}catch (Exception e) {
			System.out.println("Not able to enter value in unrippenBunches TextField");
		}
	}
	/**
	 *This method is used to click On OkayButton
	 */
	public void clickOnOkayButton() {
		try {
			String tab=okayButton.getText();
			okayButton.click();
			System.out.println("Clicked on "+tab+" button");
		}catch (Exception e) {
			System.out.println("Not able to click on okay button");
		}
	}
	/**
	 *This method is used to verify SuccessfullMessage
	 */
	public void verifySuccessfullMessage() {
		try {
			assertTrue(successfullMessage.isDisplayed());
			System.out.println(successfullMessage.getText() +" is displayed");
		}catch (Exception e) {
			System.out.println("successfull Message is not displayed");
		}
	}
	/**
	 *This method is used to verify  ErrorMeassge
	 */
	public void verifyErrorMeassge() {
		try {
			assertTrue(errorMessage.isDisplayed());
			System.out.println(errorMessage.getText() +" is displayed ");
		}catch (Exception e) {
			System.out.println("Error message is not displayed");
		}
	}
}
