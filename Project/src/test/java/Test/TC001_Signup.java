package Test;

import baseMethods.ProjectMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateAccount;

public class TC001_Signup extends ProjectMethods{

	@BeforeTest
	public void setup() {
		testName = "TC01_SignupTest";
		testDescription = "Creating an account in bestbuy application";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="signUpTestData";
	}
	@Test(dataProvider = "getData")
	public  void TC01_SignupTest(String Dtitle,String Dfirst_name,String Dlast_name,String Dmonth,String Dyear,String DExpectedday,String Dphone,String Demail,String Dpassword,String Dcpassword) throws Exception  {
		
		CreateAccount create = new CreateAccount();
		
		create.SignUp(Dtitle,Dfirst_name,Dlast_name,Dmonth,Dyear,DExpectedday,Dphone,Demail,Dpassword,Dcpassword);
		
	String actualTitle = create.getPageTitle();
	//System.out.println(actualTitle);
		String expTitle="SpiceClub - The frequent flyer program of SpiceJet";
	if (actualTitle.equals(expTitle)) {
		reportStep("Validating create account Page Title in Spice jet application- Pass", "Pass", testName);
	} else {
		reportStep("Validating create account Page Title in Spice jet application - Fail", "Pass", testName);
	}
	}

}
