package ucreate.com.ImFootball.Home;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import ucreate.com.ImFootball.CreateAccount.WhoDoYouSupport;
import ucreate.com.ImFootball.Login.LoginPage;
import ucreate.com.ImFootball.Utilities.BrowserInstance;
import ucreate.com.ImFootball.Utilities.ReadTestData;

public class HomeTest {	
HomePage homepageobj ;
WhoDoYouSupport whodoyousupportobj;
LoginPage loginobj;

Logger logger = Logger.getLogger(HomeTest.class.getName());
@Test(description ="Tab on Login button")
public void tabOnLoginButton() throws IOException, ParseException {
	homepageobj = new HomePage(BrowserInstance.driver);
	homepageobj.clickOnLoginButton();
	String[] assertion = ReadTestData.getkeyvalues("AssertionMessage", "home");
	loginobj = new LoginPage(BrowserInstance.driver);
	logger.info(loginobj.getEmailPlaceHolder());
	assertEquals(loginobj.getEmailPlaceHolder(), assertion[1]);
	logger.info("successfully redirected to login page"); 
	}

@Test(description = "Tab on Create Account button")
public void tabCreateAccountButton() throws IOException, ParseException{
	homepageobj = new HomePage(BrowserInstance.driver);
	homepageobj.clickOnCreateAccount();
	String[] assertion = ReadTestData.getkeyvalues("AssertionMessage", "home");
	whodoyousupportobj = new WhoDoYouSupport(BrowserInstance.driver);
	assertEquals(whodoyousupportobj.getPageTitle(), assertion[0]);
	logger.info("successfully redirected to"+assertion[0]);
	whodoyousupportobj.navigateback();} }


