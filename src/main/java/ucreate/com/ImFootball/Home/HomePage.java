package ucreate.com.ImFootball.Home;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ucreate.com.ImFootball.Utilities.CommonMethods;
public class HomePage {
protected AppiumDriver<MobileElement> driver;
Logger logger = Logger.getLogger(HomePage.class.getName());
CommonMethods commonobj;
String CreateAccButton = "//android.widget.Button[@resource-id='com.imfootball:id/btnCreateAccount']";
String Loginbutton = "//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']";	

//Locators
By loginbutton =                By.xpath(Loginbutton);	
By createaccountbutton =        By.xpath(CreateAccButton);

public HomePage(AppiumDriver<MobileElement> driver){
	this.driver = driver ;
	commonobj = new CommonMethods(driver);}	
public void clickOnCreateAccount() {
	commonobj.elementToBeClickableWait(CreateAccButton);
	driver.findElement(createaccountbutton).click();}
public void clickOnLoginButton() {   		   
	commonobj.elementToBeClickableWait(Loginbutton);
	driver.findElement(loginbutton).click();}
}


