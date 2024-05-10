package lippia.web.services;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class WorkspaceService extends PageSteps {


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

    public static void modifyName(String name) {
        //WebActionManager.setInput(WorkspaceConstants.INPUT_MODIFY_WORKSPACE_NAME, name, false, true);
        WebActionManager.setInput(WorkspaceConstants.INPUT_MODIFY_WORKSPACE_NAME, "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        WebActionManager.setInput(WorkspaceConstants.INPUT_MODIFY_WORKSPACE_NAME, name);
    }

    public static void clickOutOfInput() {
        WebActionManager.click(TrackerConstants.AVATAR);
    }

    public static void verifyNameChanged(String name) {
        TrackerService.goWorkSpacePage();
        verifyWorkspace(name);
    }
}
