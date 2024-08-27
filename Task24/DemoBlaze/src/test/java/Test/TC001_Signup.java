package Test;

import baseMethods.ProjectMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.CreateAccount;

public class TC001_Signup extends ProjectMethods{

	@BeforeTest
	public void setup() {
		testName = "TC01_SignupTest";
		testDescription = "Creating an account in demoBlaze application";
		testCategory = "QA test";
		testAuthor = "Abinaya";
		sheetName="signUpTestData";
	}
	@Test(dataProvider = "getData")
	public  void TC01_SignupTest(String fname,String password) throws Exception  {
		
	
		CreateAccount obj2 = new CreateAccount();
		obj2.SignUp(fname, password);
		
		String actualTitle = obj2.getPageTitle();
		System.out.println(actualTitle);
		String expTitle="STORE";
		softAssert(actualTitle,expTitle);
		if (actualTitle.equals(expTitle)) {
			reportStep("Validating Demoblaze Page Title - Pass", "Pass", testName);
		} else {
			reportStep("Validating Demoblaze Page Title - Fail", "Pass", testName);
		}
		}

}
