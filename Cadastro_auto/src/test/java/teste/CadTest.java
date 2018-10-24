package teste;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagina.CadPessoa;

public class CadTest {

	static WebDriver driver;
	static CadPessoa cadPessoa;
	
	@BeforeClass
	public static void Acessar_Navegador() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro\\Desktop\\Projeto Inmetrics\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		cadPessoa = new CadPessoa(driver);
		
	}
	
		
	@Test
	public void Preenchimento_campos() {
		cadPessoa.preencherCampos();
		cadPessoa.cadastro_accounts();
	}
	
	public void Cadastrar() {
	
	}
	
}
