package ucreate.com.ImFootball.CreateAccount;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import ucreate.com.ImFootball.Home.HomePage;
import ucreate.com.ImFootball.Utilities.BrowserInstance;

public class WhoDoYouSupportTest {
	HomePage homepageobj ;
	WhoDoYouSupport whodoyousupport;
	@Test
	public void clickCreateAccountButton() throws IOException, ParseException{
		homepageobj = new HomePage(BrowserInstance.driver);
		homepageobj.clickOnCreateAccount();	}	
}
//	@Test
//	public void call() {	
//		whodoyousupport = new WhoDoYouSupport(BrowserInstance.driver);		
//		whodoyousupport.pickLeagueTwoEnglandSection();}	
//}
