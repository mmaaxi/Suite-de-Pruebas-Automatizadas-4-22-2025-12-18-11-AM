package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc2Page {
    private WebDriver driver;

    private By registrationFormSelector = By.id("registrationForm");
    private By nameFieldSelector = By.id("name");
    private By emailFieldSelector = By.id("email");
    private By passwordFieldSelector = By.id("password");
    private By submitButtonSelector = By.id("submit");
    private By successMessageSelector = By.id("successMessage");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isRegistrationPageDisplayed() {
        return driver.findElement(registrationFormSelector).isDisplayed();
    }

    public void fillRegistrationForm(String name, String email, String password) {
        driver.findElement(nameFieldSelector).sendKeys(name);
        driver.findElement(emailFieldSelector).sendKeys(email);
        driver.findElement(passwordFieldSelector).sendKeys(password);
    }

    public void submitRegistrationForm() {
        driver.findElement(submitButtonSelector).click();
    }

    public boolean isSuccessMessageDisplayed() {
        WebElement successMessage = driver.findElement(successMessageSelector);
        return successMessage.isDisplayed() && successMessage.getText().contains("Registro exitoso");
    }
}