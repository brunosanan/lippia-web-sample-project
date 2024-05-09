package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LogoutService;

public class LogoutSteps extends PageSteps {
    @And("hago click en el avatar de perfil")
    public void hagoClickEnElAvatarDePerfil() {
        LogoutService.openMenu();
    }

    @And("hago click en el boton Logout")
    public void hagoClickEnElBotonLogout() {
        LogoutService.logout();
    }

    @Then("se cierra la sesion")
    public void seCierraLaSesion() {
        LogoutService.verifyLogout();
    }


}
