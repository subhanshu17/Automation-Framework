package page_object;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class login_PO {
	
	WebDriver driver;	
	public login_PO(WebDriver driver) {
		this.driver=driver;
	}
	String URL="https:\\google.com";

	public void open_Drive(WebDriver driver) {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public void open_URL(WebDriver driver) {
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public void verify_Title(WebDriver driver) {
		if(driver.getTitle().equalsIgnoreCase("google")) {
			System.out.println("Title matched");			
		}
	}


}
