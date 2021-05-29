package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_po {

	public WebDriver driver;

	public HomePage_po(WebDriver driver) {
		this.driver = driver;
	}

	By signIn = By.linkText("Sign in");
	By userName = By.id("login-username");
	By passWord = By.id("login-passwd");
	By next = By.id("login-signin");
	By mail = By.id("ybar-navigation-item-mail");

	public WebElement SignIn() {
		return driver.findElement(signIn);
	}
	
	public WebElement UserName() {
		return driver.findElement(userName);
	}
	
	public WebElement PassWord() {
		return driver.findElement(passWord);
	}
	
	public WebElement Next() {
		return driver.findElement(next);
	}
	
	public WebElement Mail() {
		return driver.findElement(mail);
	}
}
