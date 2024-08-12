package Test;

import baseMethods.ProjectMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CountrySelection;
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
	public  void TC01_SignupTest(String fname,String lname, String emailID ,String password,String rpassword,String phone) throws Exception  {
		
		CountrySelection country = new CountrySelection();
		country.SelectUS();
		
		CreateAccount obj2 = new CreateAccount();
		obj2.SignUp(fname, lname,  emailID , password, rpassword, phone);
		
		String actualTitle = obj2.getPageTitle();
		System.out.println(actualTitle);
		String expTitle="Best Buy: Create an Account";
		if (actualTitle.equals(expTitle)) {
			reportStep("Validating Best Buy Page Title - Pass", "Pass", testName);
		} else {
			reportStep("Validating Best Buy Page Title - Fail", "Pass", testName);
		}
		}

}
