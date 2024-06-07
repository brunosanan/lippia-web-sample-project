@traker
Feature: Tracker
Background:
    Given logueo la cuenta con el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234

@RegistrarHoras @run
Scenario: Registro de horas exitoso
    And Hago click en el boton de manual mode
    When Ingreso una descripcion unica
    And Ingreso la hora de inicio 08:00
    And Ingreso la hora de fin 16:00
    And Ingreso la fecha 28/06/2024
    And Hago click en el boton ADD
    Then Se agrega un tiempo de trabajo nuevo