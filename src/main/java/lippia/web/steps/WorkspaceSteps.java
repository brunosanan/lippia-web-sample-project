package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.WorkspaceService;

import java.time.Instant;

public class WorkspaceSteps extends PageSteps {
    private String name;

    @When("Hago click en el boton CREATE NEW WORKSPACE")
    public void hagoClickEnElBotonCREATENEWWORKSPACE() {
        WorkspaceService.goCreateWorkspacePage();
    }

    @And("Ingreso el nombre de workspace unico")
    public void ingresoElNombre() {
        this.name = "Workspace" + Instant.now().getEpochSecond();
        WorkspaceService.inputWorkspaceName(this.name);
    }

    @And("Hago click en el boton CREATE WORKSPACE")
    public void hagoClickEnElBotonCREATE(){
        WorkspaceService.createWorkspace();
    }

    @Then("Se crea un nuevo workspace")
    public void seCreaUnNuevoWorkspace() {
        WorkspaceService.verifyWorkspace(this.name);
    }

    @When("Modifico el nombre del workspace")
    public void modificoElNombreDelWorkspace() {
        this.name = "Workspace" + Instant.now().getEpochSecond();
        WorkspaceService.modifyName(this.name);
    }

    @And("Hago click fuera del input")
    public void hagoClickFueraDelInput() {
        WorkspaceService.clickOutOfInput();
    }

    @Then("Se actualiza el nombre del workspace")
    public void seActualizaElNombreDelWorkspace() {
        WorkspaceService.verifyNameChanged(this.name);
    }
}
