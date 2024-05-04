@logOut
Feature: LogOut

Background:
    Given estoy en la pantalla de login
    When Hago click en el boton Log in manually
    And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
    And hago click en el boton de login


Scenario: Logout exitoso
    And hago click en el avatar de perfil
    And hago click en el boton Logout
    Then se cierra la sesion