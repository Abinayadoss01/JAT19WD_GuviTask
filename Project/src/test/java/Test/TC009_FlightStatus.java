package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BookingPage;
import baseMethods.ProjectMethods;

public class TC009_FlightStatus extends ProjectMethods{
	@BeforeTest
	public void setup() {
		testName = "TC009_FlightStatus";
		testDescription = "Verifying the error message in  Flight Status";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test 
	public void FlightStatus() throws Exception {
		BookingPage bp= new BookingPage();
		bp.Flightstatus();
		
	}

}
