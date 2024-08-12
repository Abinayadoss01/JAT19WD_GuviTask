package Pages;

import org.openqa.selenium.By;

import baseMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {
public void Login(String emailID , String Password) throws Exception {
		
		
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.id("fld-e")).sendKeys(emailID);
		driver.findElement(By.id("fld-p1")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	}
	

}
