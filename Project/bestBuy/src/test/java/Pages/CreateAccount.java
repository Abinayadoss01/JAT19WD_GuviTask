package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseMethods.ProjectMethods;

public class CreateAccount extends ProjectMethods {


		public void SignUp(String fname,String lname, String emailID ,String password,String rpassword,String phone) {
			
			
			driver.findElement(By.xpath("//span[text()='Account']")).click();
			
		
			driver.findElement(By.xpath("//a[text()='Create Account']")).click();
			
			driver.findElement(By.id("firstName")).sendKeys(fname);
			driver.findElement(By.id("lastName")).sendKeys(lname);
			driver.findElement(By.id("email")).sendKeys(emailID);
			driver.findElement(By.id("fld-p1")).sendKeys(password);
			driver.findElement(By.id("reenterPassword")).sendKeys(rpassword);
			driver.findElement(By.id("phone")).sendKeys(phone);
			
			
			Actions actions = new Actions(driver);
		
			WebElement Submit = driver.findElement(By.xpath("//button[text()='Create an Account']"));
			actions.moveToElement(Submit).click().build().perform();
			
		}
	}

