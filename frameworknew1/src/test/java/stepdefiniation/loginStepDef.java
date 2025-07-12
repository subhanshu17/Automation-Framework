package stepdefiniation;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page_object.login_PO;

public class loginStepDef {
	
	
	 Logger log = LogManager.getLogger(this.getClass());
	
	WebDriver driver;
	login_PO lp = new login_PO(driver);
	
	
	@Before
	public void open_Driver() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 log.info("Browser open");
	}
	
	@Given("Open URL")
	public void open_URL() {
		lp.open_URL(driver);	
		 log.info("Nevigate to URL");
	}
	
//	@Given("Enter the Credential")
//	public void ENter_the_Credential() {
//		
//	}
	
	@Given("Verify the title")
	public void Verify_Title() {
		lp.verify_Title(driver);
	}

//	@And("Click login")
//	public void click_Login() {
//		
//	}
	
	@And("Close browser")
	public void close_Browser() {
		lp.close_Browser(driver);
		log.info("Driver close");
		
	}
	

}
