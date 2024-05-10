@modificarWorkspace
Feature: ModificarWorkspace

Background:
  Given estoy en la pantalla de login
  When Hago click en el boton Log in manually
  And Ingreso el mail cossetimaximo53@gmail.com y contraseña tortugamaritima1234
  And hago click en el boton de login
  And voy a la pantalla de workspaces settings

@modificarWorkspaceExitoso
Scenario: Modificacion de nombre de un workspace exitoso
  When Modifico el nombre del workspace
  And Hago click fuera del input
  Then Se actualiza el nombre del workspace