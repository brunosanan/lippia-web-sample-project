package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.TrackerConstants;
import org.testng.Assert;

public class LogoutService {
    public static void openMenu(){
        WebActionManager.click(TrackerConstants.AVATAR);
    }

    public static void logout(){
        WebActionManager.click(TrackerConstants.LOGOUT_BUTTON);
    }

    public static void verifyLogout() {
        WebActionManager.waitPresences(LoginConstants.LOGIN_MANUALLY_BUTTON);
        Assert.assertTrue(WebActionManager.isPresent(LoginConstants.LOGIN_MANUALLY_BUTTON));
    }
}
