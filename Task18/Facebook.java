package SeleniumPrjct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// launch the web browser
		WebDriver driver1 = new ChromeDriver();
		
		//Load the 
		driver1.get("https://www.facebook.com/");
						
		//Maximize the browser
						
		driver1.manage().window().maximize();
		//adding implicit wait
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		//Click on create account button
		driver1.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Create new account
		//enter the values in the Textbox
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("User@gmail.com");
		driver1.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("User@gmail.com");
		driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("User@01");
		
		//Select the dropdown option
		//select day
		Select objSelect =new Select(driver1.findElement(By.id("day")));
		objSelect.selectByVisibleText("28");
		
		//Select month
		Select objSelect1 =new Select(driver1.findElement(By.id("month")));
		objSelect1.selectByVisibleText("Apr");
		
		//select year
		Select objSelect2 =new Select(driver1.findElement(By.id("year")));
		objSelect2.selectByVisibleText("1992");
		
		//Selecting radio button
		List<WebElement> radio = driver1.findElements(By.xpath("//input[@name='sex']"));
		 
		for(WebElement ele : radio) 
		{
			String res = ele.getAttribute("value");
			
			if(res.equalsIgnoreCase("1")) {
				
				Actions act = new Actions(driver1);
				act.click(ele).perform();
				
		}
		//Clicking on signup button
		driver1.findElement(By.xpath("//div[@class='_1lch']//button")).click();
		
		
	}
	}
}
