package coCoin.TestCase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import coCoin.TestBase.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class spendingAmount extends TestBase {

	@Test
	public void SpendingAmount() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Enter spending amount for Breakfast
		driver.findElement(By.xpath(OR.getProperty("breakfastTag_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_7_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("menuBtn_ID"))).click();

		// Enter spending amount for Home
		driver.findElement(By.xpath(OR.getProperty("homeTag_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_2_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Tap_1_XPATH"))).click();
		driver.findElement(By.id(OR.getProperty("confirmBtn_ID"))).click();
	}
}
