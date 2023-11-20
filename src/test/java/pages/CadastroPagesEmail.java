package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPagesEmail {
    static WebDriver driver;

    public CadastroPagesEmail(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCamposEmail() {
        WebElement nome = driver.findElement(By.name("Username"));
        nome.sendKeys("Biancakvieira72");

        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botao.click();
    }
}

