package pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;

public class CadPessoa {
	
	static WebDriver driver;
	
	public CadPessoa (WebDriver driver) {
		this.driver = driver;
		
	}
	
	@Given ("efetuei login no sistema")
		public void preencherCampos() {
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@phptravels.com");
		
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("demoadmin");
		
		WebElement entrar = driver.findElement(By.xpath("/html/body/div[1]/form[1]/button"));
		entrar.click();		
		
		
		
		
	}
	
	
public void cadastro_accounts() {
		
	WebElement contas = driver.findElement(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]"));
	contas.click();		
					
				
	}
		
	
	
	
	
	
	
	
	
	

}
