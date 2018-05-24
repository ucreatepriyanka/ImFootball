package ucreate.com.ImFootball.CreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import ucreate.com.ImFootball.Utilities.CommonMethods;
public class WhoDoYouSupport {
protected AppiumDriver<MobileElement> driver;	
	CommonMethods commonobj;
//  int min = 1;
//	Random generator = new Random();
//	int value = min + generator.nextInt(5);
//	String CreateAccButton = "//android.widget.TextView[@text ='League Two']";
    
	//EnglandSection
	By leaguetwo =           By.xpath("//android.widget.TextView[@index ='1']");
	By premierleague =       By.xpath("//android.widget.TextView[@text ='Premier League']");
	//LeagueTwo section 
	By Leaguetwobarmetfc=    By.xpath("//android.widget.TextView[@text ='Barnet FC']");
	By premierleaguearsenal= By.xpath("//android.widget.TextView[@text ='Arsenal']");
	By agree =               By.xpath("//android.widget.TextView[@text ='Agree']");
	By mobilenumber =        By.xpath("//android.widget.EditText[@text = 'phone number']");
	By next=                 By.id("btnNext");
	By pageheading=          By.xpath("//android.widget.TextView[@resource-id ='com.imfootball:id/tvToolBarTitle']");
	By backImageicon=        By.className("android.widget.ImageButton");
	
	public WhoDoYouSupport(AppiumDriver<MobileElement> driver){
		this.driver = driver ;
		commonobj = new CommonMethods(driver);}
	
public String getPageTitle(){
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(pageheading));
	return driver.findElement(pageheading).getText();	}
		
public void pickLeagueTwoEnglandSection() {
     	WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(leaguetwo));
		driver.findElement(leaguetwo).click();		
		driver.findElement(Leaguetwobarmetfc).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(agree));
		driver.findElement(agree).click();
		driver.findElement(mobilenumber).sendKeys("8988064146");
		driver.findElement(next).click();
		}
public void pickPremierLeagueEnglandSection() {
 	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(premierleague));
	 driver.findElement(premierleague).click();		
	 driver.findElement(premierleaguearsenal).click();
	 wait.until(ExpectedConditions.presenceOfElementLocated(agree));
	 driver.findElement(agree).click();
	 driver.findElement(mobilenumber).sendKeys("8988064146");
	 driver.findElement(next).click();
	}
public void navigateback() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(backImageicon));
	driver.findElement(backImageicon).click();}
}
