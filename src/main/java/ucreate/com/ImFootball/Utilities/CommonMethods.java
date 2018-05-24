package ucreate.com.ImFootball.Utilities;
import java.time.Duration;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileElement;

public class CommonMethods {	
	protected AppiumDriver<MobileElement> driver;
	Logger logger = Logger.getLogger(CommonMethods.class.getName());
	public CommonMethods(AppiumDriver<MobileElement> driver) {	
	this.driver =driver;}	
public void elementToBeClickableWait(String locator) {
	WebDriverWait wait = new WebDriverWait(driver, 24);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));}
public void  presenceOfElementWait(String locator) {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
}
public void verticalscroll(){
	   Dimension dimensions = driver.manage().window().getSize();
       logger.info("Size of Window= " +dimensions);
       int scrollStart = (int) (dimensions.getHeight() * 0.5);
       logger.info("Size of scrollStart= " +scrollStart);
       int scrollEnd = (int) (dimensions.getHeight() * 0.2);
       logger.info("Size of cscrollEnd= " + scrollEnd);     
       (new TouchAction(driver))
       .press(PointOption.point(0, scrollStart))
       .moveTo(PointOption.point(0, scrollEnd))
       .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
       .release()
       .perform();
       logger.info("scroll down the page");}
public void mobileback() {
	 driver.navigate().back();} 
}