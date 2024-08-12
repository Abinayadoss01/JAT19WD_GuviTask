package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseMethods.ProjectMethods;

public class SearchItem  extends ProjectMethods {
	
	public void SearchinUS() {
		
		driver.findElement(By.xpath("(input[@id='gh-search-input'])[1]")).sendKeys("Dyson - Airstrait Straightener - Nickel/Copper");
		driver.findElement(By.xpath("span[@class='header-search-icon']*[name()='svg']")).click();	
		
				
		driver.findElement(By.xpath("(a[@class='image-link'])[1]")).click();
		driver.findElement(By.xpath("(button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button '])[1]")).click();
	
		WebElement cart = driver.findElement(By.xpath("(a[text()='Go to Cart'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
		
		
		driver.findElement(By.xpath("(button[normalize-space()='Checkout'])[1]")).click();
		driver.findElement(By.xpath("(button[normalize-space()='Continue as Guest'])[1]")).click();
		
				
			
				driver.findElement(By.xpath("input[@id='user.emailAddress']")).sendKeys("doss@gmail.com");
				driver.findElement(By.xpath("input[@id='user.phone']")).sendKeys("9787347562");
				driver.findElement(By.xpath("span[text()='Continue to Payment Information']")).click();
				
		System.out.println("Search is done sucessfully");
		
	}
	
	public void SearchCanada() {
		driver.findElement(By.xpath("a[@href='https:www.bestbuy.com/?intl=nosplash']/h4[1]")).click();
		WebElement item = driver.findElement(By.xpath("input[@placeholder='Search Best Buy']"));
				item.sendKeys("Amazon Echo Dot (5th Gen) Smart Speaker with Alexa - Charcoal");
			
		driver.findElement(By.xpath("(button[@aria-label='Search'])[1]")).click();
		driver.findElement(By.xpath("(div[@class='sliderTarget_2Q87g'])[1]")).click();
		WebElement Delivery = driver.findElement(By.xpath("h2[text()='Delivery']"));
		Actions mouse= new Actions(driver);
		mouse.click(Delivery).perform();
		
		
		WebElement AddtoCart = driver.findElement(By.xpath("(button[@type='submit'])[2]"));
		mouse.click(AddtoCart).perform();
		System.out.println("Search is done sucessfully");
		

	}
public void SearchItemValidation () throws Exception {
		
		WebElement item = driver.findElement(By.xpath("span[@class='header-search-icon']*[name()='svg']"));
		String actualtext = item.getText();
		
		WebElement Expitem = driver.findElement(By.xpath("(div[@class='fluid-item__details--upper'])[1]"));
		String Expectedtext = Expitem.getText();
		
		softAssert(actualtext,Expectedtext);
		
		if (actualtext.equals(Expectedtext)) {
			reportStep("Validating Best Buy Page Title - Pass", "Pass", testName);
		} 
		else {
			reportStep("Validating Best Buy Page Title - Fail", "Pass", testName);
		}
		
		}
		}
	


