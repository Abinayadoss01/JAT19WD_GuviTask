package Test;
import Utilities.UtilityClass;
import baseMethods.ProjectMethods;
import Pages.CountrySelection;
import Pages.SearchItem;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC004_Search extends ProjectMethods{
	@BeforeTest
	public void setup() {
		testName = "TC04_SearchItemTest";
		testDescription = "Search an item and add it to the cart";
		testCategory = "QA test";
		testAuthor = "Abinaya";
	}
	@Test
	public  void TC04_SearchItemTest() throws Exception  {
	
		CountrySelection country = new CountrySelection();
		country.SelectUS();
		
		SearchItem search =new SearchItem();
		
		search.SearchinUS();
		search.SearchItemValidation();
		}

}
