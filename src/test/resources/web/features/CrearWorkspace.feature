@crearWorkspace
Feature: CrearWorkspace

Background:
    Given estoy en la pantalla de login
    When Hago click en el boton Log in manually
    And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
    And hago click en el boton de login
    And voy a la pantalla de workspaces


@crearWorkspaceExitoso
Scenario: Creacion de workspace exitosa
    When Hago click en el boton CREATE NEW WORKSPACE
    And Ingreso el nombre ejemplo
    And Hago click en el boton CREATE
    Then Se crea un nuevo workspace
