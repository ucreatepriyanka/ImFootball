package ucreate.com.ImFootball.Login;

import java.io.IOException;
import java.util.logging.Logger;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import ucreate.com.ImFootball.CreateAccount.WhoDoYouSupport;
import ucreate.com.ImFootball.Home.HomePage;
import ucreate.com.ImFootball.Live.LivePage;
import ucreate.com.ImFootball.Profile.ProfilePage;
import ucreate.com.ImFootball.Utilities.BrowserInstance;
import ucreate.com.ImFootball.Utilities.ReadTestData;

public class LoginTest {
	LoginPage loginpageobj;
	HomePage homepageobj;
	LivePage livepageobj;
	ProfilePage profilepageobj;
	WhoDoYouSupport whodoyousupportobj;
	Logger logger = Logger.getLogger(LoginTest.class.getName());
	//TestCase1
	@Test(description="Click on Login button")
	public void clickOnLoginButton() throws IOException, ParseException{
		homepageobj = new HomePage(BrowserInstance.driver);	
		homepageobj.clickOnLoginButton();
		logger.info("Clicked on Login Button");}	
	
	//TestCase2
	@Test(description="Login with invalid details - Email : 'Characters'")	
	public void loginInvalidDeatils1() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.Loginform(username[1],password[1]);
		logger.info("Enter Username :"+username[1]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessage(),validationmessage[0]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is :"+ validationmessage[0]);}
	
	//TestCase3
	@Test(description="Login with invalid details - Email: 'Special Charcaters")	
	public void loginInvalidDetails2() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[2],password[1]);
		logger.info("Enter Username :"+username[2]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessage(),validationmessage[0]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is :"+ validationmessage[0]);}
	//TestCase4
	@Test(description ="Login with invalid details - Email : 'Numbers'")
	public void loginInvalidDetails3() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[3],password[1]);
		logger.info("Enter Username :"+username[3]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessage(),validationmessage[0]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[0]);}
	//TestCase5
	@Test(description ="Login with invalid details - Email : 'Invalid Format of Email ID'")
	public void loginInvalidDetails4() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[4],password[1]);
		logger.info("Enter Username :"+username[4]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	//TestCase6
	@Test(description ="Login with invalid details - Email : 'Combimation of Numbers ,Special charcaters and chracters")
	public void loginInvalidDetails5() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[5],password[1]);
		logger.info("Enter Username :"+username[5]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessage(),validationmessage[0]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[0]);}
	//TestCase7
	@Test(description ="Login with invalid details - Email : 'Invalid email Id '")
	public void loginInvalidDetails6() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[6],password[1]);
		logger.info("Enter Username :"+username[6]);
		logger.info("Enter Password :"+password[1]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	   	
	//TestCase8
	@Test(description ="Login with invalid details - Password : 'Adding captial letters only'")
	public void loginInvalidDetails7() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[2]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[2]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	
	//TestCase9
	@Test(description ="Login with invalid details - Password : 'Adding Numbers only'")
	public void loginInvalidDetails8() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[3]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[3]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	

	//TestCase10
	@Test(description ="Login with invalid details - Password : 'Adding combination of small letters, number and sepcial characters'")
	public void loginInvalidDetails9() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[4]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[4]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	
	//TestCase11
	@Test(description ="Login with invalid details - Password : 'Adding special characters only'")
	public void loginInvalidDetails10() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[5]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[5]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	
	//TestCase12
	@Test(description ="Login with invalid details - Password : 'Adding password less than  8 characters and without numbers")
	public void loginInvalidDetails11() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] validationmessage = ReadTestData.getkeyvalues("Validationmessage","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[6]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[6]);
		Assert.assertEquals(loginpageobj.getValidationMessageOnPassword(),validationmessage[1]);
		logger.info("Validation message should be displayed on Username field ");
    	logger.info("Validation message is : "+ validationmessage[1]);}
	
	//TestCase13 
	@Test(description="Login with valid details - Email : 'Valid Details'")	
	public void loginValidDetails() throws IOException, ParseException {
		loginpageobj =new LoginPage(BrowserInstance.driver);
		String[] username = ReadTestData.getkeyvalues("UserName", "login");
		String[] password  = ReadTestData.getkeyvalues("Password", "login");
		String[] checklivepageheading = ReadTestData.getkeyvalues("Assertions","login");
		loginpageobj.clearusername();
	    loginpageobj.mobileback();
		loginpageobj.clearpassword();
	    loginpageobj.mobileback();
		loginpageobj.Loginform(username[0],password[0]);
		logger.info("Enter Username :"+username[0]);
		logger.info("Enter Password :"+password[0]);
		livepageobj =new LivePage(BrowserInstance.driver);
		Assert.assertEquals(livepageobj.livePageHeading(),checklivepageheading[0]);
		logger.info("After Login page redirected to Live page");
		logger.info("Page Title is :"+ checklivepageheading[0]);}
	
	//TestCase14
	@Test(description ="signout")
	public void Signout() {
	profilepageobj = new ProfilePage(BrowserInstance.driver);
	profilepageobj.ProfileSignout();
	logger.info("After Signout redirected to Home page");}	
	
 //TestCase15
	@Test(description="Tab on 'Login with Facebook' button")
	public void tabOnLoginwithFacebook() {
		homepageobj = new HomePage(BrowserInstance.driver);	
		homepageobj.clickOnLoginButton();
		logger.info("Clicked on Login Button");	
		loginpageobj = new LoginPage(BrowserInstance.driver);
		loginpageobj.tabOnloginWithFB();}
	
	//TestCase16
	@Test(description="Adding FB Login creadentials")
	public void loginwithFB() throws IOException, ParseException {
		loginpageobj.AddcredentialsInFB();
		profilepageobj = new ProfilePage(BrowserInstance.driver);
		profilepageobj.ProfileSignout();
		logger.info("After Signout redirected to Home page");}  
	
    //TestCase17
	@Test(description="tab on create an account button")
	public void createAnAccount() throws IOException, ParseException {
		homepageobj = new HomePage(BrowserInstance.driver);	
		homepageobj.clickOnLoginButton();
		loginpageobj= new LoginPage(BrowserInstance.driver);
		loginpageobj.tabOnCreateAcc();
		whodoyousupportobj =  new WhoDoYouSupport(BrowserInstance.driver);
		String[] validate  = ReadTestData.getkeyvalues("Assertions", "login");
		Assert.assertEquals(whodoyousupportobj.getPageTitle(), validate[2]);
		}

}



