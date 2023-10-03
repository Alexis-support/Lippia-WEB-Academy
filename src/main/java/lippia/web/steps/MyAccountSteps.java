package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.MyAccountServices;
import org.testng.Assert;

public class MyAccountSteps {
    @When("^hace click en el menú (.*)$")
    public void menuMiCuenta(String cuenta) throws InterruptedException {
        MyAccountServices.mapsMyAccount(cuenta);
    }

    @And("^escribe su usuario valido (.+) y contraseña valida (.+) en el cuadro de texto$")
    public void escribeSuUsuarioValidoYContrasenaValidaEnElCuadroDeTexto(String user, String pass) {
        MyAccountServices.enterUser(user);
        MyAccountServices.enterPassword(pass);

    }

    @And("^hace click en el botón de inicio (.+)$")
    public void inicioDeSesion(String login) throws InterruptedException {
        MyAccountServices.mapsMyAccount(login);
    }

    @Then("se redirije correctamente al Dashboard con toda la información necesaria")
    public void seRedirijeCorrectamenteAlDashboardConTodaLaInformacionNecesaria() {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.BUTTON_SINGOUT),
                "El elemento no se encuentra presente: ");
    }

    @And("^efectua un click en el enlace de (.+)$")
    public void efectuaUnClickEnElEnlaceDePedidos(String pedidos) throws InterruptedException {
            MyAccountServices.mapsMyAccount(pedidos);
        }

    @Then("ve sus pedidos")
    public void veSusPedidos() {
        Assert.assertTrue(WebActionManager.isVisible(MyAccountConstants.LISTA_PEDIDOS),"El elemento no se encuentra presente: ");

    }
}

