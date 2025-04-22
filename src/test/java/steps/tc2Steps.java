package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc2Page;

public class tc2Steps {
    private WebDriver driver;
    private tc2Page registrationPage;
    
    @Given("el usuario navega a la página de registro")
    public void elUsuarioNavegaALaPáginaDeRegistro() {
        driver = new ChromeDriver();
        driver.get("https://www.ejemplo.com/registro");
        registrationPage = new tc2Page(driver);
        assertTrue("La página de registro no se muestra correctamente", registrationPage.isRegistrationPageDisplayed());
    }
    
    @When("el usuario completa el formulario de registro")
    public void elUsuarioCompletaElFormularioDeRegistro() {
        registrationPage.fillRegistrationForm("nombreEjemplo", "correo@ejemplo.com", "contraseña123");
        registrationPage.submitRegistrationForm();
    }
    
    @Then("el formulario muestra un mensaje de éxito")
    public void elFormularioMuestraUnMensajeDeÉxito() {
        assertTrue("El mensaje de éxito no se muestra", registrationPage.isSuccessMessageDisplayed());
        driver.quit();
    }
}