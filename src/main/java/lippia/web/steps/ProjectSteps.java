package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectService;

import java.time.Instant;

public class ProjectSteps extends PageSteps {
    private String name;

    @When("Hago click en el boton CREATE NEW PROJECT")
    public void hagoClickEnElBotonCREATENEWPROJECT() {
        ProjectService.goCreateProjectPage();
    }

    @And("Ingreso el nombre de proyecto unico")
    public void ingresoElNombreDeProyectoUnico() {
        this.name = "Project" + Instant.now().getEpochSecond();
        ProjectService.inputProjectName(this.name);
    }

    @And("Hago click en el boton CREATE PROJECT")
    public void hagoClickEnElBotonCreate() {
        ProjectService.createProject();
    }


    @Then("Se crea un nuevo proyecto")
    public void seCreaUnNuevoProyecto() {
        ProjectService.verifyProject(this.name);
    }
}
