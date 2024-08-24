package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.UtilityClass;
import baseMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {

	
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//input[contains(@data-testid,'user-mobileno-input-box')]")
	WebElement phone;
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement password;
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement Submitbtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
public void Login(String Dphone,String Dpassword) throws Exception {
	String testName = "TC002_Login";
	
	UtilityClass.waitImplicit();
	ActionclickOn(Loginbtn);
	
	phone.sendKeys(Dphone);
	password.sendKeys(Dpassword);
	String actualtitle = driver.getTitle();
	//System.out.println(actualtitle);
	clickOn(Submitbtn);
	String exptitle = driver.getTitle();
	//System.out.println(exptitle);
	softAssert(actualtitle, exptitle);
	if (actualtitle.equals(exptitle)) {
		reportStep("Validating the Title of Spicejet Home Page - Pass", "Pass", testName);
	} else {
		reportStep("Validating the Title of Spicejet Home Page - Fail", "Fail", testName);
	}
	}
	

}
