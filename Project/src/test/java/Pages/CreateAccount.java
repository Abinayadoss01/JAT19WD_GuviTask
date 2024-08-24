package Pages;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.UtilityClass;
import baseMethods.ProjectMethods;

public class CreateAccount extends ProjectMethods {
	
	@FindBy(xpath = "(//div[contains(text(),'Signup')])[1]")
	WebElement SignUpbtn;
	
	@FindBy(xpath = "(//select[contains(@class,'form-control form-select')])[1]")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement first_name;		
			
	@FindBy(xpath = "(//input[@id='last_name'])[1]")
	WebElement last_name;
	
	@FindBy(xpath = "(//img[@alt='date'])[1]")
	WebElement Calender;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement month;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	
	
	@FindBy(xpath = "(//input[@placeholder='+91 01234 56789'])[1]")
	WebElement phone;
	
	@FindBy(id = "email_id")
	WebElement emailid;
	
	@FindBy(xpath = "(//input[@id='new-password'])[1]")
	WebElement password;
	
	@FindBy(xpath = "(//input[@id='c-password'])[1]")
	WebElement cpassword;
	
	@FindBy(xpath = "(//input[@id='defaultCheck1'])[1]")
	WebElement Agreetermsandconditions;
	
	@FindBy(xpath = "(//button[text()='Submit'])[1]")
	WebElement Submit;
	
	
	public CreateAccount(){
		PageFactory.initElements(driver, this);
	}

		public void SignUp(String Dtitle,String Dfirst_name,String Dlast_name,String Dmonth,String Dyear,String DExpectedday,String Dphone,String Demail,String Dpassword,String Dcpassword) {

			
			clickOn(SignUpbtn);
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
			UtilityClass.waitImplicit();
			selectFromDropDown(title,Dtitle);
			first_name.sendKeys(Dfirst_name);
			last_name.sendKeys(Dlast_name);
			UtilityClass.waitImplicit();
			clickOn(Calender);
			selectFromDropDown(month,Dmonth);
			selectFromDropDown(year,Dyear);
			WebElement Date= driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--00" + DExpectedday + "')]"));
			clickOn(Date);

			phone.sendKeys(Dphone);			
			jsSendKeys(emailid ,Demail);
			password.sendKeys(Dpassword);
			cpassword.sendKeys(Dcpassword);
			
			selectcheckbox(Agreetermsandconditions);
			
			jsClickOn(Submit);
			System.out.println(Submit.isSelected());
			
		}
	}

