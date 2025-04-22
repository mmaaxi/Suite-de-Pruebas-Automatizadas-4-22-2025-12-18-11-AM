import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://www.example.com/login");
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void verifySuccessfulLogin() {
        // Verificar que el usuario haya iniciado sesión correctamente
        // Esto puede variar dependiendo de la implementación (cambiar URL, mostrar mensaje, etc.)
    }
}