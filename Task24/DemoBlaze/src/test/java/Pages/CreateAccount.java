package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class CreateAccount extends ProjectMethods {

	@FindBy(id = "signin2")
	WebElement SignUpbtn;
	@FindBy(id = "sign-username")
	WebElement Username;
	@FindBy(id = "sign-password")
	WebElement Password;
	@FindBy(xpath = "(//button[text()='Sign up'])[1]")
	WebElement Submitbtn;
	
	public CreateAccount(){
		PageFactory.initElements(driver, this);
	}
		public void SignUp(String fname,String password) throws Exception {
			
			
			
			
		
			SignUpbtn.click();
			
			Username.sendKeys(fname);
			Password.sendKeys(password);
			
			ActionclickOn(Submitbtn);
			
			String testName1 = "TC001_Login_Before alert";
			screenShot(testName1);
			Thread.sleep(5000);

			Alert alert = driver.switchTo().alert(); // switch to alert

			String alertMessage= driver.switchTo().alert().getText(); // capture alert message

			System.out.println(alertMessage); // Print Alert Message
			Thread.sleep(5000);
			alert.accept();
			
			String testName = "TC001_Login_Afteralert";
			screenShot(testName);
			
		}
	}

