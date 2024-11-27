package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

static WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}


	public void adicionarFirstName(){
		WebElement first = driver.findElement(By.id("first-name"));
		first.sendKeys("Pablo");

	}

	public void adicionarLastName(){
		WebElement last = driver.findElement(By.id("last-name"));
		last.sendKeys("Leal");

	}

	public void adicionarPostal(){
		WebElement postal = driver.findElement(By.id("postal-code"));
		postal.sendKeys("34553");
	}

	public void adicionarPostalInvalido(){
		WebElement postal = driver.findElement(By.id("postal-code"));
		postal.sendKeys("*******");
	}


	public void btnContinue(){
		WebElement btnContinue = driver.findElement(By.className("btn_primary"));
		btnContinue.click();

	}
	public void btnFinish(){
		WebElement btnFinish = driver.findElement(By.xpath("//a[contains(text(),'FINISH')]"));
         btnFinish.click();
		//a[contains(text(),'FINISH')]

	}



}
