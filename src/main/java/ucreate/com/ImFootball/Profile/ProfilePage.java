package ucreate.com.ImFootball.Profile;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ucreate.com.ImFootball.Live.LivePage;
import ucreate.com.ImFootball.Utilities.BrowserInstance;
import ucreate.com.ImFootball.Utilities.CommonMethods;



public class ProfilePage {
	protected AppiumDriver<MobileElement> driver;
	Logger logger = Logger.getLogger(ProfilePage.class.getName());
	CommonMethods commonobj;
	LivePage livepageobj;
	//locators 
	By signout =          By.xpath("//android.widget.TextView[@text ='Sign out']");
	By myaccount =        By.xpath("//android.widget.TextView[@text ='My Account']");
	By findfirend =       By.xpath("//android.widget.TextView[@text ='Find Friends']");
	By facebookfriend =   By.id("flFacebookContacts");
	By signoutyes  =      By.id("button1");
	public ProfilePage(AppiumDriver<MobileElement> driver){
		this.driver = driver ;
		commonobj = new CommonMethods(driver);}		
	public void ProfileSignout(){	
		livepageobj = new LivePage(BrowserInstance.driver);
		livepageobj.profileMenu();getClass();
	WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(myaccount));			
		commonobj.verticalscroll();
        driver.findElement(signout).click();
        logger.info("click on signout");
        driver.findElement(signoutyes).click();
	    logger.info("click on signout pop-up 'yes' option");}
}
