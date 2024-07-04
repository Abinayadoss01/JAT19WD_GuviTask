package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Load the url
		driver.get("https://the-internet.herokuapp.com/nested_frames");
				
		//Maximize the browser
		driver.manage().window().maximize();
				
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Switch to Top frames
		String TopFrames = "frame-top";
		driver.switchTo().frame(TopFrames);
		
		//Switch to Left frames
		driver.switchTo().frame("frame-left");
		String text = driver.findElement(By.tagName("body")).getText();
		System.out.println("Left frame text is "+text);
		
		//Switch back to Top frames
		driver.switchTo().parentFrame();
		
		//Switch to Middle frames
		driver.switchTo().frame("frame-middle");
		String Middletext = driver.findElement(By.tagName("div")).getText();
		System.out.println("Middle frame text is "+Middletext);
		
		//Switch back to Top frames
		driver.switchTo().parentFrame();
		
		//Switch to Right frames
		driver.switchTo().frame("frame-right");
		String Rtext = driver.findElement(By.tagName("body")).getText();
		System.out.println("Right frame text is "+Rtext);
		
		//Switch back to Top frames
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//Switch to bottom frames
		driver.switchTo().frame("frame-bottom");
		String Btext = driver.findElement(By.tagName("body")).getText();
		System.out.println("Bottom frame text is "+Btext);
		
		//Switch to Top frames
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//Verify the page title is 'Frames'
		System.out.println("Title of the page: "+driver.getTitle());
		
		

	}

}
