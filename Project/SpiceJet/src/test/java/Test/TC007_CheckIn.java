package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BookingPage;
import baseMethods.ProjectMethods;

public class TC007_CheckIn extends ProjectMethods {

	@BeforeTest
	public void setup() {
		testName = "TC007_CheckIn";
		testDescription = "Verifying the error message in CheckIn status";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test 
	public void CheckIn() throws Exception {
		BookingPage bp= new BookingPage();
		bp.CheckInstatus();
		
	}
}
