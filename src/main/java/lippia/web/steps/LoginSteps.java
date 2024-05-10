package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jpackage.internal.Log;
import lippia.web.constants.LoginConstants;
import lippia.web.services.LoginService;
import lippia.web.services.TrackerService;

public class LoginSteps extends PageSteps {


    @Given("estoy en la pantalla de login")
    public void home() {
        LoginService.goLogInPage();
    }

    @When("Hago click en el boton Log in manually")
    public void hagoClickEnElBoton() {
        LoginService.goLogInManuallyPage();
    }

    @And("^Ingreso el mail (.*) y contraseña (.*)$")
    public void ingresoElMailYPassword(String mail, String password) {
        LoginService.inputDatos(mail, password);
    }


    @And("hago click en el boton de login")
    public void hagoClickEnElBotonDeLogin() {
        LoginService.goTrackerPage();
    }

    @Then("accedo al area de usuario registrado")
    public void accedoAlAreaDeUsuarioRegistrado() {
        TrackerService.verifyLogIn();
    }

    @Then("^la aplicacion muestra un mensaje de error: (.*)$") //CONSULTAR
    public void verificoMensajeDeError(String errorMessage) {
        LoginService.verifyErrorMessage(errorMessage, LoginConstants.ERROR_MESSAGE);
    }

    @Then("^muestra el error (.*)$")
    public void muestraElErrorInvalidEmailOrPassword(String error) {
        LoginService.verifyCredentialError(error);
    }

    @And("hago click fuera de los inputs")
    public void hagoClickFueraDeLosInputs() {
        LoginService.clickOut();
    }

    @Then("^muestra el mail error (.*)$")
    public void muestraElMailErrorCausa_fallo(String errorMessage) {
        LoginService.verifyErrorMessage(errorMessage, LoginConstants.MAIL_ERROR_MESSAGE);
    }

    @Then("^muestra el password error (.*)$")
    public void muestraElPasswordErrorCausa_fallo(String errorMessage) {
        LoginService.verifyErrorMessage(errorMessage, LoginConstants.PASSWORD_ERROR_MESSAGE);
        }
        }
