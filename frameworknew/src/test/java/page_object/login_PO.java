package page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class login_PO {
	
	WebDriver driver;
	String URL="https:\\google.com";
	
	
	
	
	@BeforeClass
	public void open_Drive() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void open_URL() {
		driver.get(URL);
		driver.manage().window().maximize();
	}

}
