import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.tc1Page;

public class tc1Steps {
    WebDriver driver;
    tc1Page loginPage;

    public tc1Steps() {
        this.driver = Hooks.getDriver();
        loginPage = PageFactory.initElements(driver, tc1Page.class);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        loginPage.navigateToLoginPage();
    }

    @When("el usuario ingresa credenciales válidas")
    public void el_usuario_ingresa_credenciales_validas() {
        loginPage.enterCredentials("usuarioValido", "contrasenaValida");
    }

    @Then("el usuario inicia sesión de manera correcta")
    public void el_usuario_inicia_sesion_de_manera_correcta() {
        loginPage.verifySuccessfulLogin();
    }
}