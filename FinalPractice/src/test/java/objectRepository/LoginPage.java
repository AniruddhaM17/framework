package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "connectLogin")
	private WebElement username;

	@FindBy(id = "connectPassword") 
	private WebElement password;

	public WebElement Username() {
		return username;
	}
}
