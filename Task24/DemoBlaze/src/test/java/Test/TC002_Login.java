package Test;
import baseMethods.ProjectMethods;
import Pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_Login extends ProjectMethods{

	@BeforeTest
	public void setup() throws Exception{
		testName = "TC002_Login";
		testDescription = "Sign-In Functionality in demoBlaze application";
		testCategory = "Regression";
		testAuthor = "Abinaya";
		sheetName="LoginData";
	}
	@Test(dataProvider = "getData")
	public  void LoginTest( String Username ,String Password) throws Exception  {
	 
	
		LoginPage log = new LoginPage();
		log.Login(Username , Password);

		String actualTitle = log.getPageTitle();
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


