package Test;
import Utilities.UtilityClass;
import baseMethods.ProjectMethods;
import Pages.CountrySelection;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TC003_navgatingToBestBestApp extends ProjectMethods{

	@BeforeTest
	public void setup() {
		testName = "TC03_CountrySelectTest";
		testDescription = "Navigating to the Best Buy e-commerce website by selecting the country";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test
	public  void TC03_CountrySelectTest() throws Exception  {
	
	
		CountrySelection country = new CountrySelection();
		country.SelectUS();
		String actTitle = UtilityClass.getPageTitle();
		
		String expTitle="Best Buy | Official Online Store | Shop Now & Save";
		
		softAssert(actTitle,expTitle);
		
		if (actTitle.equals(expTitle)) {
			reportStep("Validating Best Buy Page Title - Pass", "Pass", testName);
		} else {
			reportStep("Validating Best Buy Page Title - Fail", "Pass", testName);
		}
		
		}

}
