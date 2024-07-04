package Task21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Load the url
		driver.get("https://the-internet.herokuapp.com/windows");
				
		//Maximize the browser
		driver.manage().window().maximize();
				
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		System.out.println("Before clicking the link: "+driver.getTitle());
		//click the link 1
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//switch to window
		Set<String> Windowhandles = driver.getWindowHandles();
		
		//convert the set to list
		List<String> windows = new ArrayList<String>(Windowhandles);
		driver.switchTo().window(windows.get(1));
		
		//print the title
		System.out.println("After clicking the link: "+driver.getTitle());
		System.out.println(driver.getWindowHandles());
		driver.close();
	}

}
