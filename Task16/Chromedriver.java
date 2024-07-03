package Task16;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromedriver extends Firefox {
	public static void main(String[] args)  throws IOException {
		//open firefox browser
		WebDriver Driver = new ChromeDriver();
		
		//opens the below url
		Driver.get("https://www.demoblaze.com");
		
		//maximize the window
		Driver.manage().window().maximize();
		
		//print url of current page
		String title = Driver.getTitle();
		System.out.println(title);
		
		//Take screenshot
		screenshot(Driver);
		
		//Verify that the title is same as STORE
		if(title.contains("STORE")) {
			System.out.println("Page landed on corret website");
		}
		else {
			System.out.println("Page not landed on corret website");	
		}
		
	}
}
