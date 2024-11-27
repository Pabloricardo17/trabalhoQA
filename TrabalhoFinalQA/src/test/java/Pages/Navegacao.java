package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navegacao {

static WebDriver driver;

	public Navegacao(WebDriver driver) {
		this.driver = driver;
	}



	public void navegarPeloLink(){
		driver.get("https://www.saucedemo.com/v1");

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");

	}
	
	public String capturarMsgErroLogin(){
		return driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: ')]")).getText();
	}

}
