package Teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login;

public class LoginCamposVazios {
	
	static WebDriver driver;
	static Login login;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		login = new Login(driver);
		
	}
	
	@Test
	public void test() {		
		login.loginClick();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
