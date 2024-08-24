package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseMethods.ProjectMethods;

public class Homepage extends ProjectMethods {
	
	
	@FindBy(xpath = "//div[@data-testid='to-testID-origin']//input[@type='text']")
	WebElement From;
	
	@FindBy(xpath = "(//input[@value='Select Destination'])[1]")
	WebElement ToDestination;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement Submitbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[6]/div[1]/div[1]")
	WebElement DepDate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[4]/div[1]")
	WebElement ReturnDate;
	
	@FindBy(xpath = "//div[contains(text(),'round trip')]")
	WebElement tripSelection;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement Continuebtn;
	
	public Homepage(){
		PageFactory.initElements(driver, this);	
	}
	
	
	public void FBonewaytrip(String DFrom,String DTodestin) throws Exception {
		
		ActionSendKeys(From,DFrom);
		
		ActionSendKeys(ToDestination,DTodestin);
		//ToDestination.sendKeys(DTodestin);
		
		ActionclickOn(DepDate);
		ActionclickOn(Submitbtn);
		waitExplicit(Continuebtn);
		//ActionclickOn(Continuebtn);
		
	}
public void FBroundtrip(String DFrom,String DTodestin) throws Exception {
		ActionclickOn(tripSelection);
		
		ActionSendKeys(From,DFrom);
		ActionclickOn(ToDestination);
		ActionSendKeys(ToDestination,DTodestin);
		
		ActionclickOn(DepDate);
		ActionclickOn(ReturnDate);
		ActionclickOn(Submitbtn);
		waitExplicit(Continuebtn);
	
		screenShot("TC04_roundTrip");
		//ActionclickOn(Continuebtn);
	}

	
	}