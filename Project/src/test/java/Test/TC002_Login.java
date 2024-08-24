package Test;
import baseMethods.ProjectMethods;

import Pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_Login extends ProjectMethods{

	@BeforeTest
	public void setup() throws Exception{
		testName = "TC002_Login";
		testDescription = "Sign-In Functionality";
		testCategory = "Regression";
		testAuthor = "Abinaya";
		sheetName="LoginData";
	}
	
	@Test(dataProvider = "getData")
	public  void TC02_Login(String Dphone,String Dpassword) throws Exception  {
	 
		LoginPage log = new LoginPage();
		log.Login(Dphone, Dpassword);
		
		
		}

}
