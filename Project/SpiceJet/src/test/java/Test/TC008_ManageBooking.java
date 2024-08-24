package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BookingPage;
import baseMethods.ProjectMethods;

public class TC008_ManageBooking extends ProjectMethods{
	@BeforeTest
	public void setup() {
		testName = "TC008_MngBooking";
		testDescription = "Verifying the error message in Manage Booking tab";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test 
	public void MngBooking() throws Exception {
		BookingPage bp= new BookingPage();
		bp.MngBooking();
	}
}
