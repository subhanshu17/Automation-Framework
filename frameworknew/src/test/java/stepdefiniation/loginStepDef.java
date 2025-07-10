package stepdefiniation;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import page_object.login_PO;

public class loginStepDef {
	
	WebDriver driver;
	login_PO lp = new login_PO(driver);
	
	@Before
	public void open_Driver() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("Open URL")
	public void open_URL() {
		lp.open_URL(driver);	
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

	@After
	public void close() {
		driver.quit();
	}
				

}
