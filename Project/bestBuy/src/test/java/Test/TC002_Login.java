package Test;
import baseMethods.ProjectMethods;
import Pages.CountrySelection;
import Pages.Homepage;
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
	public  void LoginTest( String emailID ,String Password,String type, String message) throws Exception  {
	 
		CountrySelection country = new CountrySelection();
		country.SelectUS();
		LoginPage log = new LoginPage();
		log.Login(emailID , Password);
		Homepage home = new Homepage();
		home.validateLogin(type, message);
		
		}

}
