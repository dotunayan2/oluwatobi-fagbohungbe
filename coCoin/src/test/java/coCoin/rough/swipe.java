package coCoin.rough;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import coCoin.TestBase.TestBase;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class swipe extends TestBase{
	
	Dimension size;

	@Test
	 public void mTouchAction() throws InterruptedException, MalformedURLException {
	  
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*Thread.sleep(5000);
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println(driver.manage().window().getSize().getHeight());
		
		int screenWidth = driver.manage().window().getSize().getWidth();
		int screenHeight = driver.manage().window().getSize().getHeight();
		
		//Swipe Right
		int startx = screenWidth * 8/9;
		int endx = screenWidth/9;
		
		//Create object to "MultiTouchAction" class '
		 
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		
		//Create First action Object to "TouchAction" class'
		 
		TouchAction action1 = new TouchAction(driver);
		 
		 
		 
		//'Create Second action Object to "TouchAction" class'
		 
		TouchAction action2 = new TouchAction(driver);
		
		action1.press(PointOption.point(startx, Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(endx, Anchor))
		.release().perform();
		
		action2.press(PointOption.point(startx, Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(endx, Anchor))
		.release().perform();
	*/}
	
}