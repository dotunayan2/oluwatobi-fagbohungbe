package coCoin.TestCase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import coCoin.TestBase.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class accountBook extends TestBase {

	@Test
	public void AccountBook() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(OR.getProperty("Tap_1_XPATH"))).click();

		// Enter Password
		driver.findElement(By.xpath(OR.getProperty("Tap_1_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_2_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_3_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_4_XPATH"))).click();
		Thread.sleep(3000);

		Thread.sleep(3000);

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("today_XPATH"))), "Unable to validate Homepage");
		Thread.sleep(3000);
	}
}
