@login
Feature: Login

Background:
 Given estoy en la pantalla de login


@loginExitoso
Scenario: Login manual exitoso
    When Hago click en el boton Log in manually
    And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
    And hago click en el boton de login
    Then accedo al area de usuario registrado

@loginFallido
Scenario Outline: Login manual fallido por <causa_fallo>
    When Hago click en el boton Log in manually
    And Ingreso el mail <mail> y contraseña <password>
    And hago click en el boton de login
    Then la aplicacion muestra un ensaje de error: <mensaje>

Examples:
|mail			            | password				| mensaje							| causa_fallo 				        |
|cossetimaximo53@gmail.com  | xxxxx					|usuario y/o contraseña incorrecta 	| contraseña incorrecta             |
|xxxxxxxxxxx		        | xxxxxx 				|usuario y/o contraseña incorrecta 	| usuario incorrecto                |
|xxxxxxxxxxx		        | 		 				|debe ingresar usuario y contraseña | contraseña incompleta             |
|       			        |xxxxxxxxxxx 			|debe ingresar usuario y contraseña | usuario incompleto                |
|		        	        | 		 				|debe ingresar usuario y contraseña | usuario y contraseña incompleta   |




 