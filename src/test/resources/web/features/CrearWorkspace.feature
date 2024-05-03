@crearWorkspace
Feature: CrearWorkspace

Background:
    Given estoy logueado
    And estoy en la pantalla de workspaces


@crearWorkspaceExitoso
Scenario: Creacion de workspace exitosa
    When Hago click en el boton "CREATE NEW WORKSPACE"
    And Ingreso el nombre "ejemplo"
    And Hago click en el boton "CREATE"
    Then Se crea un nuevo workspace
    And Se activa el workspace
