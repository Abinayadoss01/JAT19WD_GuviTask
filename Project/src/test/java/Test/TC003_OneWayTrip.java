package Test;
import baseMethods.ProjectMethods;
import Pages.Homepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TC003_OneWayTrip extends ProjectMethods{

	@BeforeTest
	public void setup() {
		testName = "TC03_OneWayTrip";
		testDescription = "Selecting One Trip in SpiceJet";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="BookingData";
	}
	
	@Test (dataProvider = "getData")
	public  void TC03_OneWayTrip(String DFrom,String DTodestin,String DExpTitle) throws Exception  {
		
		Homepage hp= new Homepage();
		hp.FBonewaytrip( DFrom, DTodestin);
		
		String actualTitle = getPageTitle();
		System.out.println(actualTitle);
		//String expTitle=DExpTitle;
				
				//"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		if (actualTitle.equals(DExpTitle)) {
			reportStep("Validating one Trip selection in SpiceJet - Pass", "Pass", testName);
		} else {
			reportStep("Validating one Trip selection in SpiceJet - Fail", "Pass", testName);
		}
	}

}
