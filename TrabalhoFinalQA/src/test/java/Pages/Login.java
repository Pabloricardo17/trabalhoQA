package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
static WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoginUserName() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
	}
	
	
	public void LoginUserNameIncorreto() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("matheus");
	}
	
	public void LoginUserPassWord() {
		WebElement senha = driver.findElement(By.id("password"));
		senha.sendKeys("secret_sauce");
	}
	
	public void LoginUserNameAndPassWordLocked() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("locked_out_user");
		
		WebElement senha = driver.findElement(By.id("password"));
		senha.sendKeys("secret_sauce");
	}
	
	 
	public void loginClick() {
		WebElement loginClick = driver.findElement(By.id("login-button"));
		loginClick.click();

	}



}
