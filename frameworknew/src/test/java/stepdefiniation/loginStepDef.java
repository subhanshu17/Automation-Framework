package stepdefiniation;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page_object.login_PO;

public class loginStepDef {
	
	WebDriver driver;
	
	@Given("Open URL")
	public void open_URL() {
		login_PO lp = new login_PO();
		lp.open_URL();
		
	}
	
	@Given("Enter the Credential")
	public void ENter_the_Credential() {
		
	}
	
	@And("Verify the title")
	public void Verify_Title() {
		
	}
	
	@And("Click login")
	public void click_Login() {
		
	}
	
				

}
