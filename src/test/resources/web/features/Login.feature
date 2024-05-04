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
Scenario Outline: Login manual fallido por credenciales incompletas
    And Ingreso el mail <mail> y contraseña <password>
    And hago click fuera de los inputs
    Then la aplicacion muestra un mensaje de error: <mensaje>z

Examples:
| mail			            | password				| mensaje							    |
| xxxxxxxxxxx@mail.com      | 		 				| Password is required                  |
|       			        | xxxxxxxxxxx 			| debe ingresar usuario y contraseña    |
|		        	        | xxxx		 			| Password is not valid    |

@loginFallido
Scenario Outline: Login manual fallido por credenciales invalidas
    And Ingreso el mail <mail> y contraseña <password>
    And hago click en el boton de login
    Then muestra el error Invalid email or password

Examples:
| mail			                | password				|
| bruno.sanandres04@gmail.com   | xxxxxx				|
| x@mail.com     	            | xxxxxx 				|





 