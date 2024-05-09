package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class WorkspaceService {


    public static void goCreateWorkspacePage(){
        WebActionManager.click(WorkspaceConstants.CREATE_WORKSPACE_BUTTON);
    }

    public static void inputWorkspaceName(String name){
        WebActionManager.setInput(WorkspaceConstants.INPUT_WORKSPACE_NAME, name);
    }

    public static void createWorkspace(){
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }

    public static void verifyWorkspace(String name) {
        WebActionManager.waitPresence(WorkspaceConstants.CREATED_WORKSPACE, name);
        Assert.assertTrue(WebActionManager.isPresent(WorkspaceConstants.CREATED_WORKSPACE, name));
    }
}
