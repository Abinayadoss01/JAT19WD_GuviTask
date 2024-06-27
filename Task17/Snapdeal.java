package SeleniumPrjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.CdpVersionFinder;
public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Load the url
		driver.get("https://www.snapdeal.com/");
				
		//Maximize the browser
				
		driver.manage().window().maximize();
				
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Click on Sign in link
				driver.findElement(By.xpath("//span[text() = 'Sign In']")).click();
		//Click on Login button
				driver.findElement(By.xpath("//a[text()='login']")).click();
		//declaring iframe to switch frame		
				String loginframe="loginIframe";
				driver.switchTo().frame(loginframe);
		//Enter valid email id		
				driver.findElement(By.id("userName")).sendKeys("dossabi0@gmail.com");
		//Click on continue button
				driver.findElement(By.xpath("//button[text()='continue']")).click();
				Thread.sleep(10000);
				//Click on continue button after entering otp
				driver.findElement(By.id("loginUsingOtp")).click();
				String text = driver.findElement(By.xpath("//span[text()='Abi Joy']")).getText();
				System.out.println(text+" logged in Successfully");
				driver.close();
				
	}

}
