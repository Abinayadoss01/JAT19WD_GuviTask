package Task16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void screenshot(WebDriver driver) throws IOException {
		File Srce= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\abina\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\SeleniumPrjct\\OutPut.png");
		FileUtils.copyFile(Srce, dest);
	}

	public static void main(String[] args) throws IOException {
		//open firefox browser
		WebDriver Driver = new FirefoxDriver();
		
		//opens the below url
		Driver.get("http://google.com");
		
		//maximize the window
		Driver.manage().window().maximize();
		
		//print url of current page
		String url = Driver.getCurrentUrl();
		System.out.println(url);
		
		//Take screenshot
		screenshot(Driver);
		
		//reload the webpage
		Driver.navigate().refresh();
		
		//close the browser
		Driver.close();
	}

}
