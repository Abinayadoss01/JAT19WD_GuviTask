package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		WebElement date=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(date);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		String expectedDay = "22";
		String expectedMonth = "October 2024";
		while(true) {
			
			String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']/parent::div")).getText();
			if(expectedMonth.equals(actualMonth)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='"+expectedDay+"']")).click();
		
	}

}
