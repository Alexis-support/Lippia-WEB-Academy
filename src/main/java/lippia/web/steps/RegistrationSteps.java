package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.MyAccountServices;
import lippia.web.services.RegistrationServices;

public class RegistrationSteps {
    @And("^ingresa su email valido en el campo (.+) y una contrasenia valida en el campo de (.+)$")
    public void ingresaUnaDireccionDeCorreoElectronicoValidaYUnaContrasenaEnLosCuadrosDeTextoDeDireccionDeCorreoElectronicoYContrasena(String user, String pass) {
        RegistrationServices.enterUserCriteria(user);
        RegistrationServices.enterPassCriteria(pass);
    }

    @Then("es registrado exitosamente y redirigido a la página de inicio de su cuenta")
    public void esRegistradoExitosamenteYRedirigidoALaPaginaDeInicioDeSuCuenta() {
        RegistrationServices.verifyResults();

    }

    @And("^clickea el botón (.*)$")
    public void haceClickEnElBotonRegistrarse(String registro) {
        RegistrationServices.clickRegistrar(registro);

    }

    @And("^ingresa un email inválida en el campo Email (.+) e ingresa una contrasenia en el campo (.+)$")
    public void ingresaUnEmailInvalidaEnElCampoEmailEIngresaUnaContraseniaEnElCampo(String email, String pass) {
        RegistrationServices.enterUserCriteria(email);
        RegistrationServices.enterPassCriteria(pass);
    }

    @Then("^el sistema muestra un mensaje de advertencia que dice (.+)$")
    public void elSistemaMuestraUnMensajeDeAdvertenciaQueDice(String text) {
        RegistrationServices.verifyMesageError(text);

    }

    @And("^hace click en el boton (.+)$")
    public void haceClickEnElBotonDeRegistarse(String registro) throws InterruptedException {
        MyAccountServices.mapsMyAccount(registro);
    }
}
