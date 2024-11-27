package Teste;

import Pages.Carinho;
import Pages.Checkout;
import Pages.Login;
import Pages.Produtos;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FazerUmaCompra {
	
	static WebDriver driver;
	static Login login;
	static Produtos loginProduto;
	static Carinho carinho;
	static Checkout checkout;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		login = new Login(driver);
		loginProduto = new Produtos(driver);
		carinho = new Carinho(driver);
		checkout = new Checkout(driver);
		
	}
	
	
	@Test
	public void test() {	
		login.LoginUserName();
		login.LoginUserPassWord();
		loginProduto.loginClickProduto();
		carinho.clicarCarrinhoECheckout();
		carinho.btnCheckout();
		checkout.adicionarFirstName();
		checkout.adicionarLastName();
		checkout.adicionarPostal();
		checkout.btnContinue();
		checkout.btnFinish();


	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
