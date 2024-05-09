@crearProyecto
Feature: CrearProyecto

Background:
    Given estoy en la pantalla de login
    When Hago click en el boton Log in manually
    And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
    And hago click en el boton de login
    And voy a la pantalla de proyectos

@crearProyectoExitoso
Scenario: Creacion de proyecto exitosa
    When Hago click en el boton CREATE NEW PROJECT
    And Ingreso el nombre de proyecto unico
    And Hago click en el boton CREATE PROJECT
    Then Se crea un nuevo proyecto
