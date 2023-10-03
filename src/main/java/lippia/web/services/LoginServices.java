package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.LoginConstants.INVALID_USER;
import static lippia.web.constants.MyAccountConstants.INPUT_PASSWORD;
import static lippia.web.constants.MyAccountConstants.INPUT_USER;

public class LoginServices extends ActionManager {
    public static void usuario(String user){
        WebActionManager.setInput(INPUT_USER,user);
    }
    public static void contrasenia(String password){
        WebActionManager.setInput(INPUT_PASSWORD,password);
    }
    public static void verifyErrorAddress(String text) {
        String locator = getElement(String.format(INVALID_USER, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text,"El Text esperado no es el mismo que el actual: ");
    }

}
