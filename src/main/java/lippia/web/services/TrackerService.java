package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import org.testng.Assert;

public class TrackerService {
    public static void verifyLogIn(){
        WebActionManager.click(TrackerConstants.WORKSPACE_SELECTOR); //para asegurarse que entre??? porque sino no se como haria
        Assert.assertTrue(WebActionManager.isPresent(TrackerConstants.WORKSPACE_SELECTOR));
    }
}
