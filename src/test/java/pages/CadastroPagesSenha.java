package pages;

import org.openqa.selenium.WebDriver;

public class CadastroPagesSenha {
    static WebDriver driver;
    public CadastroPagesSenha(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCamposSenha() {
        WebElement senha = driver.findElement(By.id("passwd"));
        senha.sendKeys("a6acax1");

        WebElement Confirmar = driver.findElement(By.id("confirm-passwd"));
        nome.sendKeys("a6acax1");

        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        botao.click();
    }
}
