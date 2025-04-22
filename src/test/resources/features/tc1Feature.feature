Feature: Verificación de inicio de sesión

  Scenario: Usuario inicia sesión con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa credenciales válidas
    Then el usuario inicia sesión de manera correcta