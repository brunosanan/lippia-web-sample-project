package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Tr;
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
        TrackerService.clickADDButton();
    }

    @Then("Se agrega un tiempo de trabajo nuevo")
    public void seAgregaUnTiempoDeTrabajoNuevo() {
        TrackerService.verifyTimeTracked(this.descripcionUnica);
    }
}
