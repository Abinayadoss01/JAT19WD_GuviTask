package Task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwait {

	public static void main(String[] args) throws IOException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Load the url
		driver.get("https://phptravels.com/demo/");
				
		//Maximize the browser
		driver.manage().window().maximize();
				
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Abinaya");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("doss");
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Abinaya01");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("doss@gmail.com");
		
		
		String a = driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		String b = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		String s=String.valueOf(c);  
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(s);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Step 2: Condition to wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2/strong[1]")));
		
		
		String text = driver.findElement(By.xpath("//h2/strong[1]")).getText();
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'We have sent your demo ')]")).getText();
		System.out.println("The form is submitted successfully and the message is "+text);
		System.out.println(text1);
		
		File Srce= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\abina\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\Task22\\OutPut.png");
		FileUtils.copyFile(Srce, dest);
		
	}

}
