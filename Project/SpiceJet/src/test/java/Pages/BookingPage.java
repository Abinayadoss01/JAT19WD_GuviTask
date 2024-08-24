package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.UtilityClass;


public class BookingPage extends UtilityClass{
	
	//WebElement initialization
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n']")
	WebElement From;
	
	@FindBy(xpath = "//input[@value='Select Destination']")
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
	@FindBy(xpath = "(//*[name()='circle'])[5]")
	WebElement selectFlight;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement fname;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement lname;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phone;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement email;
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep r-19h5ruw']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']\r\n")
			
	WebElement chkpassenger;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement continueto;
	@FindBy(xpath = "(//div[contains(text(),'Choose Your Seat')])[1]")
	WebElement chooseSeat;
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'][normalize-space()='7F']")
	WebElement selectseat;
	@FindBy(xpath = "/html[1]/body[1]/div[27]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]")
					
	WebElement done;
	//@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
	@FindBy(xpath = "//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-1kihuf0 r-ometjm r-1251kcm r-13qz1uu']/div[@class='css-1dbjc4n r-1awozwy r-13awgt0']/div[@class='css-1dbjc4n r-18u37iz r-ometjm r-gq6cd1']/div[@class='css-1dbjc4n r-2ka9w3 r-6ity3w r-zr9zts']/div[@class='css-1dbjc4n r-1xcajam r-1biggbk']/div[@class='css-1dbjc4n r-13awgt0 r-1biggbk']/div[2]")
	WebElement continuetopay;
	@FindBy(xpath = "(//div[contains(text(),'check-in')])[1]")
	WebElement Checkinstatus;
	@FindBy(xpath = "(//div[contains(text(),'manage booking')])[1]")
	WebElement MngBooking;
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][text()='flight status'])[1]")
	WebElement Flightstatus;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e']")
	WebElement Error;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")
	WebElement SrchBkng;
	@FindBy(xpath="(//input[@value='Select Origin'])[1]")
	WebElement SlctOrigin;
	
	@FindBy(xpath="(//input[@value='Select Destination'])[1]")
	WebElement SlctDest;
	
	

	public BookingPage() {
			
	PageFactory.initElements(driver, this);
		
	}
		
		
		public void onewaytripBooking(String Dfname , String Dlname,String Demail , String Dphone) throws Exception {
			
			ActionclickOn(From);
			
			ToDestination.sendKeys("MAA");
			ActionclickOn(DepDate);
			ActionclickOn(Submitbtn);
			waitExplicit(Continuebtn);
			ActionclickOn(selectFlight);
			ActionclickOn(Continuebtn);
			//selecting flight
			ActionclickOn(selectFlight);
			screenShot("TC04_roundTrip");
			ActionclickOn(Continuebtn);
			
			
			//Entering contact details
			fname.sendKeys(Dfname);
			lname.sendKeys(Dlname);
			phone.sendKeys(Dphone);
			email.sendKeys(Demail);
			ActionclickOn(chkpassenger);
			ActionclickOn(continueto);
			ActionclickOn(chooseSeat);
			ActionclickOn(selectseat);
			ActionclickOn(done);
			clickOn(continuetopay);
		}
		public void RoundtripBooking(String Dfname , String Dlname,String Demail , String Dphone) throws Exception {
			//Entering details of trip
			ActionclickOn(tripSelection);
			ActionclickOn(From);
			ToDestination.sendKeys("MAA");
			ActionclickOn(DepDate);
			ActionclickOn(ReturnDate);
			ActionclickOn(Submitbtn);
			waitExplicit(Continuebtn);
			
			//selecting flight
			ActionclickOn(selectFlight);
			screenShot("TC04_roundTrip");
			ActionclickOn(Continuebtn);
			
			
			//Entering contact details
			fname.sendKeys(Dfname);
			lname.sendKeys(Dlname);
			phone.sendKeys(Dphone);
			email.sendKeys(Demail);
			ActionclickOn(chkpassenger);
			ActionclickOn(continueto);
			ActionclickOn(chooseSeat);
			ActionclickOn(selectseat);
			ActionclickOn(done);
			clickOn(continuetopay);

		}
		public void CheckInstatus() throws Exception {
			String testName="Tc007_CheckIn status validation";
			clickOn(Checkinstatus);
			clickOn(SrchBkng);		
			String actualText = Error.getText(); 
			String expectedText = "Invalid PNR or Ticket Number";
			if(actualText.equalsIgnoreCase(expectedText)) {
				reportStep("Validating the error message in checkin page - Pass", "Pass", testName);	
			System.out.println("The Expected error message is displayed");
			}
			else {
				reportStep("Validating the error message in checkin page - Fail", "Fail", testName);
			System.out.println("The Expected error message is not displayed");
			
			}
		}
		
		public void MngBooking() throws Exception {
			clickOn(MngBooking);
			clickOn(SrchBkng);
			String testName="TC008_Manage Booking status validation";
			
					
			String actualText = Error.getText(); 
			String expectedText = "Invalid PNR or Ticket Number";
			if(actualText.equalsIgnoreCase(expectedText)) {
				reportStep("Validating the error message in checkin page - Pass", "Pass", testName);	
			System.out.println("The Expected error message is displayed");
			}
			else {
				reportStep("Validating the error message in checkin page - Fail", "Fail", testName);
			System.out.println("The Expected error message is not displayed");
			
		}}
		
		public void Flightstatus() throws Exception {
			clickOn(Flightstatus);
			SlctOrigin.sendKeys("DEL");
			ToDestination.sendKeys("MAA");
			clickOn(SrchBkng);
			String testName="TC009_ Flight status validation";
			
					
			String actualText = Error.getText(); 
			String expectedText = "Invalid PNR or Ticket Number";
			if(actualText.equalsIgnoreCase(expectedText)) {
				reportStep("Validating the error message in checkin page - Pass", "Pass", testName);	
			System.out.println("The Expected error message is displayed");
			}
			else {
				reportStep("Validating the error message in checkin page - Fail", "Fail", testName);
			System.out.println("The Expected error message is not displayed");
			
		}
		}

}