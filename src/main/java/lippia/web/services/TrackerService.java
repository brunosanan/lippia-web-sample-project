package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import org.testng.Assert;

public class TrackerService {
    public static void verifyLogIn(){
        WebActionManager.waitPresences(TrackerConstants.WORKSPACE_SELECTOR);
        Assert.assertTrue(WebActionManager.isPresent(TrackerConstants.WORKSPACE_SELECTOR));
    }

    public static void goWorkSpacePage(){
        WebActionManager.click(TrackerConstants.WORKSPACE_SELECTOR);
        WebActionManager.click(TrackerConstants.WORKSPACE_MANAGE);
    }
}
