package page_object;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login_PO {
	
	WebDriver driver;	
	Logger log = LogManager.getLogger(login_PO.class);
	public login_PO(WebDriver driver) {
		this.driver=driver;
	}
	String URL="https:\\google.com";

//	public void open_Drive(WebDriver driver) {
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
	public void open_URL(WebDriver driver) {
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public void verify_Title(WebDriver driver) {
		try {
			if(driver.getTitle().equalsIgnoreCase("google")) {
				log.info("Title verifed");		
			}else {
				log.info("title worng");	
			}
			
		}catch(Exception e){
			log.error("Error occur during verifing title" + e.getMessage());
		}
	}
	
	public void close_Browser(WebDriver driver) {
		driver.close();
	}


}
