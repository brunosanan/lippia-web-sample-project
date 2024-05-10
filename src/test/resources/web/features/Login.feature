@login
Feature: Login

Background:
    Given estoy en la pantalla de login
    When Hago click en el boton Log in manually

@loginExitoso
Scenario: Login manual exitoso
    And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
    And hago click en el boton de login
    Then accedo al area de usuario registrado

@loginFallido
Scenario Outline: Login manual fallido por <causa_fallo>
    And Ingreso el mail <mail> y contraseña <password>
    And hago click en el boton de login
    Then muestra el error <causa_fallo>

Examples:
| mail			                | password				| causa_fallo                           |
| bruno.sanandres04@gmail.com   | xxxxxx				| This account doesn't have a password. |
| cossetimaximo53@gmail.com 	| xxxxxx 				| Invalid email or password             |
| x@mail.com                 	| xxxxxx 				| Invalid email or password             |








 