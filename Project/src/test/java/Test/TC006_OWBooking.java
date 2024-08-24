package Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BookingPage;
import Pages.Homepage;
import baseMethods.ProjectMethods;

public class TC006_OWBooking extends ProjectMethods {

	@BeforeTest
	public void setup() {
		testName = "TC06_OWBooking";
		testDescription = "One way trip booking";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="BookingData";
	}
	@Test (dataProvider = "getData")
	public void RTBooking(String Dfname , String Dlname,String Demail , String Dphone) throws Exception {
		BookingPage bp= new BookingPage();
		bp.onewaytripBooking(Dfname, Dlname, Demail, Dphone);
								
		String expectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		assertEquals(expectedTitle,actualTitle);
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			reportStep("Validating One way trip booking - Pass", "Pass", testName);	
		System.out.println("Title Matched");
		}
		else {
			reportStep("Validating One way trip booking - Fail", "Fail", testName);
		System.out.println("Title didn't match");
		
		}
	}
}
