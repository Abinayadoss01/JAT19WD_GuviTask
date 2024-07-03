package Task16;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromedriver1 {
	public static void screenshot(WebDriver driver) throws IOException {
		File Srce= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\abina\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\SeleniumPrjct\\ArtificialintelligenceOutPut.png");
		FileUtils.copyFile(Srce, dest);
	}

	public static void main(String[] args) throws IOException {
		
				//open firefox browser
				WebDriver Driver = new ChromeDriver();
				
				//opens the below url
				Driver.get("https://www.wikipedia.org");
				
				//maximize the window
				Driver.manage().window().maximize();
				
				//Take screenshot
				screenshot(Driver);
				
				Driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
				Driver.findElement(By.xpath("//i[text()='Search']")).click();
						//xpath("//p[text()='Intelligence of machines']"));
				//ele.click();
				//Driver.findElement(By.xpath("(//p[@class='suggestion-description'])[1]")).click();
				//WebElement history = Driver.findElement(By.className("suggestion-description"));
				//Select obj = new Select(ele);
				//List option =  obj.getAllSelectedOptions();
				//`System.out.println(option);
				//obj.selectByVisibleText("Artificial Intelligence");
				
				//print title of current page
				String title = Driver.getTitle();
				System.out.println(title);
				
	}

}
