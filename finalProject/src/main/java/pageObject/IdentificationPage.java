package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdentificationPage {
	public WebDriver driver;

	public IdentificationPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("connectLogin");
	By password = By.id("Password");
	By connexion = By.cssSelector("[value='Connexion']");
	By newlogintext = By.cssSelector("[id='userCeation'] h3");
	By loginText = By.cssSelector("[id='userConnection'] h3");
	By newUser = By.cssSelector("[value='Créer mon compte']");

	public WebElement Username() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Connexion() {
		return driver.findElement(connexion);
	}

	public WebElement Newlogintext() {
		return driver.findElement(newlogintext);
	}

	public WebElement LoginText() {
		return driver.findElement(loginText);
	}

	public WebElement NewUser() {
		return driver.findElement(newUser);
	}
}
