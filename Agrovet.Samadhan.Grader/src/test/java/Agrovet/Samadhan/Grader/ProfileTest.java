package Agrovet.Samadhan.Grader;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

@Listeners(GenericUtilities.ExtentReportsListner.class)
public class ProfileTest extends BaseClass{

	@Test(priority = 0)
	public void verifyUserAbleToSeeAllPersonalDetails() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnHamburgerTab();
		hamburgerScreen.clickOnUserProfile();
		profileScreen.verifyUserName();
	}
	
	@Test(priority = 1)
	public void verifyUserAbleToUploadPictureFromGallery() {
		
		try {
            driverUtility.implicitlyWait(10);
            homeScreen.clickOnHamburgerTab();
            driverUtility.threadWait(1);
    		hamburgerScreen.clickOnUserProfile();
            driverUtility.threadWait(5);
            BufferedImage screenshot1 = CaptureScreenshot();
            File file1 = new File("screenshot1.png");
            ImageIO.write(screenshot1, "png", file1);
            System.out.println("First screenshot saved: " + file1.getAbsolutePath());

            profileScreen.clickOnProfilePicture();
            driverUtility.threadWait(1);
            profileScreen.clickOnGalleryButton();
            driverUtility.threadWait(4);
            profileScreen.clickOnPicture();
            driverUtility.threadWait(10);

            BufferedImage screenshot2 = CaptureScreenshot();
            File file2 = new File("screenshot2.png"); // Changed the file name to avoid overwriting
            ImageIO.write(screenshot2, "png", file2);
            System.out.println("Second screenshot saved: " + file2.getAbsolutePath());

            // Compare the screenshots
            boolean isIdentical = ComparesImages(screenshot1, screenshot2);

            System.out.println("Are the screenshots identical? " + isIdentical);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Capture the screenshot method
    private static BufferedImage CaptureScreenshot() throws AWTException {
        Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        return robot.createScreenCapture(screenRect);
    }

    // Compare the images method (you can replace it with your actual comparison logic)
    private static boolean ComparesImages(BufferedImage img1, BufferedImage img2) throws IOException {
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
    
    
    @Test(priority = 2)
    public void verifyUserAbleToUploadPictureFromCamera() {
		try {
            driverUtility.implicitlyWait(10);
            homeScreen.clickOnHamburgerTab();
            driverUtility.threadWait(1);
    		hamburgerScreen.clickOnUserProfile();
            driverUtility.threadWait(5);
            BufferedImage screenshot1 = CaptureScreenshot();
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
