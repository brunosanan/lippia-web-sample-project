package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
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

    @And("voy a la pantalla de workspaces settings")
    public void voyALaPantallaDeWorkspacesSettings() {
        TrackerService.goWorkSpaceSettingsPage();
    }

}
