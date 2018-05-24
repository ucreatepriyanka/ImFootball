package ucreate.com.ImFootball.Login;

import java.io.IOException;
import java.util.logging.Logger;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ucreate.com.ImFootball.Home.HomePage;
import ucreate.com.ImFootball.Utilities.CommonMethods;
import ucreate.com.ImFootball.Utilities.ReadTestData;

public class LoginPage {
	protected AppiumDriver<MobileElement> driver;
	Logger logger = Logger.getLogger(HomePage.class.getName());
	CommonMethods commonobj;
	
	String createanaccount = "//android.widget.TextView[@resource-id='com.imfootball:id/tvCreateAccount']";
	//locators  
	By username =            By.id("edusername");
	By emailplaceholder=     By.xpath("//TextInputLayout[@text='Email']");
	By userpassword =        By.id("edpassword");
	By createacc=            By.id("tvCreateAccount");
//	By login =               By.id("btnLogin");
	By login =               By.xpath("//android.widget.Button[@resource-id='com.imfootball:id/btnLogin']");
	By errormessage =        By.id("textinput_error");
	By imageview =           By.className("android.widget.ImageView");
	By errormessagepassword= By.xpath("//android.widget.TextView[@text='Your password must be a minimum of 8 characters and contain at least one capital letter and number.']");
	By Loginwithfb=          By.id("llFBClick");
	//Through browser
	By loginfbemail=         By.xpath("//android.widget.EditText[@resource-id='m_login_email']"); 
	By loginfbpass=          By.xpath("//android.widget.EditText[@resource-id='m_login_password']");
	By LoginFBButton=        By.xpath("//android.widget.Button[@resource-id='u_0_5']");
	By contasuser=           By.xpath("//android.widget.Button[@resource-id='u_0_1']");
	
	//Through Mobile App
//	By fbemail=              By.xpath("//android.widget.EditText[@index = '6']");
//	By fbpassword=              By.xpath("//android.widget.EditText[@index = '7']");
	//@AndroidFindBy(id ="//android.widget.Button[@resource-id='com.imfootball:id/btnCreateAccount']") 
	// public MobileElement test;
	public LoginPage(AppiumDriver<MobileElement> driver){
		this.driver = driver ;
		commonobj = new CommonMethods(driver);}	
	public String getEmailPlaceHolder() {
		return driver.findElement(emailplaceholder).getText();}
	//PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS),this); 
	public void userName(String name) {	
        driver.findElement(username).sendKeys(name);}
	public void password(String password) {	
	    driver.findElement(userpassword).sendKeys(password);}
	public void loginIn() {
		driver.findElement(login).click();}
	public void mobileback() {
		 driver.navigate().back();}
	public void clearusername() {
		driver.findElement(username).clear();}
	public void clearpassword() {
		driver.findElement(userpassword).clear();}
	public void Loginform(String name, String password) {
    this.userName(name);
    this.password(password);
    this.loginIn();}	
	public String getLoginButtonText() {
	  return driver.findElement(login).getText();}	
	public String getValidationMessage() {
	  return driver.findElement(errormessage).getText();}	
	public String getValidationMessageOnPassword() {
	  return driver.findElement(errormessagepassword).getText();}
	public void tabOnloginWithFB() {
	 driver.findElement(Loginwithfb).click();
	}
  public void AddcredentialsInFB() throws IOException, ParseException {
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.presenceOfElementLocated(loginfbemail));
	   driver.findElement(loginfbemail).clear();
	   driver.findElement(loginfbpass).clear();
	   String[] validdetails = ReadTestData.getkeyvalues("ValidCredentials", "login");
	   driver.findElement(loginfbemail).sendKeys(validdetails[0]);
	   driver.findElement(loginfbpass).sendKeys(validdetails[1]);
	   mobileback();
	   driver.findElement(LoginFBButton).click();
	   wait.until(ExpectedConditions.presenceOfElementLocated(contasuser));  
	   driver.findElement(contasuser).click();
	   }    

public void tabOnCreateAcc() {
	commonobj.presenceOfElementWait(createanaccount);
	 driver.findElement(createacc).click();}

}


















