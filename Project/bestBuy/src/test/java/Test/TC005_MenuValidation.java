package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseMethods.ProjectMethods;

public class TC005_MenuValidation extends ProjectMethods {

	@BeforeTest
	public void setup() {
		testName = "TC03_CountrySelectTest";
		testDescription = "Navigating to the Best Buy e-commerce website by selecting the country";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test 
	public void Menu() throws Exception {
		driver.findElement(By.xpath("//a[@href='https://www.bestbuy.com/?intl=nosplash']/h4[1]")).click();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Top Deals and Featured Offers on Electronics - Best Buy";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			reportStep("Validating Menus in Best Buy Page - Pass", "Pass", testName);	
		System.out.println("Title Matched");
		}
		else {
			reportStep("Validating MenusBest Buy Page Title - Fail", "Fail", testName);
		System.out.println("Title didn't match");
		
		}
	}
}
