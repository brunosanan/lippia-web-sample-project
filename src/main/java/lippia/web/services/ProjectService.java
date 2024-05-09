package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

public class ProjectService {
    public static void goCreateProjectPage(){
        WebActionManager.click(ProjectConstants.CREATE_PROJECT_BUTTON);
    }

    public static void inputProjectName(String name) {
        WebActionManager.setInput(ProjectConstants.INPUT_PROJECT_NAME, name);
    }

    public static void createProject (){
        WebActionManager.click(ProjectConstants.CREATE_BUTTON);
    }

    public static void verifyProject(String name) {
        WebActionManager.waitPresence(ProjectConstants.CREATED_PROJECT, name);
        Assert.assertTrue(WebActionManager.isPresent(ProjectConstants.CREATED_PROJECT, name));
    }
}
