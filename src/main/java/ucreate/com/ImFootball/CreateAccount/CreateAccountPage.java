package ucreate.com.ImFootball.CreateAccount;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ucreate.com.ImFootball.Utilities.CommonMethods;

public class CreateAccountPage {
	protected AppiumDriver<MobileElement> driver;	
	CommonMethods commonobj;
	String CreateAccButton = "//android.widget.Button[@resource-id='com.imfootball:id/btnCreateAccount']";
    //locators
	By createAccountHeading =     By.xpath(CreateAccButton);
	public CreateAccountPage(AppiumDriver<MobileElement> driver){
		this.driver = driver ;
		commonobj = new CommonMethods(driver);}
}
