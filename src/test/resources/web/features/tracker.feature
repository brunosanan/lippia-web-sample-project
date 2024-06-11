@traker
Feature: Tracker
Background:
    Given logueo la cuenta con el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234

@RegistrarHoras
Scenario: Registro de horas exitoso
    And Hago click en el boton de manual mode
    When Ingreso una descripcion unica
    And Ingreso la hora de inicio 08:00
    And Ingreso la hora de fin 16:00
    And Ingreso la fecha 28/06/2024
    And Hago click en el boton ADD
    Then Se agrega un tiempo de trabajo nuevo


#NO ESTABA SEGURO DE CUAL DE LOS CANCELAR HABIA QUE HACER YA QUE UNO FUE EL QUE SE VIO EN LA CLASE DE CONSULTA Y OTRO LO PENSÉ YO Y EL TUTOR ME CONFIRMO QUE PODIA SER ASI EL ESCENARIO

@CancelarRegistroDeHorasTimer
Scenario: Cancelacion de registro de horas mediante timer
    And Hago click en el boton de timer mode
    When Ingreso una descripcion unica
    And Hago click en el boton START
    And Hago click en los 3 puntos
    And Hago click en DISCARD
    And Confirmo el descarto
    Then No se agrega un tiempo de trabajo nuevo

@CancelarRegistroDeHorasManual @run
Scenario: Cancelacion de registro de horas modo manual
    And Hago click en el boton de manual mode
    When Ingreso una descripcion unica
    And Ingreso la hora de inicio 09:00
    And Ingreso la hora de fin 10:00
    And Ingreso la fecha 20/06/2024
    And salgo de la pestaña de TRACKER
    And vuelvo a ingresar a la pestaña TRACKER
    Then No se agrega un tiempo de trabajo nuevo
