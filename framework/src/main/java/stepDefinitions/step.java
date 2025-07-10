package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class step {
	
	
	@Given("load Google")
	public void load_google() throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https:\\google.com");
	   driver.wait(5000);
	   
	   driver.quit();
			  
	}

}
