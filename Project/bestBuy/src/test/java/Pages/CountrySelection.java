package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.UtilityClass;


public class CountrySelection extends UtilityClass{
	
	//WebElement initialization
		@FindBy(xpath="//a[@href='https://www.bestbuy.com/?intl=nosplash']/h4[1]")
		WebElement US;
		
		@FindBy(xpath="//h4[text()='Canada']")
		WebElement Canada;
	
		
		public CountrySelection() {
			
		PageFactory.initElements(driver, this);
		}
		
		public void SelectUS() {
			waitExplicit(US);
			clickOn(US);
		}
		

		public void SelectCanada() {
			waitExplicit(Canada);
			clickOn(Canada);
		}

}
