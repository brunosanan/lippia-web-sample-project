package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.constants.WorkspaceConstants;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps extends PageSteps {
    @When("Hago click en el boton CREATE NEW WORKSPACE")
    public void hagoClickEnElBotonCREATENEWWORKSPACE() {
        WorkspaceService.goCreateWorkspacePage();
    }


    @And("^Ingreso el nombre (.*)$")
    public void ingresoElNombre(String name) {
        WorkspaceService.inputWorkspaceName(name);
    }

    @And("Hago click en el boton CREATE")
    public void hagoClickEnElBotonCREATE() {
        WorkspaceService.createWorkspace();
    }
}
