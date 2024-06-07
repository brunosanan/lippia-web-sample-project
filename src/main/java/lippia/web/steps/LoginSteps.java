package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("^logueo la cuenta con el mail (.*) y contraseña (.*)")
    public void logueoUnaCuenta(String mail, String password) {
        LoginService.goLogInPage();
        LoginService.goLogInManuallyPage();
        LoginService.inputDatos(mail, password);
        LoginService.goTrackerPage();
    }

}
