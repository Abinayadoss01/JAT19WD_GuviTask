package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {
	@FindBy(id = "login2")
	WebElement Loginbtn;
	@FindBy(id = "loginusername")
	WebElement LUsername;
	@FindBy(id = "loginpassword")
	WebElement LPassword;
	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	WebElement Submitbtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
public void Login(String Username , String Password) throws Exception {
		
		
		
		Loginbtn.click();
		LUsername.sendKeys(Username);
		LPassword.sendKeys(Password);
		
		Submitbtn.click();
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
	}
	

}
