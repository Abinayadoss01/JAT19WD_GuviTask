package SeleniumPrjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//String sframe = "demo-frame";
		driver.switchTo().frame(0);
		//identifying the web elements
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		//drag and drop the box
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		String Colour = driver.findElement(By.xpath("//p[text()='Dropped!']")).getCssValue("background");
		System.out.println("The box is "+text);
		System.out.println("The colour of the box is "+Colour);
	}

}
