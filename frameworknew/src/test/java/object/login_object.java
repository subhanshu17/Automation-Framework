package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_object {
	
	WebDriver driver;

	login_object(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, null);
		
	}
	
	@FindBy(xpath="")
	WebElement a;

}
