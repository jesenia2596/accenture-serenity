Feature: Login

  Scenario: Login exitoso
    Given el usuario necesita iniciar sesion con sus credenciales
    When ingresa usuario "standard_user" y password "secret_sauce"
    Then deberia tener acceso a la aplicacion

  Scenario: Login con credenciales inválidas
    Given el usuario necesita iniciar sesion con sus credenciales
    When ingresa usuario "standard_user" y password "123"
    Then no deberia tener acceso a la aplicacion