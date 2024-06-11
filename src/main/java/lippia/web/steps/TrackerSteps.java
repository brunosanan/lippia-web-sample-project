package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {
    private String descripcionUnica;

    @And("Hago click en el boton de manual mode")
    public void hagoClickEnElBotonDeManualMode() {
        TrackerService.clickManualModeButton();
    }


    @When("Ingreso una descripcion unica")
    public void ingresoUnaDescripcionUnica() {
        this.descripcionUnica = TrackerService.generateUniqueDescription();
        TrackerService.inputDescription(this.descripcionUnica);
    }

    @And("^Ingreso la hora de inicio (.*)")
    public void ingresoLaHoraDeInicio(String hora) {
        TrackerService.inputStartHour(hora);
    }

    @And("^Ingreso la hora de fin (.*)")
    public void ingresoLaHoraDeFin(String hora) {
        TrackerService.inputFinishHour(hora);
    }

    @And("^Ingreso la fecha (.*)")
    public void ingresoLaFecha(String fecha) {
        TrackerService.inputDate(fecha);
    }

    @And("Hago click en el boton ADD")
    public void hagoClickEnElBotonADD() {
        TrackerService.clickADDSTARTButton();
    }

    @And("Hago click en el boton START")
    public void hagoClickEnElBotonSTART() {
        TrackerService.clickADDSTARTButton();
    }

    @Then("Se agrega un tiempo de trabajo nuevo")
    public void seAgregaUnTiempoDeTrabajoNuevo() {
        TrackerService.verifyTimeTracked(this.descripcionUnica);
    }

    @And("salgo de la pestaña de TRACKER")
    public void salgoDeLaPestañaDeTRACKER() {
        TrackerService.goProjectPage();
    }

    @And("vuelvo a ingresar a la pestaña TRACKER")
    public void vuelvoAIngresarALaPestañaTRACKER() {
        TrackerService.goTrackerPage();
    }

    @Then("No se agrega un tiempo de trabajo nuevo")
    public void noSeAgregaUnTiempoDeTrabajoNuevo() {
        TrackerService.verifyTimeNotTracked(this.descripcionUnica);
    }


    @And("Hago click en DISCARD")
    public void hagoClickEnDISCARD() {
        TrackerService.clickDISCARDButton();
    }

    @And("Confirmo el descarto")
    public void confirmoElDescarto() {
        TrackerService.confirmDiscard();
    }

    @And("Hago click en los 3 puntos para ver mas opciones")
    public void hagoClickEnLosPuntosParaVerMasOpciones() {
        TrackerService.viewMoreOptions();
    }






    @When("Cambio la descripcion")
    public void cambioLaDescripcion() {
        this.descripcionUnica = TrackerService.generateUniqueDescription();
        TrackerService.changeDescription(this.descripcionUnica);
    }

    @And("^Cambio la hora de inicio (.*)")
    public void cambioLaHoraDeInicio(String hora) {
        TrackerService.changeStartHour(hora);
    }

    @And("^Cambio la hora de fin (.*)")
    public void cambioLaHoraDeFin(String hora) {
        TrackerService.changeFinishHour(hora);
    }

    @And("Cambio si es facturable")
    public void cambioSiEsFacturable() {
        TrackerService.toggleBillable();
    }

    @And("Cambio el proyecto al que pertenece")
    public void cambioElProyectoAlQuePertenece() {
        TrackerService.changeProject();
    }

    @And("Cambio la fecha")
    public void cambioLaFecha() {
        TrackerService.changeDate();
    }

    @Then("Muestra la notificacion de cambio exitoso")
    public void muestraLaNotificacionDeCambioExitoso() {
        TrackerService.verifyNotification("Project has been updated");
    }

    @Then("Muestra la notificacion de cambio de fecha u hora")
    public void muestraLaNotificacionDeCambioDeFechaUHora() {
        TrackerService.verifyNotification("Successfully updated date and time");
    }

    @Then("Muestra la notificacion de cambio en la marca de facturable")
    public void muestraLaNotificacionDeCambioEnLaMarcaDeFacturable() {
        TrackerService.verifyNotification("Time entry successfully marked as non-billable");
    }

    @Given("Tengo un time track")
    public void tengoUnTimeTrack() {
        ingresoLaFecha("11/06/2023");
        hagoClickEnElBotonADD();
    }
}
