package SeleniumPrjct;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SLocators {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Launch the browser
				WebDriver driver = new ChromeDriver();
						
				//Load the url
				driver.get("https://www.guvi.in/register");
						
				//Maximize the browser
						
				driver.manage().window().maximize();
						
				//adding implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//using id locators
				driver.findElement(By.id("name")).sendKeys("test");
						
				//using css selectors
						driver.findElement(By.cssSelector("input#email")).sendKeys("abinayatest@gmail.com");
						
				//using xpath
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abinaya@01");
				
						driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9787347533");
						
				//using classname
						driver.findElement(By.className("signup-btn")).click();
						
						driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
				
				//using tagname locator
						String text = driver.findElement(By.tagName("h1")).getText();
						driver.findElement(By.tagName("h1")).click();
						System.out.println(text);
						
						File Srce= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						File dest= new File("C:\\Users\\abina\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\SeleniumPrjct\\OutPut.png");
						FileUtils.copyFile(Srce, dest);
	}
		

}
