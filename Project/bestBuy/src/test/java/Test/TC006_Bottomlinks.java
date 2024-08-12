package Test;
import org.testng.annotations.Test;

import Pages.CountrySelection;
import Pages.Homepage;

import org.testng.annotations.BeforeTest;

import baseMethods.ProjectMethods;
public class TC006_Bottomlinks {
	
	public class TC_05_ValidateLinkInBottomOfHomePage extends ProjectMethods {
		
		@BeforeTest
		public void setup() {
			testName = "tc_05_validateLinkInBottomOfHomePage";
			testDescription = "Link in HomePage bottom is broken or not";
			testCategory = "Regression";
			testAuthor = "Abinaya";
		}
		
		@Test(priority=6)
		public void tc_05_validateLinkInBottomOfHomePage() throws Exception {
			CountrySelection country = new CountrySelection();
			country.SelectUS();
			Homepage hp=new Homepage();
			String actTitle = hp.validateTermsAndCondtionLink();
			String expTitle="BestBuy.com Terms and Conditions";
			softAssert(actTitle, expTitle);
			if (actTitle.equals(expTitle)) {
				reportStep("Validating the Title of link in bottom of Home Page - Pass", "Pass", testName);
			} else {
				reportStep("Validating the Title of link in bottom of Home Page - Fail", "Fail", testName);
			}
		}
	}
}
