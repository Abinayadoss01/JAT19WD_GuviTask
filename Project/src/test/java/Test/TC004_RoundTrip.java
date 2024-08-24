package Test;
import baseMethods.ProjectMethods;
import Pages.Homepage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC004_RoundTrip extends ProjectMethods{
	@BeforeTest
	public void setup() {
		testName = "TC04_RoundTripTest";
		testDescription = "Selecting Round Trip in SpiceJet";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="BookingData";
	}
	@Test(dataProvider = "getData")
	public  void TC04_RoundTripTest(String DFrom,String DTodestin,String DExpTitle) throws Exception  {
		
		Homepage hp= new Homepage();
		hp.FBroundtrip( DFrom, DTodestin);
		String actualTitle = getPageTitle();
		System.out.println(actualTitle);
		//String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String expTitle=DExpTitle;
		if (actualTitle.equals(expTitle)) {
			reportStep("Validating Round trip selection - Pass", "Pass", testName);
		} else {
			reportStep("Validating Round trip selection - Fail", "Pass", testName);
		}
		
		
		}

}
