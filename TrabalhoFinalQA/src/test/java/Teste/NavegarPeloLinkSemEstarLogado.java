package Teste;

import Pages.Login;
import Pages.Navegacao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**Classe para navegar no sistema sem estar logado no sistema.
 * @author Pablo Ricardo
 * @version 1
 */

public class NavegarPeloLinkSemEstarLogado {
	
	static WebDriver driver;
	static Login login;
	static Navegacao navegacao;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		login = new Login(driver);
		navegacao = new Navegacao(driver);
	}
	
	@Test
	public void test() {
		navegacao.navegarPeloLink();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
}
