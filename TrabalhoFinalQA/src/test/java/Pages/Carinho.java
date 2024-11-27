package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Carinho {

static WebDriver driver;

	public Carinho(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarCarrinhoECheckout() {
		//WebElement carrinho = driver.findElement(By.className("shopping_cart_link"));

		WebElement carrinho = driver.findElement(By.id("shopping_cart_container"));
		carrinho.click();

	}

	public void aguardar(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void btnCheckout(){
		WebElement checkoutButton = driver.findElement(By.xpath("//a[contains(@class, 'checkout_button')]"));
		checkoutButton.click();

	}

	public void btnCarrinho(){
		WebElement btnCarrinho = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/a[1]/svg[1]/path[1]')]"));
		btnCarrinho.click();

	}



}
