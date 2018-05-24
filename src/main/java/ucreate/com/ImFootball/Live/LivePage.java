package ucreate.com.ImFootball.Live;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import ucreate.com.ImFootball.Utilities.CommonMethods;

public class LivePage {
	protected AppiumDriver<MobileElement> driver;
	Logger logger = Logger.getLogger(LivePage.class.getName());
	CommonMethods commonobj;
//Locators 
	
By pageheading =             By.id("tvToolBarTitleCenter");
By profilemenu =             By.xpath("//android.widget.ImageView[@resource-id='com.imfootball:id/ivprofile']");
public LivePage(AppiumDriver<MobileElement> driver){
	this.driver = driver ;
	commonobj = new CommonMethods(driver);}
public String livePageHeading() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(pageheading));
   return driver.findElement(pageheading).getText();}

public void profileMenu() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(profilemenu));
	driver.findElement(profilemenu).click();}

}
