package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BookingPage;
import baseMethods.ProjectMethods;

public class TC005_RTBooking extends ProjectMethods {

	@BeforeTest
	public void setup() {
		testName = "TC05_RTBooking";
		testDescription = "Round trip booking in spiceJet";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="BookingDataa";
	}
	@Test (dataProvider = "getData")
	public void RTBooking(String Dfname , String Dlname,String Demail , String Dphone) throws Exception {
		BookingPage bp= new BookingPage();
		bp.onewaytripBooking(Dfname, Dlname, Demail, Dphone);
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			reportStep("Validating round trip booking - Pass", "Pass", testName);	
		System.out.println("Title Matched");
		}
		else {
			reportStep("Validating round trip booking - Fail", "Fail", testName);
		System.out.println("Title didn't match");
		
		}
	}
}
