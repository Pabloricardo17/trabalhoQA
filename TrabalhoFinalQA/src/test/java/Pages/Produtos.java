package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Produtos {
	
static WebDriver driver;
	
	public Produtos(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selecionarProduto() {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")));
		
	WebElement selecionaProduto = driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART']"));
	selecionaProduto.click();
	}

	public void loginClickProduto() {

		WebElement loginClick = driver.findElement(By.id("login-button"));
		loginClick.click();
		WebElement addToCartButton = driver.findElement(By.className("btn_primary"));
		addToCartButton.click();
	}
	

}
