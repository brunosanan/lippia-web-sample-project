package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService{
    public static void goLogInPage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
        WebActionManager.click(LoginConstants.HOME_LOGIN_BUTTON);
    }

    public static void goLogInManuallyPage(){
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void inputDatos(String mail, String password){
        WebActionManager.setInput(LoginConstants.MAIL_INPUT, mail);
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }

    public static void goTrackerPage(){
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }



}
