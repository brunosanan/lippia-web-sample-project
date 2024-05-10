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
    And Ingreso el mail <mail> y contraseña xxxxxx
    And hago click en el boton de login
    Then muestra el error <causa_fallo>

Examples:
| mail			                | causa_fallo                           |
| bruno.sanandres04@gmail.com   | This account doesn't have a password. |
| cossetimaximo53@gmail.com 	| Invalid email or password             |
| x@mail.com                 	| Invalid email or password             |

@loginFallido @test
Scenario Outline: Login manual fallido por formato invalido del mail
    And Ingreso el mail <mail> y contraseña xxxxxx
    Then muestra el mail error <causa_fallo>

Examples:
| mail		| causa_fallo               |
|           | Email is required         |
| x         | Email format is not valid |
| x@gmail	| Email format is not valid |
| @mail.com | Email format is not valid |






 