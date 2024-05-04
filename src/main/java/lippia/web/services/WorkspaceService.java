package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class WorkspaceService {

    public static void goCreateWorkspacePage(){
        WebActionManager.click(WorkspaceConstants.CREATE_WORKSPACE_BUTTON);
    }

    public static void inputWorkspaceName(String name){

        String uniqueName = name + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        WebActionManager.setInput(WorkspaceConstants.INPUT_WORKSPACE_NAME, uniqueName);
    }

    public static void createWorkspace(){
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }
}
