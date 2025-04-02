package Agrovet.Samadhan.Grader;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

/**
 *@author DivyaPrakashAmar
 */
@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ProfileTest extends BaseClass{
    
	/**
	 *This method is use to verify that wheather user is able to see all their personal details
	 */
	@Test(priority = 0)
	public void verifyUserAbleToSeeAllPersonalDetails() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnUserProfile();
		profileScreen.verifyUserName();
	}
	
	/**
	 *This method is use to verify that wheather user is able to upload picture from gallery
	 */
	@Test(priority = 1)
	public void verifyUserAbleToUploadPictureFromGallery() {
		
		try {
            driverUtility.implicitlyWait(10);
            homeScreen.clickOnHamburgerTab();
            driverUtility.threadWait(1);
            hamburgerScreen.clickOnUserProfile();
            driverUtility.threadWait(5);

            // Capture first screenshot
            TakesScreenshot ss = (TakesScreenshot) staticdriver;
            File source = ss.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String firstScreenshot = "Screenshot_" + timestamp + ".jpg";
            File destination = new File(firstScreenshot);

            try {
                FileUtils.copyFile(source, destination);
                System.out.println("Screenshot saved to: " + firstScreenshot);
            } catch (IOException e) {
                System.out.println("Failed to take screenshot: " + e.getMessage());
                e.printStackTrace();
            }

            profileScreen.clickOnProfilePicture();
            driverUtility.threadWait(1);
            profileScreen.clickOnGalleryButton();
            driverUtility.threadWait(4);
            profileScreen.clickOnPicture();
            driverUtility.threadWait(10);

//            // Capture second screenshot
            TakesScreenshot screenShot = (TakesScreenshot) staticdriver;
            File source1 = screenShot.getScreenshotAs(OutputType.FILE);

            String timestamp1 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String secondScreenshot = "Screenshot_" + timestamp1 + ".jpg";
            File destination2 = new File(secondScreenshot);

            try {
                FileUtils.copyFile(source1, destination2);
                System.out.println("Screenshot saved to: " + secondScreenshot);
            } catch (IOException e) {
                System.out.println("Failed to take screenshot: " + e.getMessage());
                e.printStackTrace();
            }

        } 
		finally {
            System.out.println("Test completed.");
        }
    }

    // Image comparison method
    public static boolean compareImages(String image1Path, String image2Path) {
        try {
            // Load both images
            BufferedImage image1 = ImageIO.read(new File(image1Path));
            BufferedImage image2 = ImageIO.read(new File(image2Path));

            // Check if images have the same size
            if (image1.getWidth() != image2.getWidth() || image1.getHeight() != image2.getHeight()) {
                return false; // Images have different dimensions
            }

            // Compare each pixel in the two images
            for (int x = 0; x < image1.getWidth(); x++) {
                for (int y = 0; y < image1.getHeight(); y++) {
                    if (image1.getRGB(x, y) != image2.getRGB(x, y)) {
                        return false; // Pixel difference found
                    }
                }
            }

            return true; // No differences found
        } catch (IOException e) {
            System.out.println("Error comparing images: " + e.getMessage());
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
		    
	/**
	 *This method is use to verify that wheather user is able to upload picture from camera
	 */
    @Test(priority = 2)
    public void verifyUserAbleToUploadPictureFromCamera() {
		try {
            driverUtility.implicitlyWait(10);
            homeScreen.clickOnHamburgerTab();
            driverUtility.threadWait(1);
    		hamburgerScreen.clickOnUserProfile();
            driverUtility.threadWait(5);
            BufferedImage screenshot1 = CaptureScreenshots();
            File file1 = new File("screenshot1.png");
            ImageIO.write(screenshot1, "png", file1);
            System.out.println("First screenshot saved: " + file1.getAbsolutePath());

            profileScreen.clickOnProfilePicture();
            driverUtility.threadWait(1);
            profileScreen.clickOnCameraButton();
            driverUtility.threadWait(4);
            gestureUtility.clickByAxes(356, 1330);
            gestureUtility.clickByAxes(547, 1330);
            driverUtility.threadWait(10);

            BufferedImage screenshot2 = CaptureScreenshots();
            File file2 = new File("screenshot2.png"); // Changed the file name to avoid overwriting
            ImageIO.write(screenshot2, "png", file2);
            System.out.println("Second screenshot saved: " + file2.getAbsolutePath());

            // Compare the screenshots
            boolean isIdentical = CompareImages(screenshot1, screenshot2);

            System.out.println("Are the screenshots identical? " + isIdentical);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Capture the screenshot method
    private static BufferedImage CaptureScreenshots() throws AWTException {

    	Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        return robot.createScreenCapture(screenRect);
    }

    // Compare the images method (you can replace it with your actual comparison logic)
    private static boolean CompareImages(BufferedImage img1, BufferedImage img2) throws IOException {
        // Example simple pixel-by-pixel comparison (this is just a placeholder)
        if (img1.getWidth() != img2.getWidth() || img1.getHeight() != img2.getHeight()) {
            return false; // Different dimensions, definitely not identical
        }

        for (int x = 0; x < img1.getWidth(); x++) {
            for (int y = 0; y < img1.getHeight(); y++) {
                if (img1.getRGB(x, y) != img2.getRGB(x, y)) {
                    return false; // Found a difference in pixel color
                }
            }
        }
        return true; // No differences found
    }
}
