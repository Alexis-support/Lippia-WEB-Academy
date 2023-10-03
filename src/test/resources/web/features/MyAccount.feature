@MyAccount
Feature: : Inicio de sesión de usuario y acceso al Dashboard

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in


  @SesionExitosa
  Scenario Outline: Inicio de sesión exitoso y acceso al Dashboard
    When hace click en el menú Mi cuenta
    When escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    Then se redirije correctamente al Dashboard con toda la información necesaria

    Examples:
      | user                         | contrasenia                      |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @Pedidos
  Scenario Outline: El usuario ve sus pedidos en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And efectua un click en el enlace de Pedidos
    Then ve sus pedidos

    Examples:
      | user                         | contrasenia                      |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |
