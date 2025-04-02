package objectRepositories;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

/**
 *This class contains elements of "HomeScreen" and also contains reusable methods for the elements
 *It also contains some assertions methods
 *@author DivyaPrakashAmar
 */
public class HomeScreen {
	
	AndroidDriver driver;
	
	public HomeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	private WebElement hamburgerTab;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement totalSlotBooked;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private  WebElement totalGradingRequest;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Requests']")
	private WebElement requests;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Home']")
	private WebElement homeTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='My Quiz']")
	private WebElement myQuiz;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Amateur']")
	private WebElement badgeTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Divya Prakash']")
	private WebElement userName;
	
	@FindBy(xpath = "//android.widget.TextView[@text='View All']")
	private WebElement viewAll;
	
	@FindBy(xpath = "//android.widget.TextView[@text='No Internet connection found. Please check your internet settings.']")
	private WebElement internetWarningMessage;
	
	/**
	 *This method is use to click On BadgeTab
	 */
	public void clickOnBadgeTab() {
		try {
			badgeTab.click();
			System.out.println("clicked on badgeTab");
		}catch (Exception e) {
			System.out.println("Not able to click on badge Tab");
		}
	}
	/**
	 *This method is use to verify UserName
	 */
	public void verifyUserName() {
		try {
			assertTrue(userName.isDisplayed());
			System.out.println("userName "+userName.getText() + " is displayed");
		}catch (Exception e) {
			System.out.println("userName is not displayed");
		}
	}
	/**
	 *This method is use to click On HamburgerTab
	 */
	public void clickOnHamburgerTab() {
		try {
			hamburgerTab.click();
			System.out.println("Clicked on hamburger tab");
		}catch (Exception e) {
			System.out.println("Not able to click on hamburger tab");
		}
	}
	/**
	 *This method is use to click On TotalGradingRequest
	 */
	public void clickOnTotalGradingRequest() {
		try {
			totalGradingRequest.click();
		}catch (Exception e) {
			System.out.println("Not able to click on TotalGradingRequest");
		}
	}
	/**
	 *This method is use to click On RequestsTab
	 */
	public void clickOnRequestsTab() {
		try {
			requests.click();
			System.out.println("Clicked on requests tab");
		}catch (Exception e) {
			System.out.println("Not able to click on requests tab");
		}
	}
	/**
	 *This method is use to verify PageTitle
	 */
	public void verifyPageTitle() {
		try {
			assertTrue(pageTitle.isDisplayed());
			System.out.println(pageTitle.getText()+ " is displayed");
		}catch (Exception e) {
			System.out.println("pageTitle is not displayed");
		}
	}
	/**
	 *This method is use to verify HomeUi
	 */
	public void verifyHomeUi() {
		try {
			if(homeTab.isDisplayed() && requests.isDisplayed() && myQuiz.isDisplayed()) {
				assertTrue(true);
			}else {
				assertTrue(false);
			}
		}catch (Exception e) {
			System.out.println("UI elements are not displayed");
		}
	}
	/**
	 *This method is use to verify InternetWarning Message
	 */
	public void verifyInternetWarningMessage() {
		try {
			assertTrue(internetWarningMessage.isDisplayed());
			System.out.println(internetWarningMessage.getText()+" is displayed");
		}catch (Exception e) {
			System.out.println("internetwarning Message is not displayed");
		}
	}
}
