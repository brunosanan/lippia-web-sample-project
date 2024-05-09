package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.constants.TrackerConstants;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {

    @And("voy a la pantalla de workspaces")
    public void voyAWorkspaces() {
        TrackerService.goWorkSpacePage();
    }

    @And("voy a la pantalla de proyectos")
    public void voyALaPantallaDeProyectos() {
        TrackerService.goProjectPage();
    }

}
