package coCoin.TestCase;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import coCoin.TestBase.TestBase;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class onBoardingScreen extends TestBase {

	@SuppressWarnings("rawtypes")
	@Test(priority = 1)
	public void SanityTest() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getSize().getHeight());

		int screenWidth = driver.manage().window().getSize().getWidth();
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Swipe Left
		int startx = screenWidth * 8 / 9;
		int endx = screenWidth / 9;
		int starty = screenWidth / 2;
		int endy = screenWidth / 2;

		TouchAction action1 = new TouchAction(driver);
		action1.press(PointOption.point(startx, Anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(endx, Anchor)).release().perform();

		TouchAction action2 = new TouchAction(driver);
		action2.press(PointOption.point(startx, Anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(endx, Anchor)).release().perform();

		TouchAction action3 = new TouchAction(driver);
		action3.press(PointOption.point(startx, Anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(endx, Anchor)).release().perform();

		TouchAction action4 = new TouchAction(driver);
		action4.press(PointOption.point(startx, Anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(endx, Anchor)).release().perform();
		
		
		//Enter Password
		driver.findElement(By.xpath(OR.getProperty("Tap_1_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_2_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_3_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_4_XPATH"))).click();
		Thread.sleep(3000);
		
		//Confirm Password
		driver.findElement(By.xpath(OR.getProperty("Tap_1_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_2_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_3_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_4_XPATH"))).click();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("coCoin_XPATH"))), "Unable to validate Homepage");
		Thread.sleep(3000);
	}

}
