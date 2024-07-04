package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginGuvi {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Load the url
		driver.get("https://www.guvi.in/sign-in/");
				
		//Maximize the browser
				
		driver.manage().window().maximize();
				
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on login button
		driver.findElement(By.xpath("//a[@href='/sign-in/']/following-sibling::hr")).click();
		
		//using id locators
		driver.findElement(By.id("email")).sendKeys("abinayait28@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Lkmn@0908");
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		String text = driver.findElement(By.tagName("h1")).getText();
		driver.findElement(By.tagName("h1")).click();
		System.out.println(text);
	}

}
