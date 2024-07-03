package SeleniumPrjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
				WebDriver driver = new ChromeDriver();
						
				//Load the url
				driver.get("https://www.guvi.in/register");
						
				//Maximize the browser
						
				driver.manage().window().maximize();
						
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//using id locators
				driver.findElement(By.id("name")).sendKeys("Abinaya");
						
				//using css selectors
						driver.findElement(By.cssSelector("input#email")).sendKeys("abinayait28821@gmail.com");
						
				//using xpath
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abinaya@01");
				
						driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9787347533");
						
				//using classname
						driver.findElement(By.className("signup-btn")).click();
						
						driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
				
				//using tagname locator
						String text = driver.findElement(By.tagName("h1")).getText();
						System.out.println(text);
	}

}
