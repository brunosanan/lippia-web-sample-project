package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

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
        if (mail.isEmpty()) {
            WebActionManager.setInput(LoginConstants.MAIL_INPUT, "x");
            WebActionManager.setInput(LoginConstants.MAIL_INPUT, "", false, true);
        }
        else{
            WebActionManager.setInput(LoginConstants.MAIL_INPUT, mail);
        }
        if (password.isEmpty()) {
            WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, "x");
            WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, "", false, true);
        }
        else{
            WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
        }
    }

    public static void goTrackerPage(){
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void verifyErrorMessage(String error){
        //WebActionManager.isPresent(WebActionManager.getText(xpath));
        Assert.assertEquals(error, WebActionManager.getText(LoginConstants.ERROR_MESSAGE));
    }

    public static void verifyCredentialError(String error) {
        WebActionManager.waitClickable(LoginConstants.LOGIN_BUTTON);
        Assert.assertEquals(error, WebActionManager.getText(LoginConstants.INVALID_CREDENTIALS_ERROR));
    }

    public static void clickOut() {
        WebActionManager.click(LoginConstants.VIEW_PASSWORD);
    }

    public static void verifyMailErrorMessage(String error) {
        System.out.println(WebActionManager.getText(LoginConstants.MAIL_ERROR_MESSAGE));
        Assert.assertEquals(error, WebActionManager.getText(LoginConstants.MAIL_ERROR_MESSAGE));
    }
}
