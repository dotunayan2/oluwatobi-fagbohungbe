package coCoin.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	protected static final int Anchor = 0;
	Dimension size;
	protected AndroidDriver<AndroidElement> driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;

	@SuppressWarnings("rawtypes")
	@BeforeClass
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException, InterruptedException {

		File appDir = new File("src");
		File app = new File(appDir, "CoCoin.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;

	}
	
public boolean isElementPresent(By by) {
		
		try {
			
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e) {
			
			return false;
			
		}
		
	}
	

	

	@AfterTest
	public void teardownTests() {
		System.out.println("Test Complete.");
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}
}
