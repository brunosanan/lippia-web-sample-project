@crearProyecto
Feature: CrearProyecto

Background:
    Given estoy logueado
    And estoy en la pantalla de proyectos


@crearProyectoExitoso
Scenario: Creacion de proyecto exitosa
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre "ejemplo"
    And Hago click en el boton "CREATE"
    Then Se crea un nuevo proyecto 
    And le asigna un color aleatorio

@crearProyectoExitoso
Scenario: Creacion de proyecto exitosa con color personalizado
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre "ejemplo"
    And Hago click en el color predeterminado
    And selecciono el color "rojo"
    And Hago click en el boton "CREATE"
    Then Se crea un nuevo proyecto 
    And le asigna el color "rojo"

@crearProyectoFallido
Scenario Outline: Creacion proyecto fallida por cantidad de caracteres en el nombre
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre <nombre>
    And Hago click en el boton "CREATE"
    Then Muestra mensaje de error <descripcion_del_error>
 
Examples:
|nombre	    |descripcion_del_error			                            |
|a		    |Project name has to be between 2 and 250 characters long	|
|iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii		|Project name has to be between 2 and 250 characters login  |


@crearProyectoFallido
Scenario: Creacion proyecto fallida por nombre de proyecto ya existente
    Given Existe un proyecto con nombre "ejemplo"
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre "ejemplo"
    And Hago click en el boton "CREATE"
    Then Muestra un mensaje de error "ejemplo project for client already exists."

@crearProyectoCancelado
Scenario: Cancelacion de creacion de proyecto mediante boton de cancel
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre "ejemplo"
    And Hago click en el boton "Cancel"
    Then Se cierra la ventana de creacion de proyecto

@crearProyectoCancelado
Scenario: Cancelacion de creacion de proyecto mediante boton "X"
    When Hago click en el boton "CREATE NEW PROJECT"
    And Ingreso el nombre "ejemplo"
    And Hago click en el boton "X"
    Then Se cierra la ventana de creacion de proyecto