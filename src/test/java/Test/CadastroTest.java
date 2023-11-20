package Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPagesEmail;
import pages.CadastroPagesNascimento;
import pages.CadastroPagesNome;
import pages.CadastroPagesSenha;

import java.time.Duration;

public class CadastroTest {

    static WebDriver driver;
    static CadastroPagesNome CadastroPages;
    static CadastroPagesNascimento CadastroPagesNascimento;
    static CadastroPagesEmail CadastroPagesEmail;
    static CadastroPagesSenha CadastroPagesSenha;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        CadastroPages = new CadastroPagesNome(driver);
        CadastroPagesNascimento = new CadastroPagesNascimento(driver);
        CadastroPagesEmail = new CadastroPagesEmail(driver);
        CadastroPagesSenha = new CadastroPagesSenha(driver);
    }
    @Test
    public void test() {
        CadastroPages.preencherCampo();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        CadastroPagesNascimento.preencherCampoNascimento();
        CadastroPagesEmail.preencherCamposEmail();
        CadastroPagesSenha.preencherCamposSenha();

         }
    @AfterClass
    public static void tearDownClass() throws Exception{

    }

}
