Feature: Verificación de registro de usuario

  Scenario: Registrar un nuevo usuario exitosamente
    Given el usuario navega a la página de registro
    When el usuario completa el formulario de registro
    Then el formulario muestra un mensaje de éxito