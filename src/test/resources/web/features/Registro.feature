@registro
Feature: Registro

Background:
Given estoy en la pantalla de registro

@registroExitoso
Scenario: Registro exitoso mediante correo electronico
 
    When ingreso un email "juan@mail.com"
    And hago click en el boton "I agree to CAKE.com Terms of Use"
    And hago click en el boton "CONTINUE WITH EMAIL"
    And abro una nueva pestaña con el mail
    And busco el mail de clockify   #paso a paso mas detallado?
    And ingreso el codigo de verificacion "1234"
    Then se realiza el registro 
    And accedo al area de usuario registrado

@registroExitoso
Scenario: Registro exitoso mediante Google
 
    When hago click en el boton "I agree to CAKE.com Terms of Use"
    And hago click en el boton "CONTINUE WITH GOOGLE"
    And ingreso un mail "x@mail.com" y contraseña "123456" correctos
    Then se realiza el registro
    And accedo al area de usuario registrado


@registroFallido
Scenario Outline: Registro fallido por error al ingresar correo electronico
 
    When ingreso un email <email>
    Then muestra mensaje <message>
 
Examples:
|email      |message                    |
|           |Email is required          |
|x@mail.c   |Email format is not valid  |
|xxxxx      |Email format is not valid  |


@registroFallido
Scenario: Registro fallido por codigo de verificacion incorrecto
 
    When ingreso un email "juan@mail.com"
    And hago click en el boton "I agree to CAKE.com Terms of Use"
    And hago click en el boton "CONTINUE WITH EMAIL"
    And ingreso el codigo de verificacion "xxxxxx" 
    Then muestra el mensaje "That code isn't valid. Please try again" 
    And borra el codigo ingresado


@registroFallido
Scenario: Registro por Google fallido por no aceptar terminos y condiciones
 
    When ingreso un email "x@mail.com"
    Then no habilita el boton "Continue with Google"


@registroFallido
Scenario: Registro fallido por destildar la opcion de aceptar terminos y condiciones

    When hago click en el boton "I agree to CAKE.com Terms of Use"
    And hago click en el boton "I agree to CAKE.com Terms of Use"
    Then muestra el mensaje "You must accept the terms of service"